package Original;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
	private Money money1, money2, money3, money4, money5;
		
	@Before
	public void setUp() throws Exception {
		money1 = new Money (10, "USD");
		money2 = new Money (10, "EUR");
		money3 = new Money (20, "GBP");
		money4 = new Money (20, "USD");
		money5 = new Money (10, "USD");
			
		
	}

	@Test
	public void testGetAmount(){
		assertEquals(10, money1.getAmount());
	}
	
	@Test
	public void testGetCurrency(){
		assertEquals("EUR", money2.getCurrency());
	}
	
	@Test
	public void amountsEqualAndCurrencyNotEqual() {
		assertFalse(money1.equals(money2));				
	}
	
	@Test
	public void amountsNotEqualAndCurrencyNotEqual() {
		assertFalse(money1.equals(money3));				
	}

	@Test
	public void amountsNotEqualAndCurrencyEqual() {
		assertFalse(money1.equals(money4));				
	}
	
	@Test
	public void amountsEqualAndCurrencyEqual() {
		assertTrue(money1.equals(money5));				
	}
	
	@Test
	public void notEqualNonMoneyObject() {
		String s = new String("money");
		assertFalse(money1.equals(s));		
		
	}
	
	
}


//
//
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//public class StudentGradeTest {
//	
//	@Test
//	public void testMark90() {
//		
//		StudentGrade sg = new StudentGrade(90);
//		assertEquals(90,sg.getMark());
//		assertEquals('A',sg.convertGrade());	
//	}
//
//	
//	@Test
//	public void testMark80() {
//		
//		StudentGrade sg = new StudentGrade(80);
//		assertEquals(80,sg.getMark());
//		assertEquals('B',sg.convertGrade());	
//	}
//	
//	@Test
//	public void testMark60() {
//		
//		StudentGrade sg = new StudentGrade(60);
//		assertEquals(60,sg.getMark());
//		assertEquals('C',sg.convertGrade());	
//	}
//	
//	
//	
//	@Test
//	public void testMark40() {
//		
//		StudentGrade sg = new StudentGrade(40);
//		assertEquals(40,sg.getMark());
//		assertEquals('D',sg.convertGrade());	
//	}
//	
//	@Test
//	public void testMark30() {
//		
//		StudentGrade sg = new StudentGrade(30);
//		assertEquals(30,sg.getMark());
//		assertEquals('E',sg.convertGrade());	
//	}
//	
//	@Test
//	public void testMark10() {
//		
//		StudentGrade sg = new StudentGrade(10);
//		assertEquals(10,sg.getMark());
//		assertEquals('F',sg.convertGrade());	
//	}
//	
//
//}
