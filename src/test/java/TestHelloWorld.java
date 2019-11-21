import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestHelloWorld {
	private HelloWorld subject=new  HelloWorld() ;
	
	/*@Before
	public void setup() {
		subject= new HelloWorld();
	}
	@Test
	public void testGetMessage(){
		assertEquals( "Hello World", subject.getMessage(null));
	}
	@Test
	public void testGetMessage2(){
		assertEquals( "Hello Eclipse", subject.getMessage("Eclipse"));
	}
*/
	@Test
	public void testSum(){
		assertTrue("verifier", subject.mult(1,3)== subject.sum(1,2));
	}
	/*@Test
	public void testMult(){
		assertEquals( 4, subject.mult(1,3));
	}*/
	
	
}