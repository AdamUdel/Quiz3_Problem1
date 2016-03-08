package base;

//by Adam Caulfield
//adamic

public class Triangle {
	
	private double side1;
	private double side2;
	private double side3;
	
	Triangle(){
	//Default constructor
	//Assigns each side to 1.0

		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	Triangle(double s1, double s2, double s3){
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}

	//Public getter for side1
	public double getSide1() {
		return side1;
	}
	//Public setter for side1
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	//Public getter for side2
	public double getSide2() {
		return side2;
	}
	//Public setter for side2
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	//Public getter for side3
	public double getSide3() {
		return side3;
	}
	//Public setter for side3
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	/**This method uses the sides of each triangle to calculate
		the area of that specific triangle
		
	 *	Parameters: none
	 *	Returns: double
	 **/
	public double getArea(){
		//based off of Heron's formula for Area of a Triangle
		double s = (side1+side2+side3)/2;
		double A = (s*(s-side1)*(s-side2)*(s-side3));
		return(A);
		
	}
	
	/**This method uses the sides of the triangle to calculate
		the Perimeter of that triangle
	
		Parameters: none
		Returns: double
	**/
	public double getPerimeter(){
		double P = side1+side2+side3;
		return(P);
	}
	
	/**This method returns a string hat describes the Triangle
	
	*	Parameters: none
	*	Returns: String
	**/
	public String toString(){
		double A = this.getArea();
		double P = this.getPerimeter();
		
		String d1 = "This triangle has sides of length "+side1+","+side2+" and "+side3;
		String d2 = "\nIt has an area of "+A+" and a perimeter of "+P;
		String description = d1+d2;
		
		return(description);
	}
	
	
}
