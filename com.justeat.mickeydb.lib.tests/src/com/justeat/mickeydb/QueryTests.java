package com.justeat.mickeydb;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import com.justeat.mickeydb.Query.Literal;

@Config(manifest=Config.NONE)
@RunWith(RobolectricTestRunner.class)
public class QueryTests {

	Query mQuery;
	
	@Before
	public void setUp() throws Exception {
		Mickey.init(RuntimeEnvironment.application);
		mQuery = new Query(null);
	}

	public static void assertQuery(Query query, String selection, String[] args, boolean resetOnComplete) {
		assertEquals(selection , query.toString());
		assertArrayEquals(args, query.getArgsArray());
		
		if(resetOnComplete) {
			query.reset();
		}
	}
	
	public static void assertQuery(Query query, String selection, String[] args) {
		assertQuery(query, selection, args, true);
	}

	@Test
	public void testEq() {
		assertQuery(mQuery.eq("a", true), "a = ?", new String[] { "1" });
		assertQuery(mQuery.eq("b", false), "b = ?", new String[] { "0" });
		assertQuery(mQuery.eq("c", 42), "c = ?", new String[] { "42" });
		assertQuery(mQuery.eq("d", 123L), "d = ?", new String[] { "123" });
		assertQuery(mQuery.eq("e", 321f), "e = ?", new String[] { "321.0" });
		assertQuery(mQuery.eq("f", 12d), "f = ?", new String[] { "12.0" });
		assertQuery(mQuery.eq("g", "Hello, world"), "g = ?", new String[] { "Hello, world" });
		assertQuery(mQuery.eq("h", Query.NULL), "h = NULL", new String[] {});
		assertQuery(mQuery.eq("i", Query.CURRENT_DATE), "i = CURRENT_DATE", new String[] {});
		assertQuery(mQuery.eq("j", Query.CURRENT_TIME), "j = CURRENT_TIME", new String[] {});
		assertQuery(mQuery.eq("k", Query.CURRENT_TIMESTAMP), "k = CURRENT_TIMESTAMP", new String[] {});
	}
	
	@Test
	public void testNeq() {
		assertQuery(mQuery.neq("a", true), "a != ?", new String[] { "1" });
		assertQuery(mQuery.neq("b", false), "b != ?", new String[] { "0" });
		assertQuery(mQuery.neq("c", 42), "c != ?", new String[] { "42" });
		assertQuery(mQuery.neq("d", 123L), "d != ?", new String[] { "123" });
		assertQuery(mQuery.neq("e", 321f), "e != ?", new String[] { "321.0" });
		assertQuery(mQuery.neq("f", 12d), "f != ?", new String[] { "12.0" });
		assertQuery(mQuery.neq("g", "Hello, world"), "g != ?", new String[] { "Hello, world" });
		assertQuery(mQuery.neq("h", Query.NULL), "h != NULL", new String[] {});
		assertQuery(mQuery.neq("i", Query.CURRENT_DATE), "i != CURRENT_DATE", new String[] {});
		assertQuery(mQuery.neq("j", Query.CURRENT_TIME), "j != CURRENT_TIME", new String[] {});
		assertQuery(mQuery.neq("k", Query.CURRENT_TIMESTAMP), "k != CURRENT_TIMESTAMP", new String[] {});		
	}
	
	@Test
	public void testGt() {
		assertQuery(mQuery.gt("a", true), "a > ?", new String[] { "1" });
		assertQuery(mQuery.gt("b", false), "b > ?", new String[] { "0" });
		assertQuery(mQuery.gt("c", 42), "c > ?", new String[] { "42" });
		assertQuery(mQuery.gt("d", 123L), "d > ?", new String[] { "123" });
		assertQuery(mQuery.gt("e", 321f), "e > ?", new String[] { "321.0" });
		assertQuery(mQuery.gt("f", 12d), "f > ?", new String[] { "12.0" });
		assertQuery(mQuery.gt("g", "Hello, world"), "g > ?", new String[] { "Hello, world" });
		assertQuery(mQuery.gt("h", Query.NULL), "h > NULL", new String[] {});
		assertQuery(mQuery.gt("i", Query.CURRENT_DATE), "i > CURRENT_DATE", new String[] {});
		assertQuery(mQuery.gt("j", Query.CURRENT_TIME), "j > CURRENT_TIME", new String[] {});
		assertQuery(mQuery.gt("k", Query.CURRENT_TIMESTAMP), "k > CURRENT_TIMESTAMP", new String[] {});	
	}
	
	@Test
	public void testLt() {
		assertQuery(mQuery.lt("a", true), "a < ?", new String[] { "1" });
		assertQuery(mQuery.lt("b", false), "b < ?", new String[] { "0" });
		assertQuery(mQuery.lt("c", 42), "c < ?", new String[] { "42" });
		assertQuery(mQuery.lt("d", 123L), "d < ?", new String[] { "123" });
		assertQuery(mQuery.lt("e", 321f), "e < ?", new String[] { "321.0" });
		assertQuery(mQuery.lt("f", 12d), "f < ?", new String[] { "12.0" });
		assertQuery(mQuery.lt("g", "Hello, world"), "g < ?", new String[] { "Hello, world" });
		assertQuery(mQuery.lt("h", Query.NULL), "h < NULL", new String[] {});
		assertQuery(mQuery.lt("i", Query.CURRENT_DATE), "i < CURRENT_DATE", new String[] {});
		assertQuery(mQuery.lt("j", Query.CURRENT_TIME), "j < CURRENT_TIME", new String[] {});
		assertQuery(mQuery.lt("k", Query.CURRENT_TIMESTAMP), "k < CURRENT_TIMESTAMP", new String[] {});	
	}
	
