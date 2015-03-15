package com.justeat.mickeydb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowContext;

@Config(manifest=Config.NONE)
@RunWith(RobolectricTestRunner.class)
public class QueryTests {

	Query mQuery;
	
	@Before
	public void setUp() throws Exception {
		mQuery = new Query(RuntimeEnvironment.application, null);
	}

	@Test
	public void testColumnEqualsTrueExpression() {
		mQuery.eq("boolCol", true);
		
		assertEquals("boolCol = ?" , mQuery.toString());
		assertArrayEquals(new String[] { "1" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnEqualsFalseExpression() {
		mQuery.eq("boolCol", false);
		
		assertEquals("boolCol = ?" , mQuery.toString());
		assertArrayEquals(new String[] { "0" }, mQuery.getArgsArray());
	}
}
