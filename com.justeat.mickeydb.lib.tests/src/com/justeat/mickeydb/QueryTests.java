package com.justeat.mickeydb;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

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
	
	@Test
	public void testColumnEqualsIntegerExpression() {
		mQuery.eq("intCol", 42);
		
		assertEquals("intCol = ?" , mQuery.toString());
		assertArrayEquals(new String[] { "42" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnEqualsLongExpression() {
		mQuery.eq("longCol", 123L);
		assertEquals("longCol = ?" , mQuery.toString());
		assertArrayEquals(new String[] { "123" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnEqualsFloatExpression() {
		mQuery.eq("floatCol", 321f);
		assertEquals("floatCol = ?" , mQuery.toString());
		assertArrayEquals(new String[] { "321.0" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnEqualsDoubleExpression() {
		mQuery.eq("doubleCol", 12d);
		assertEquals("doubleCol = ?" , mQuery.toString());
		assertArrayEquals(new String[] { "12.0" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnEqualsStringExpression() {
		mQuery.eq("stringCol", "Hello, world");
		assertEquals("stringCol = ?" , mQuery.toString());
		assertArrayEquals(new String[] { "Hello, world" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnNotEqualsTrueExpression() {
		mQuery.neq("boolCol", true);
		
		assertEquals("boolCol != ?" , mQuery.toString());
		assertArrayEquals(new String[] { "1" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnNotEqualsFalseExpression() {
		mQuery.neq("boolCol", false);
		
		assertEquals("boolCol != ?" , mQuery.toString());
		assertArrayEquals(new String[] { "0" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnNotEqualsIntegerExpression() {
		mQuery.neq("intCol", 42);
		
		assertEquals("intCol != ?" , mQuery.toString());
		assertArrayEquals(new String[] { "42" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnNotEqualsLongExpression() {
		mQuery.neq("longCol", 123L);
		assertEquals("longCol != ?" , mQuery.toString());
		assertArrayEquals(new String[] { "123" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnNotEqualsFloatExpression() {
		mQuery.neq("floatCol", 321f);
		assertEquals("floatCol != ?" , mQuery.toString());
		assertArrayEquals(new String[] { "321.0" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnNotEqualsDoubleExpression() {
		mQuery.neq("doubleCol", 12d);
		assertEquals("doubleCol != ?" , mQuery.toString());
		assertArrayEquals(new String[] { "12.0" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnNotEqualsStringExpression() {
		mQuery.neq("stringCol", "Hello, world");
		assertEquals("stringCol != ?" , mQuery.toString());
		assertArrayEquals(new String[] { "Hello, world" }, mQuery.getArgsArray());
	}

	@Test
	public void testColumnGreaterThanTrueExpression() {
		mQuery.gt("boolCol", true);
		
		assertEquals("boolCol > ?" , mQuery.toString());
		assertArrayEquals(new String[] { "1" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnGreaterThanFalseExpression() {
		mQuery.gt("boolCol", false);
		
		assertEquals("boolCol > ?" , mQuery.toString());
		assertArrayEquals(new String[] { "0" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnGreaterThanIntegerExpression() {
		mQuery.gt("intCol", 42);
		
		assertEquals("intCol > ?" , mQuery.toString());
		assertArrayEquals(new String[] { "42" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnGreaterThanLongExpression() {
		mQuery.gt("longCol", 123L);
		assertEquals("longCol > ?" , mQuery.toString());
		assertArrayEquals(new String[] { "123" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnGreaterThanFloatExpression() {
		mQuery.gt("floatCol", 321f);
		assertEquals("floatCol > ?" , mQuery.toString());
		assertArrayEquals(new String[] { "321.0" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnGreaterThanDoubleExpression() {
		mQuery.gt("doubleCol", 12d);
		assertEquals("doubleCol > ?" , mQuery.toString());
		assertArrayEquals(new String[] { "12.0" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnGreaterThanStringExpression() {
		mQuery.gt("stringCol", "Hello, world");
		assertEquals("stringCol > ?" , mQuery.toString());
		assertArrayEquals(new String[] { "Hello, world" }, mQuery.getArgsArray());
	}

	@Test
	public void testColumnLessThanTrueExpression() {
		mQuery.lt("boolCol", true);
		
		assertEquals("boolCol < ?" , mQuery.toString());
		assertArrayEquals(new String[] { "1" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnLessThanFalseExpression() {
		mQuery.lt("boolCol", false);
		
		assertEquals("boolCol < ?" , mQuery.toString());
		assertArrayEquals(new String[] { "0" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnLessThanIntegerExpression() {
		mQuery.lt("intCol", 42);
		
		assertEquals("intCol < ?" , mQuery.toString());
		assertArrayEquals(new String[] { "42" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnLessThanLongExpression() {
		mQuery.lt("longCol", 123L);
		assertEquals("longCol < ?" , mQuery.toString());
		assertArrayEquals(new String[] { "123" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnLessThanFloatExpression() {
		mQuery.lt("floatCol", 321f);
		assertEquals("floatCol < ?" , mQuery.toString());
		assertArrayEquals(new String[] { "321.0" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnLessThanDoubleExpression() {
		mQuery.lt("doubleCol", 12d);
		assertEquals("doubleCol < ?" , mQuery.toString());
		assertArrayEquals(new String[] { "12.0" }, mQuery.getArgsArray());
	}
	
	@Test
	public void testColumnLessThanStringExpression() {
		mQuery.lt("stringCol", "Hello, world");
		assertEquals("stringCol < ?" , mQuery.toString());
		assertArrayEquals(new String[] { "Hello, world" }, mQuery.getArgsArray());
	}
}
