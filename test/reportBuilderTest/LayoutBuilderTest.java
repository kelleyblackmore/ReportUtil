package reportBuilderTest;

import static org.junit.Assert.*;

import org.junit.Test;

import reportBuilder.LayoutBuilder;

public class LayoutBuilderTest {
 LayoutBuilder lb = new LayoutBuilder();
 
 
 
 @Test
 public void contructortest(){
	 LayoutBuilder lb1 = new LayoutBuilder(5);
	 LayoutBuilder lb2 = new LayoutBuilder();
	equals(lb1.equals(lb2));
 }
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
