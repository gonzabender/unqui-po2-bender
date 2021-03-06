package ar.edu.unq.po2.tp3;

public class Punto {
	
	private float x;
	private float y;
	private float z;
	
	public Punto(float x, float y) {
		super();
		this.setXY(x, y);
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	public void setZ(float z) {
		this.z = z;
	}
	
	public float getZ(float z) {
		return this.z;
	}
	
}
