package geometry;

public class line {
	
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public double length() {
		return startPoint.distance(endPoint);
	}
	
	@Override
	public String toString() {
		return String.format("(%s. %s) -> (%s, %s)",
		startPoint.getX(), startPoint.getY(),endPoint.getX(),endPoint.getY());
	}
	
	public Point getstartPoint() {
		return startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	

}
