package edu.handong.csee.java ;

public class Creat{

/** here is main */	


     public static void main(String[] args){

/** Declare and create a point object and two rectangle objects. */

        Point originOne = new Point(23, 94);

        Rectangle rectOne = new Rectangle(originOne, 100, 200);

        Rectangle rectTwo = new Rectangle(50, 100);

		

        // display rectOne's width, height, and area
        System.out.println("Area of rectOne: " + rectOne.getArea());

		

        // set rectTwo's position

        rectTwo.move(23,94);



	

        // display rectTwo's position
        rectTwo.getPoint();
		
        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        rectTwo.getPoint();
    }
}

