package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	
	private int iDepth;
	
	
	public Cuboid(int L, int W, int D) throws Exception {
		super(L, W);
		if (D>0) {
			iDepth=D;
		}
		else {
			throw new Exception ("IllegalArgumentException"); //double check this!!! 
		}
		
	}
	public int getiDepth() {
		return iDepth;
		
	}
	public void setiDepth(int D) throws Exception {
		if (iDepth>0) {
			iDepth=D;
			}
			else {
				throw new Exception ("IllegalArgumentException"); //double check this!!! 
			}
		
	}
	@Override 
	public double area() {
		return (2* super.getiLength() * super.getiWidth()) +(2* this.getiDepth() * super.getiWidth())+(2* super.getiLength() * this.getiDepth());
		
		
	}
	public double volume(){
		return super.getiLength() * super.getiWidth() *this.getiDepth();
		
		
	}

public class SortByArea implements Comparator<Cuboid> {
	
	 SortByArea() {
	
	}
	@Override
	public int compare(Cuboid o1, Cuboid o2) {
		
		return (int) (o1.area() - o2.area()); //MAKE SURE HTIS IS ASCENDING 
				
	}
	
				//i need to compare these two some wya but idk how it works yet
				//also needs t be flipped to ASCENDING
		
	}

public class SortByVolume implements Comparator<Cuboid> {

	SortByVolume(){
	
	}
	@Override
	public int compare(Cuboid o1, Cuboid o2) {
		
		return (int) (o1.volume() - o2.volume()); //MAKE SURE HTIS IS ASCENDING 
				
	}
	
}
}
	

