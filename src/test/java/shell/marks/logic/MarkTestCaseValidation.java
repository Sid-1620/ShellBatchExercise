package shell.marks.logic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import shell.calculator.logic.CalcSample;

public class MarkTestCaseValidation {
	MarkSample Mark;
	//This gets executed before each method/testcase
	@Before
	public void thisIsBeforeAnnotation() {
		Mark=new MarkSample();
		
	}

	@Test
	public void validatfail() {
		String expectedResult="fail";
		String actualResult=Mark.fail(30);
		Assert.assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void validatethirdclass() {
		String expectedResult="3rd class";
		String actualResult=Mark.thirdclass(40);
		Assert.assertEquals(expectedResult,actualResult);
	}
	@Test
	public void validatesecondclass() {
		String expectedResult="2nd class";
		String actualResult=Mark.secondclass(60);
		Assert.assertEquals(expectedResult,actualResult);
	}
	@Test
	public void validatefirstclass() {
		String expectedResult="1st class";
		String actualResult=Mark.firstclass(90);
		Assert.assertEquals(expectedResult,actualResult);
	}
	@After
	public void tearDown() {
		System.out.println("Tetscase is completed");
	}
 

}
