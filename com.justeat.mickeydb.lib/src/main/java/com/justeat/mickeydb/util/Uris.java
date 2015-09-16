package com.justeat.mickeydb.util;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import android.net.Uri;

public class Uris {
    public static Set<String> getQueryParameterNames(Uri uri) {
        if (uri.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }

        String query = uri.getEncodedQuery();
        if (query == null) {
            return Collections.emptySet();
        }

        Set<String> names = new LinkedHashSet<String>();
        int start = 0;
        do {
            int next = query.indexOf('&', start);
            int end = (next == -1) ? query.length() : next;

            int separator = query.indexOf('=', start);
            if (separator > end || separator == -1) {
                separator = end;
            }

            String name = query.substring(start, separator);
            names.add(Uri.decode(name));

            // Move start to end of name.
            start = end + 1;
        } while (start < query.length());

        return Collections.unmodifiableSet(names);
    }
    
    public static String getStringQueryParamOrDefault(Uri uri, Set<String> keys, String key) {
    	if(keys.contains(key)) {
    		return uri.getQueryParameter(key);
    	}
    	return null;
    }
    
    public static boolean getBooleanQueryParamOrDefault(Uri uri, Set<String> keys, String key) {
    	if(keys.contains(key)) {
    		return uri.getBooleanQueryParameter(key, false);
    	}
    	return false;
    }
    
    public static int getIntQueryParamOrDefault(Uri uri, Set<String> keys, String key) {
    	if(keys.contains(key)) {
    		return Integer.parseInt(uri.getQueryParameter(key));
    	}
    	return 0;
    }
    
    public static double getDoubleQueryParamOrDefault(Uri uri, Set<String> keys, String key) {
    	if(keys.contains(key)) {
    		return Double.parseDouble(uri.getQueryParameter(key));
    	}
    	return 0;
    }
}
