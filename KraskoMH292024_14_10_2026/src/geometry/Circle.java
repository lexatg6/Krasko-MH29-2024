package geometry;

public class Circle {
	protected Point center;
	protected int radius;
	private boolean selected;
	
	public Circle() {
		
	}
	
	

public Circle(Point center, int radius) {
	this.center = center;
	this.radius = radius;
	
}
public Circle(Point center, int radius, boolean selected) {
	this(center,radius);
	this.selected = selected;
}

public boolean contains(int x, int y) {
	return center.distance(new Point(x,y)) <= radius;
	
}
public boolean contains(Point click) {
	return contains(click.getX(), click.getY());
}
@Override
public String toString() {
	return String.format("(%s, %s, %s)",
			center.getX(), center.getY(), radius);
}
public Point getCenter() {
	return center;
}
public void setCenter(Point center) {
	this.center = center;
}
public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
public boolean isSelected() {
	return selected;
}
public void setSelected(boolean selected) {
	this.selected = selected;
}

public double circumference() {
	return 2*radius*Math.PI;
}
public double area() {
	return radius*radius*Math.PI;
}

}

    


