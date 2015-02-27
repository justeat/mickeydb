package com.justeat.mickeydb.generator;

import java.util.LinkedHashMap;

public class DbInfo {
	public LinkedHashMap<String, TableInfo> tables = new LinkedHashMap<String, TableInfo>();

	public String packageName;

	public LinkedHashMap<String, ViewInfo> views = new LinkedHashMap<String, ViewInfo>();
}
