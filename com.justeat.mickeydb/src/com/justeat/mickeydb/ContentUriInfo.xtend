package com.justeat.mickeydb

import org.eclipse.xtend.lib.annotations.Accessors
import com.justeat.mickeydb.mickeyLang.TableDefinition
import com.justeat.mickeydb.mickeyLang.ActionStatement

class ContentUriInfo {
	@Accessors String id
	@Accessors String name
	@Accessors boolean directory
	@Accessors String type
	@Accessors TableDefinition typeRef
	@Accessors String pathPattern
	@Accessors boolean userDefined
	@Accessors boolean supportsActiveRecord
	@Accessors ActionStatement action
}