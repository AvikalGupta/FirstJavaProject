package Avikal.JavaMasterClass;

public class Point {

	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distance() {
		double ret = Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
		return ret;
	}

	public double distance(int x, int y) {
		double ret = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
		return ret;
	}

	public double distance(Point a) {
		double ret = Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
		return ret;
	}

}
