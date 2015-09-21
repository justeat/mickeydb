package com.justeat.mickeydb

import static extension com.justeat.mickeydb.ModelUtil.*
import static extension com.justeat.mickeydb.Strings.*
import java.util.ArrayList
import com.justeat.mickeydb.mickeyLang.ContentUri
import com.justeat.mickeydb.mickeyLang.ContentUriParamSegment
import com.justeat.mickeydb.mickeyLang.ColumnType

class ContentUris {
	public var ArrayList<ContentUriInfo> uris = new ArrayList<ContentUriInfo>
	
	def init(MickeyDatabaseModel model) {
		for(tbl : model.snapshot.tables) {
			var info = new ContentUriInfo
			info.id = tbl.name.underscore.toUpperCase
			info.pathPattern = tbl.name
			info.directory = true
			info.type = tbl.name
			info.typeRef = tbl
			info.supportsActiveRecord = tbl.hasAndroidPrimaryKey
			uris.add(info)
			
			if(tbl.hasAndroidPrimaryKey) {
				var infoItem = new ContentUriInfo
				infoItem.id = tbl.name.underscore.toUpperCase + "_ID"
				infoItem.pathPattern = tbl.name + "/#"
				infoItem.directory = false
				infoItem.type = tbl.name
				infoItem.typeRef = tbl
				infoItem.supportsActiveRecord = tbl.hasAndroidPrimaryKey
				uris.add(infoItem)
			}			
		}
		
		for(vw : model.snapshot.views) {
			var info = new ContentUriInfo
			info.id = vw.name.underscore.toUpperCase
			info.pathPattern = vw.name
			info.directory = true
			info.type = vw.name
			info.typeRef = vw
			info.supportsActiveRecord = vw.hasAndroidPrimaryKey
			uris.add(info)
			
			if(vw.hasAndroidPrimaryKey) {
				var infoItem = new ContentUriInfo
				infoItem.id = vw.name.underscore.toUpperCase + "_ID"
				infoItem.pathPattern = vw.name + "/#"
				infoItem.directory = false
				infoItem.type = vw.name
				infoItem.typeRef = vw
				infoItem.supportsActiveRecord = vw.hasAndroidPrimaryKey
				uris.add(infoItem)
			}			
		}
		
		for(tbl : model.initTables) {
			var info = new ContentUriInfo
			info.id = tbl.name.underscore.toUpperCase
			info.pathPattern = tbl.name
			info.directory = true
			info.type = tbl.name
			info.typeRef = tbl
			info.supportsActiveRecord = tbl.hasAndroidPrimaryKey
			uris.add(info)
			
			if(tbl.hasAndroidPrimaryKey) {
				var infoItem = new ContentUriInfo
				infoItem.id = tbl.name.underscore.toUpperCase + "_ID"
				infoItem.pathPattern = tbl.name + "/#"
				infoItem.directory = false
				infoItem.type = tbl.name
				infoItem.typeRef = tbl
				infoItem.supportsActiveRecord = tbl.hasAndroidPrimaryKey
				
				uris.add(infoItem)
			}			
		}
		
		for(vw : model.initViews) {
			var info = new ContentUriInfo
			info.id = vw.name.underscore.toUpperCase
			info.pathPattern = vw.name
			info.directory = true
			info.type = vw.name
			info.typeRef = vw
			info.supportsActiveRecord = vw.hasAndroidPrimaryKey
			uris.add(info)
			
			if(vw.hasAndroidPrimaryKey) {
				var infoItem = new ContentUriInfo
				infoItem.id = vw.name.underscore.toUpperCase + "_ID"
				infoItem.pathPattern = vw.name + "/#"
				infoItem.directory = false
				infoItem.type = vw.name
				infoItem.typeRef = vw
				infoItem.supportsActiveRecord = vw.hasAndroidPrimaryKey
				uris.add(infoItem)
			}			
		}
		
		// Prune automagic actions if they exist
		for(a : model.actions) {
			var toRemove = uris.filter[item | item.type.equals(a.type.name)]
			uris.removeAll(toRemove)
		}
		
		for(a : model.actions) {
			var info = new ContentUriInfo
			info.action = a
			info.id = a.name.underscore.toUpperCase
			info.name = a.name
			info.pathPattern = a.uri.asString
			info.directory = !a.unique
			info.type = a.type.name
			info.typeRef = a.type
			info.userDefined = true
			info.supportsActiveRecord = a.type.hasAndroidPrimaryKey
			uris.add(info)			
		}
		
		for(f : model.functions) {
			var info = new ContentUriInfo
			info.id = f.name.underscore.toUpperCase
			info.pathPattern = "_func/" + f.name
			info.directory = true
			info.type = f.type.name
			info.typeRef = f.type
			uris.add(info)			
		}
	}
	
	def asString(ContentUri uri) {
		var builder = new StringBuilder()
		var skipSlash = true
		for(seg : uri.segments) {
			if(!skipSlash) builder.append("/")
			if(seg instanceof ContentUriParamSegment) {
				var paramSeg = seg as ContentUriParamSegment
				
				if(paramSeg.param.inferredColumnType == ColumnType::TEXT) {
					builder.append("*")
				} else {
					builder.append("#")
				}
				
			} else {
				builder.append(seg.name)
			}
			skipSlash = false
		}
		
		return builder.toString
	}
}