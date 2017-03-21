/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.justeat.mickeydb;

import java.lang.reflect.Field;

public class ReflectUtil {
	public static Class<?> loadClassSilently(ClassLoader cl, String name) {
		Class<?> clz;
		try {
			clz = cl.loadClass(name);
			return clz;
		} catch (ClassNotFoundException e) {
			return null;
		}
	}
	
	public static Field getFieldSilently(Class<?> clz, String fieldName) {
		try {
			return clz.getField(fieldName);
		} catch (NoSuchFieldException e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> Object getFieldValueSilently(Field field) {
		try {
			return (T) field.get(null);
		} catch (IllegalArgumentException e) {
		} catch (IllegalAccessException e) {
		}
		
		return null;
	}
}
