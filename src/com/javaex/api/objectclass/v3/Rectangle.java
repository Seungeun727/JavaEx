package com.javaex.api.objectclass.v3;

public class Rectangle implements Cloneable {
	// 필드 선언
	public int width;
	public int height;
	
	//생성자 선언
	public Rectangle(int height ,int width) {
		this.width = width;
		this.height = height;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			// 캐스팅
			Rectangle other = (Rectangle)obj;
			return width * height == other.width * other.height;
		}
		return super.equals(obj);
	}
    
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
    public Rectangle getClone() {
    	Rectangle clone = null;
    	
    	try {
    		clone = (Rectangle)clone();
    	} catch  (CloneNotSupportedException e){
    		e.printStackTrace();
    	}
    	return clone;
    }
}
