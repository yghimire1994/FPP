package four;

final class Square {
	private double radius;
	
	public Square(double radius) {
		this.radius=radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
		
	}
	public double getradius()
	{
		return radius;
	}
	
	
public double computeArea() {
		
		return Math.PI*radius*radius;

}
}
