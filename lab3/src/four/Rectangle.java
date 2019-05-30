package four;

final class Rectangle {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		
		this.width=width;
		this.length=length;
	}
	
	public void setWidth(double width) {
		this.width=width;
	}

	public void setLength(double length) {
		this.length=length;
	}
	
	
	public double getWidth() {
		return width;
		
	}
	
	public double getLength() {
		return length;
	}
	
	public double computeArea() {
		
		return width*length;
	}

}
