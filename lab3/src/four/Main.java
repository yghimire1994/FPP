package four;

final class Main {

	public static void main(String[] args) {
		
		Triangle objTri = new Triangle(20,30);
		System.out.println("Area of Triangle is: "+objTri.computeArea());
		Rectangle objRec = new Rectangle(20,30);
		System.out.println("Area of Rectangle is: " +objRec.computeArea());
		Square objSqu = new Square(20);
		System.out.println("Area of Rectangle is: " +objSqu.computeArea());
		// TODO Auto-generated method stub

	}

}
