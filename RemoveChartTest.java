import static org.junit.Assert.*;


import org.junit.Test;


public class RemoveChartTest {

	RemoveChart rm ;
	//Check if the length of the string is zero
	@Test
	public void testLengthOfStrPassedZero() {		
		assertEquals("should run null" , "",RemoveChart.removeCh("", 'l'));
	}
	//Check if the remove char is at the beginning of string how your method will work
	@Test
	public void testRemovechaAtthebeigningofst(){
		assertEquals( "abc",RemoveChart.removeCh("dabc", 'd'));
	}
	//Check if we pass null char
	@Test
	public void testPasschaAsNu(){
		assertEquals( "dabc",RemoveChart.removeCh("dabc", ' '));
	}
	//check if all the char in the string equals to remove char
	@Test
	public void testSameCharst(){
		assertEquals( "",RemoveChart.removeCh("ddddd", 'd'));
	}
	//check if the remove char is at present at the last of string	
	@Test
	public void testLastCharst(){
		assertEquals( "anhjk",RemoveChart.removeCh("anhjkd", 'd'));
	}
	//Test if we pass only one char in string same as remove char
	@Test
	public void OneCharst(){
		assertEquals( "",RemoveChart.removeCh("a", 'a'));
	}
	//When char is not present in String	
	@Test
	public void NotPresentCharst(){
		assertEquals( "abcd",RemoveChart.removeCh("abcd", 'e'));
	}
	
}
