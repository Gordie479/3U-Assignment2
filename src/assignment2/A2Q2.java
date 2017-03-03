/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author simmg9723
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City hyrule = new City();
        
        Robot link = new Robot(hyrule, 2, 0, Direction.EAST);
        
        new Wall(hyrule, 2, 0, Direction.SOUTH);
        new Wall(hyrule, 2, 1, Direction.SOUTH);
        new Wall(hyrule, 2, 2, Direction.SOUTH);
        new Wall(hyrule, 2, 3, Direction.SOUTH);
        new Wall(hyrule, 2, 4, Direction.SOUTH);
        new Wall(hyrule, 2, 5, Direction.SOUTH);
        new Wall(hyrule, 2, 6, Direction.SOUTH);
        new Wall(hyrule, 2, 7, Direction.SOUTH);
        new Wall(hyrule, 2, 8, Direction.SOUTH);
        new Wall(hyrule, 2, 9, Direction.SOUTH);
        new Wall(hyrule, 2, 9, Direction.WEST);
        new Wall(hyrule, 2, 2, Direction.WEST);
        new Wall(hyrule, 2, 3, Direction.WEST);
        
        new Thing(hyrule, 2, 9);
        
        while(!link.canPickThing()) {
            
            //hurdle jumping
            if(!link.frontIsClear()) {
                link.turnLeft();
                link.move();
                link.turnLeft();
                link.turnLeft();
                link.turnLeft();
                link.move();
                link.turnLeft();
                link.turnLeft();
                link.turnLeft();
                link.move();
                link.turnLeft();
               
            //moves if there is no hurdle
            }else{
                link.move();
            }
        }
        link.pickThing();

    }
}
