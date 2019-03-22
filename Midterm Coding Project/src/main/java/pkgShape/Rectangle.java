package pkgShape;


public class Rectangle extends Shape implements Comparable {
		
	private int iWidth;
	private int iLength;
	
	
	public Rectangle(int L, int W) throws Exception {
		super();
		if (W>0) {
			iWidth=W;
			}
			else {
				throw new Exception ("IllegalArgumentException"); //double check this!!! 
			}
		if (L>0) {
			iLength=L;
		}
		else {
			throw new Exception ("IllegalArgumentException"); //double check this!!! 
		}
				
	}
	public int getiWidth() {
		return iWidth;
		
	}
	
	
	public void setiWidth(int W) throws Exception {
		if (iWidth>0) {
		iWidth=W;
		}
		else {
			throw new Exception ("IllegalArgumentException"); //double check this!!! 
		}
		
	}
	public int getiLength() {
		return iLength;
		
	}
	public void setiLength(int L) throws Exception { //IM REALLY NOT SRUE WHERE EXCPETION IS SUPPOSED TO GO
		if (iLength>0) {
			iLength=L;
			}
			else {
				throw new Exception ("IllegalArgumentException"); //double check this!!! 
			}
		
	}
	public double area() {
		return this.getiLength() * this.getiWidth();
	}
	public double perimeter() {
		return (this.getiLength() *2) + (this.getiWidth()*2); 
	}
	
		
	@Override
	public int compareTo(Object o) {
		
		Rectangle r = (Rectangle) o;
		return  (int) (this.area() - (int) r.area()); //I DONT LIKE CASTING TO INT HERE--ASK ON PIAZZA.
				//also ASCENDING order???
				
	}
}
