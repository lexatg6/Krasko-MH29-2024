package geometry;

public class Circle {
	private Point center;
	private int radius;
	private boolean selected;
	
	
public Circle() {
    	
    }
public Circle(int radius) {
	this.radius = radius;
}
public Circle(int radius, boolean selected) {
	this(radius);
	this.selected = selected;
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
    


