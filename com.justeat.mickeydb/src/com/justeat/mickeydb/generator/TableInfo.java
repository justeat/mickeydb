package com.justeat.mickeydb.generator;

import java.util.LinkedHashMap;

import com.justeat.mickeydb.mickeyLang.CreateTableStatement;

public class TableInfo {
	public LinkedHashMap<String, ColumnInfo> columns = new LinkedHashMap<String, ColumnInfo>();
	
	public String name;

	public boolean hasAndroidPrimaryKey;

	public CreateTableStatement obj;

}
