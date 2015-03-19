package com.justeat.mickeydb;

import static com.justeat.mickeydb.Mickey.initMickey;
import static com.justeat.mickeydb.Mickey.query;
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

	@Before
	public void setUp() throws Exception {
		initMickey(RuntimeEnvironment.application);
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
		assertQuery(query().eq("a", true), "a = ?", new String[] { "1" });
		assertQuery(query().eq("b", false), "b = ?", new String[] { "0" });
		assertQuery(query().eq("c", 42), "c = ?", new String[] { "42" });
		assertQuery(query().eq("d", 123L), "d = ?", new String[] { "123" });
		assertQuery(query().eq("e", 321f), "e = ?", new String[] { "321.0" });
		assertQuery(query().eq("f", 12d), "f = ?", new String[] { "12.0" });
		assertQuery(query().eq("g", "Hello, world"), "g = ?", new String[] { "Hello, world" });
		assertQuery(query().eq("h", Query.NULL), "h = NULL", new String[] {});
		assertQuery(query().eq("i", Query.CURRENT_DATE), "i = CURRENT_DATE", new String[] {});
		assertQuery(query().eq("j", Query.CURRENT_TIME), "j = CURRENT_TIME", new String[] {});
		assertQuery(query().eq("k", Query.CURRENT_TIMESTAMP), "k = CURRENT_TIMESTAMP", new String[] {});
	}
	
	@Test
	public void testNeq() {
		assertQuery(query().neq("a", true), "a != ?", new String[] { "1" });
		assertQuery(query().neq("b", false), "b != ?", new String[] { "0" });
		assertQuery(query().neq("c", 42), "c != ?", new String[] { "42" });
		assertQuery(query().neq("d", 123L), "d != ?", new String[] { "123" });
		assertQuery(query().neq("e", 321f), "e != ?", new String[] { "321.0" });
		assertQuery(query().neq("f", 12d), "f != ?", new String[] { "12.0" });
		assertQuery(query().neq("g", "Hello, world"), "g != ?", new String[] { "Hello, world" });
		assertQuery(query().neq("h", Query.NULL), "h != NULL", new String[] {});
		assertQuery(query().neq("i", Query.CURRENT_DATE), "i != CURRENT_DATE", new String[] {});
		assertQuery(query().neq("j", Query.CURRENT_TIME), "j != CURRENT_TIME", new String[] {});
		assertQuery(query().neq("k", Query.CURRENT_TIMESTAMP), "k != CURRENT_TIMESTAMP", new String[] {});		
	}
	
	@Test
	public void testGt() {
		assertQuery(query().gt("a", true), "a > ?", new String[] { "1" });
		assertQuery(query().gt("b", false), "b > ?", new String[] { "0" });
		assertQuery(query().gt("c", 42), "c > ?", new String[] { "42" });
		assertQuery(query().gt("d", 123L), "d > ?", new String[] { "123" });
		assertQuery(query().gt("e", 321f), "e > ?", new String[] { "321.0" });
		assertQuery(query().gt("f", 12d), "f > ?", new String[] { "12.0" });
		assertQuery(query().gt("g", "Hello, world"), "g > ?", new String[] { "Hello, world" });
		assertQuery(query().gt("h", Query.NULL), "h > NULL", new String[] {});
		assertQuery(query().gt("i", Query.CURRENT_DATE), "i > CURRENT_DATE", new String[] {});
		assertQuery(query().gt("j", Query.CURRENT_TIME), "j > CURRENT_TIME", new String[] {});
		assertQuery(query().gt("k", Query.CURRENT_TIMESTAMP), "k > CURRENT_TIMESTAMP", new String[] {});	
	}
	
	@Test
	public void testLt() {
		assertQuery(query().lt("a", true), "a < ?", new String[] { "1" });
		assertQuery(query().lt("b", false), "b < ?", new String[] { "0" });
		assertQuery(query().lt("c", 42), "c < ?", new String[] { "42" });
		assertQuery(query().lt("d", 123L), "d < ?", new String[] { "123" });
		assertQuery(query().lt("e", 321f), "e < ?", new String[] { "321.0" });
		assertQuery(query().lt("f", 12d), "f < ?", new String[] { "12.0" });
		assertQuery(query().lt("g", "Hello, world"), "g < ?", new String[] { "Hello, world" });
		assertQuery(query().lt("h", Query.NULL), "h < NULL", new String[] {});
		assertQuery(query().lt("i", Query.CURRENT_DATE), "i < CURRENT_DATE", new String[] {});
		assertQuery(query().lt("j", Query.CURRENT_TIME), "j < CURRENT_TIME", new String[] {});
		assertQuery(query().lt("k", Query.CURRENT_TIMESTAMP), "k < CURRENT_TIMESTAMP", new String[] {});	
	}
	
	@Test
	public void testGteq() {
		assertQuery(query().gteq("a", true), "a >= ?", new String[] { "1" });
		assertQuery(query().gteq("b", false), "b >= ?", new String[] { "0" });
		assertQuery(query().gteq("c", 42), "c >= ?", new String[] { "42" });
		assertQuery(query().gteq("d", 123L), "d >= ?", new String[] { "123" });
		assertQuery(query().gteq("e", 321f), "e >= ?", new String[] { "321.0" });
		assertQuery(query().gteq("f", 12d), "f >= ?", new String[] { "12.0" });
		assertQuery(query().gteq("g", "Hello, world"), "g >= ?", new String[] { "Hello, world" });
		assertQuery(query().gteq("h", Query.NULL), "h >= NULL", new String[] {});
		assertQuery(query().gteq("i", Query.CURRENT_DATE), "i >= CURRENT_DATE", new String[] {});
		assertQuery(query().gteq("j", Query.CURRENT_TIME), "j >= CURRENT_TIME", new String[] {});
		assertQuery(query().gteq("k", Query.CURRENT_TIMESTAMP), "k >= CURRENT_TIMESTAMP", new String[] {});	
	}
	
	@Test
	public void testLteq() {		
		assertQuery(query().lteq("a", true), "a <= ?", new String[] { "1" });
		assertQuery(query().lteq("b", false), "b <= ?", new String[] { "0" });
		assertQuery(query().lteq("c", 42), "c <= ?", new String[] { "42" });
		assertQuery(query().lteq("d", 123L), "d <= ?", new String[] { "123" });
		assertQuery(query().lteq("e", 321f), "e <= ?", new String[] { "321.0" });
		assertQuery(query().lteq("f", 12d), "f <= ?", new String[] { "12.0" });
		assertQuery(query().lteq("g", "Hello, world"), "g <= ?", new String[] { "Hello, world" });
		assertQuery(query().lteq("h", Query.NULL), "h <= NULL", new String[] {});
		assertQuery(query().lteq("i", Query.CURRENT_DATE), "i <= CURRENT_DATE", new String[] {});
		assertQuery(query().lteq("j", Query.CURRENT_TIME), "j <= CURRENT_TIME", new String[] {});
		assertQuery(query().lteq("k", Query.CURRENT_TIMESTAMP), "k <= CURRENT_TIMESTAMP", new String[] {});	
	}
	
	@Test
	public void testLike() {
		assertQuery(query().like("g", "Hello, world"), "g LIKE ?", new String[] { "Hello, world" });	
	}	
	
	@Test
	public void testIs() {
		assertQuery(query().is("a", true), "a IS ?", new String[] { "1" });
		assertQuery(query().is("b", false), "b IS ?", new String[] { "0" });
		assertQuery(query().is("c", 42), "c IS ?", new String[] { "42" });
		assertQuery(query().is("d", 123L), "d IS ?", new String[] { "123" });
		assertQuery(query().is("e", 321f), "e IS ?", new String[] { "321.0" });
		assertQuery(query().is("f", 12d), "f IS ?", new String[] { "12.0" });
		assertQuery(query().is("g", "Hello, world"), "g IS ?", new String[] { "Hello, world" });
		assertQuery(query().is("h", Query.NULL), "h IS NULL", new String[] {});
		assertQuery(query().is("i", Query.CURRENT_DATE), "i IS CURRENT_DATE", new String[] {});
		assertQuery(query().is("j", Query.CURRENT_TIME), "j IS CURRENT_TIME", new String[] {});
		assertQuery(query().is("k", Query.CURRENT_TIMESTAMP), "k IS CURRENT_TIMESTAMP", new String[] {});	
	}
	
	@Test
	public void testIsNot() {
		assertQuery(query().isNot("a", true), "a IS NOT ?", new String[] { "1" });
		assertQuery(query().isNot("b", false), "b IS NOT ?", new String[] { "0" });
		assertQuery(query().isNot("c", 42), "c IS NOT ?", new String[] { "42" });
		assertQuery(query().isNot("d", 123L), "d IS NOT ?", new String[] { "123" });
		assertQuery(query().isNot("e", 321f), "e IS NOT ?", new String[] { "321.0" });
		assertQuery(query().isNot("f", 12d), "f IS NOT ?", new String[] { "12.0" });
		assertQuery(query().isNot("g", "Hello, world"), "g IS NOT ?", new String[] { "Hello, world" });
		assertQuery(query().isNot("h", Query.NULL), "h IS NOT NULL", new String[] {});
		assertQuery(query().isNot("i", Query.CURRENT_DATE), "i IS NOT CURRENT_DATE", new String[] {});
		assertQuery(query().isNot("j", Query.CURRENT_TIME), "j IS NOT CURRENT_TIME", new String[] {});
		assertQuery(query().isNot("k", Query.CURRENT_TIMESTAMP), "k IS NOT CURRENT_TIMESTAMP", new String[] {});	
	}
	
	@Test
	public void testRegexp() {
		assertQuery(query().regexp("g", "Hello, world"), "g REGEXP ?", new String[] { "Hello, world" });
	}
	
	@Test
	public void testOrQuery() {
		assertQuery(query()
		.eq("a", true)
		.or()
		.eq("b", 123), 
		
		"a = ? OR b = ?", new String[] {"1", "123"});
	}
	
	@Test
	public void testOrQueryWithNestedExpression() {
		assertQuery(query()
		.eq("a", true)
		.or()
		.eq("b", 123)
		.or()
		.expr(query().eq("c", "Hello").or().gt("d", 5)), 
		
		"a = ? OR b = ? OR (c = ? OR d > ?)", new String[] {"1", "123", "Hello", "5"});
	}
	
	@Test
	public void testAppendQuery() {
		assertQuery(query()
		.eq("a", true)
		.or()
		.eq("b", 123)
		.append("c + d = ? AND (j = 123 OR j = ?)", new String[] { "42", "99"}), 
		
		"a = ? OR b = ? AND c + d = ? AND (j = 123 OR j = ?)", new String[] {"1", "123", "42", "99"});
	}
	
	@Test
	public void testAppendQueryThenAddMoreExpressions() {
		assertQuery(query()
		.eq("a", true)
		.or()
		.eq("b", 123)
		.append("c + d = ? AND (j = 123 OR j = ?)", new String[] { "42", "99"})
		.and()
		.neq("k", "Qux"), 
		"a = ? OR b = ? AND c + d = ? AND (j = 123 OR j = ?) AND k != ?", new String[] {"1", "123", "42", "99", "Qux"});
	}
	
	@Test
	public void testAppendQueryWithNoArguments() {
		assertQuery(query()
		.append("a = NULL"),
		"a = NULL", new String[] {});
	}
	
	@Test
	public void testAppendQueryWithNothing() {
		assertQuery(query()
	    .gt("a", 42)
		.append(""),
		"a > ?", new String[] { "42" });
	}
	
	@Test
	public void testAppendQueryWithNull() {
		assertQuery(query()
	    .gt("a", 42)
		.append(null)
		.lt("b", 84),
		"a > ? AND b < ?", new String[] { "42", "84" });
	}
}
