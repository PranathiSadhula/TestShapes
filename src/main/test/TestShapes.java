package main.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zeta.interview.Shape;



public class TestShapes {

	@Test
	public void testSquareShape() {
		Shape sqaure = new Shape("blue", 4, 4);
		Assert.assertEquals(sqaure.calculateArea(), 4*4);
	}
	
	@Test 
	public void testRectShape() {
		Shape rectangle = new Shape("blue", 4, 6);
		Assert.assertEquals(rectangle.calculateArea(), 4*6);
	}
	
	@Test
	public void testCircleShape() {
		Shape circle = new Shape("red", 4);
		Assert.assertEquals(circle.calculateCircleArea(), 3.14285714286 * 4 *4);
		
	}
	
	
	@Test 
	public void testCubeShape() {

		Shape cube = new Shape("black", 4, 4, 4);
		Assert.assertEquals(cube.calculateVolume(), 4 * 4 *4);
		
	}
	
	@Test
	public void testSphereShape() {
		Shape sphere = new Shape("pink", 4);
		Assert.assertEquals(sphere.calculateSphereVolume(),(4.0 / 3.0)* 3.14285714286 * 4 *4 * 4);
	}
	
	
	@Test
	public void testSquareWithVolume() {
		Shape sqaure = new Shape("blue", 4, 4);
		Assert.assertEquals(sqaure.calculateVolume(), 16);
	}
	
	
}
