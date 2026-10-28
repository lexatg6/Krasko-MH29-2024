package geometry;

public class Testing {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		
			p1.setX(50);
			p1.setY(30);
	//     (50,0)
	//	    System.out.println(p1.getX());
	//		System.out.println(p1.getY());
	//		System.out.println(p1.isSelected());
		
		Point p2 = new Point();
		p2.setX(30);
		p2.setY(30);
		// (0,30)
		// 50*50 + 30*30 = 3400
		System.out.println(p1.distance(p2));
		
		p1 = p2;
	//	p2 = p1;
		
		p1.setX(200);
		p2.setY(100);
				
		  // Vezba 3
		
		//line l1 = new line();
		//l1.setStartPoint(p1);
		//l1.setEndPoint(new Point());
		//System.out.println(l1.getstartPoint());
		//System.out.println(l1.getEndPoint());
		//System.out.println(l1.isSelected());
		//System.out.println(l1.getstartPoint().getX());
		
		
		// Vezba 4
		Rectangle r1 = new Rectangle();
		r1.setUpperLeft(p1);
		System.out.println(r1.getUpperLeft());
		System.out.println(r1.getWidth());
		System.out.println(r1.getHeigth());
		System.out.println(r1.isSelected());
		
	   System.out.println("Obim je " +r1.circumference()  );
	   System.out.println("Povrsina je " +r1.area()  );
		
		

	}

}
