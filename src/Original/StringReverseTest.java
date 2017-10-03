package Original;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringReverseTest {
	private String s1,s2,s3,s4,s5,s6,s7;
	@Before
	public void setUp() throws Exception {
		s1 = new String("");
		s2 = new String("UPPER");
		s3 = new String("AbCd");
		s4 = new String(" ");
		s5 = new String("!test@gmail.com");
		s6 = new String("alula");
		s7 = new String("19390021");
	}

	@Test
	public void testReverse() {
		assertEquals("", StringReverse.reverse(s1));
		assertEquals("REPPU", StringReverse.reverse(s2));
		assertEquals("dCbA", StringReverse.reverse(s3));
		assertEquals(" ", StringReverse.reverse(s4));
		assertEquals("moc.liamg@tset!", StringReverse.reverse(s5));
		assertEquals("alula", StringReverse.reverse(s6));
		assertEquals("12009391", StringReverse.reverse(s7));
		
	}

}
