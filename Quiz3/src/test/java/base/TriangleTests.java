package base;

//Adam Caulfield
//adamic

import static org.junit.Assert.*;
import java.math.*;

import org.junit.Test;

public class TriangleTests {

	Triangle t1 = new Triangle();
	Triangle t2 = new Triangle(3.0,4.0,5.0); //3,4,5 triangles are special
	
	/**
	 * I calculated the area and perimeter for the two triangles I created above using geometry. I then
	 * created these variables based off the answers I got from those calculations.
	 * I did this so that I did not have any magic values in the code
	 * 
	 * defaultSideLength corresponds to the sides of a triangle created with the default constructor
	 * 
	 * area1 and perimeter1 correspond to the first triangle (t1)
	 * 
	 * area2 and perimeter2 correspond to the second triangle (t2)
	 */
	double defaultSideLength = 1.0;
	double area1 = (Math.sqrt(3.0))/4; //This gives an exact value vs. a decimal version of squareroot of 3 divided by 4
	double area2 = 6.0;
	double perimeter1 = 3.0;
	double perimeter2 = 12.0;
	
	
	
	@Test
	public void defaultConstructor() {
		//This test was to make sure that the default constructor created a correct triangle
		assert(t1.getSide1()==defaultSideLength && t1.getSide2()==defaultSideLength && t1.getSide1()==defaultSideLength);
	}

	@Test
	public void testAreaMethod1(){
		assert(t1.getArea() == area1); 
	}
	
	@Test
	public void testAreaMethod2(){
		assert(t2.getArea() == area2); 
	}
	
	@Test
	public void testPerimeterMethod1(){
		assert(t1.getPerimeter() == perimeter1);
	}
	
	@Test
	public void testPerimeterMethod2(){
		assert(t2.getPerimeter() == perimeter2);
	}
}