	@Test
	public void testGteq() {
		assertQuery(mQuery.gteq("a", true), "a >= ?", new String[] { "1" });
		assertQuery(mQuery.gteq("b", false), "b >= ?", new String[] { "0" });
		assertQuery(mQuery.gteq("c", 42), "c >= ?", new String[] { "42" });
		assertQuery(mQuery.gteq("d", 123L), "d >= ?", new String[] { "123" });
		assertQuery(mQuery.gteq("e", 321f), "e >= ?", new String[] { "321.0" });
		assertQuery(mQuery.gteq("f", 12d), "f >= ?", new String[] { "12.0" });
		assertQuery(mQuery.gteq("g", "Hello, world"), "g >= ?", new String[] { "Hello, world" });
		assertQuery(mQuery.gteq("h", Query.NULL), "h >= NULL", new String[] {});
		assertQuery(mQuery.gteq("i", Query.CURRENT_DATE), "i >= CURRENT_DATE", new String[] {});
		assertQuery(mQuery.gteq("j", Query.CURRENT_TIME), "j >= CURRENT_TIME", new String[] {});
		assertQuery(mQuery.gteq("k", Query.CURRENT_TIMESTAMP), "k >= CURRENT_TIMESTAMP", new String[] {});	
	}
	
	@Test
	public void testLteq() {
		assertQuery(mQuery.lteq("a", true), "a <= ?", new String[] { "1" });
		assertQuery(mQuery.lteq("b", false), "b <= ?", new String[] { "0" });
		assertQuery(mQuery.lteq("c", 42), "c <= ?", new String[] { "42" });
		assertQuery(mQuery.lteq("d", 123L), "d <= ?", new String[] { "123" });
		assertQuery(mQuery.lteq("e", 321f), "e <= ?", new String[] { "321.0" });
		assertQuery(mQuery.lteq("f", 12d), "f <= ?", new String[] { "12.0" });
		assertQuery(mQuery.lteq("g", "Hello, world"), "g <= ?", new String[] { "Hello, world" });
		assertQuery(mQuery.lteq("h", Query.NULL), "h <= NULL", new String[] {});
		assertQuery(mQuery.lteq("i", Query.CURRENT_DATE), "i <= CURRENT_DATE", new String[] {});
		assertQuery(mQuery.lteq("j", Query.CURRENT_TIME), "j <= CURRENT_TIME", new String[] {});
		assertQuery(mQuery.lteq("k", Query.CURRENT_TIMESTAMP), "k <= CURRENT_TIMESTAMP", new String[] {});	
	}
	
	@Test
	public void testLike() {
		assertQuery(mQuery.like("g", "Hello, world"), "g LIKE ?", new String[] { "Hello, world" });	
	}	
	
	@Test
	public void testIs() {
		assertQuery(mQuery.is("a", true), "a IS ?", new String[] { "1" });
		assertQuery(mQuery.is("b", false), "b IS ?", new String[] { "0" });
		assertQuery(mQuery.is("c", 42), "c IS ?", new String[] { "42" });
		assertQuery(mQuery.is("d", 123L), "d IS ?", new String[] { "123" });
		assertQuery(mQuery.is("e", 321f), "e IS ?", new String[] { "321.0" });
		assertQuery(mQuery.is("f", 12d), "f IS ?", new String[] { "12.0" });
		assertQuery(mQuery.is("g", "Hello, world"), "g IS ?", new String[] { "Hello, world" });
		assertQuery(mQuery.is("h", Query.NULL), "h IS NULL", new String[] {});
		assertQuery(mQuery.is("i", Query.CURRENT_DATE), "i IS CURRENT_DATE", new String[] {});
		assertQuery(mQuery.is("j", Query.CURRENT_TIME), "j IS CURRENT_TIME", new String[] {});
		assertQuery(mQuery.is("k", Query.CURRENT_TIMESTAMP), "k IS CURRENT_TIMESTAMP", new String[] {});	
	}
	
	@Test
	public void testIsNot() {
		assertQuery(mQuery.isNot("a", true), "a IS NOT ?", new String[] { "1" });
		assertQuery(mQuery.isNot("b", false), "b IS NOT ?", new String[] { "0" });
		assertQuery(mQuery.isNot("c", 42), "c IS NOT ?", new String[] { "42" });
		assertQuery(mQuery.isNot("d", 123L), "d IS NOT ?", new String[] { "123" });
		assertQuery(mQuery.isNot("e", 321f), "e IS NOT ?", new String[] { "321.0" });
		assertQuery(mQuery.isNot("f", 12d), "f IS NOT ?", new String[] { "12.0" });
		assertQuery(mQuery.isNot("g", "Hello, world"), "g IS NOT ?", new String[] { "Hello, world" });
		assertQuery(mQuery.isNot("h", Query.NULL), "h IS NOT NULL", new String[] {});
		assertQuery(mQuery.isNot("i", Query.CURRENT_DATE), "i IS NOT CURRENT_DATE", new String[] {});
		assertQuery(mQuery.isNot("j", Query.CURRENT_TIME), "j IS NOT CURRENT_TIME", new String[] {});
		assertQuery(mQuery.isNot("k", Query.CURRENT_TIMESTAMP), "k IS NOT CURRENT_TIMESTAMP", new String[] {});	
	}
	
	@Test
	public void testRegexp() {
		assertQuery(mQuery.regexp("g", "Hello, world"), "g REGEXP ?", new String[] { "Hello, world" });
	}
}
