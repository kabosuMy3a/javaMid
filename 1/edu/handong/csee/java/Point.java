package edu.handong.csee.java ;

/**
 * this is point to indicate coordinate
 */

public class Point{


	private int x ;

	private int y ;



	public Point(){
		
	 	x= 0;
		y= 0;	

	}

	public Point(int a, int b) {

		x = a;
    		y = b;

	}


	public void set(int a, int b){

		x = a; 
		y = b;		

  	}

	public void getX(){

		System.out.println(x);

	}	

	public void getY(){
            
		System.out.println(y);
	}

}
