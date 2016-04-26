package Vector;
import java.math.*;
public class Vector {
	private double x;
	private double y;
	public Vector(){
		x = 0;
		y = 0;
		}
	public Vector(double x, double y){
		this.x = x;
		this.y = y;
		}
	public double getX(){
		return x;
		}
	public double getY(){
		return y;
		}
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	public double lenght(){
		//return x+y;
		return Math.sqrt(x*x + y*y);
		}

	public Vector multiplicate(Vector b){
		return new Vector(x*b.getX(),y*b.getY());
		}
	public Vector addition(Vector b){
		return new Vector(x+b.getX(),y+b.getY());
		}
	
	public Vector subtraction(Vector b){
		return new Vector(x-b.getX(),y-b.getY());
		}
	}
