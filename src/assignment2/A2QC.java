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
public class A2QC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City hyrule = new City();
        
        Robot link = new Robot(hyrule, 0, 2, Direction.SOUTH);
        Robot navi = new Robot(hyrule, 0, 2, Direction.SOUTH);
        
        new Wall(hyrule, 0, 0, Direction.WEST);
        new Wall(hyrule, 1, 0, Direction.WEST);
        new Wall(hyrule, 2, 0, Direction.WEST);
        new Wall(hyrule, 3, 0, Direction.WEST);
        new Wall(hyrule, 4, 0, Direction.WEST);
        new Wall(hyrule, 5, 0, Direction.WEST);
        new Wall(hyrule, 6, 0, Direction.WEST);
        new Wall(hyrule, 7, 0, Direction.WEST);
        new Wall(hyrule, 8, 0, Direction.WEST);
        new Wall(hyrule, 9, 0, Direction.WEST);
        new Wall(hyrule, 0, 1, Direction.EAST);
        new Wall(hyrule, 1, 1, Direction.EAST);
        new Wall(hyrule, 2, 1, Direction.EAST);
        new Wall(hyrule, 3, 1, Direction.EAST);
        new Wall(hyrule, 4, 1, Direction.EAST);
        new Wall(hyrule, 5, 1, Direction.EAST);
        new Wall(hyrule, 6, 1, Direction.EAST);
        new Wall(hyrule, 7, 1, Direction.EAST);
        new Wall(hyrule, 8, 1, Direction.EAST);
        new Wall(hyrule, 9, 1, Direction.EAST);
        new Wall(hyrule, 0, 2, Direction.EAST);
        new Wall(hyrule, 3, 2, Direction.EAST);
        new Wall(hyrule, 5, 2, Direction.EAST);
        new Wall(hyrule, 6, 2, Direction.EAST);
        new Wall(hyrule, 9, 2, Direction.EAST);
        new Wall(hyrule, 9, 2, Direction.SOUTH);
        new Wall(hyrule, 1, 3, Direction.NORTH);
        new Wall(hyrule, 1, 4, Direction.NORTH);
        new Wall(hyrule, 1, 5, Direction.NORTH);
        new Wall(hyrule, 1, 6, Direction.NORTH);
        new Wall(hyrule, 1, 6, Direction.EAST);
        new Wall(hyrule, 2, 6, Direction.EAST);
        new Wall(hyrule, 2, 6, Direction.SOUTH);
        new Wall(hyrule, 2, 5, Direction.SOUTH);
        new Wall(hyrule, 2, 4, Direction.SOUTH);
        new Wall(hyrule, 2, 3, Direction.SOUTH);
        new Wall(hyrule, 4, 3, Direction.NORTH);
        new Wall(hyrule, 4, 4, Direction.NORTH);
        new Wall(hyrule, 4, 5, Direction.NORTH);
        new Wall(hyrule, 4, 5, Direction.EAST);
        new Wall(hyrule, 4, 5, Direction.SOUTH);
        new Wall(hyrule, 4, 4, Direction.SOUTH);
        new Wall(hyrule, 4, 3, Direction.SOUTH);
        new Wall(hyrule, 7, 3, Direction.NORTH);
        new Wall(hyrule, 7, 4, Direction.NORTH);
        new Wall(hyrule, 7, 5, Direction.NORTH);
        new Wall(hyrule, 7, 6, Direction.NORTH);
        new Wall(hyrule, 7, 7, Direction.NORTH);
        new Wall(hyrule, 7, 7, Direction.EAST);
        new Wall(hyrule, 8, 7, Direction.EAST);
        new Wall(hyrule, 8, 7, Direction.SOUTH);
        new Wall(hyrule, 8, 6, Direction.SOUTH);
        new Wall(hyrule, 8, 5, Direction.SOUTH);
        new Wall(hyrule, 8, 4, Direction.SOUTH);
        new Wall(hyrule, 8, 3, Direction.SOUTH);
        
        new Thing(hyrule, 0, 1);
        new Thing(hyrule, 0, 3);
        new Thing(hyrule, 0, 4);
        new Thing(hyrule, 0, 6);
        new Thing(hyrule, 1, 0);
        new Thing(hyrule, 1, 2);
        new Thing(hyrule, 1, 3);
        new Thing(hyrule, 1, 4);
        new Thing(hyrule, 1, 5);
        new Thing(hyrule, 1, 7);
        new Thing(hyrule, 2, 0);
        new Thing(hyrule, 2, 2);
        new Thing(hyrule, 2, 4);
        new Thing(hyrule, 2, 6);
        new Thing(hyrule, 3, 0);
        new Thing(hyrule, 3, 1);
        new Thing(hyrule, 3, 4);
        new Thing(hyrule, 3, 6);
        new Thing(hyrule, 4, 0);
        new Thing(hyrule, 4, 2);
        new Thing(hyrule, 4, 3);
        new Thing(hyrule, 4, 4);
        new Thing(hyrule, 4, 6);
        new Thing(hyrule, 4, 7);
        new Thing(hyrule, 5, 1);
        new Thing(hyrule, 5, 5);
        new Thing(hyrule, 5, 7);
        new Thing(hyrule, 6, 4);
        new Thing(hyrule, 6, 6);
        new Thing(hyrule, 7, 0);
        new Thing(hyrule, 7, 1);
        new Thing(hyrule, 7, 2);
        new Thing(hyrule, 7, 3);
        new Thing(hyrule, 7, 7);
        new Thing(hyrule, 8, 1);
        new Thing(hyrule, 8, 3);
        new Thing(hyrule, 8, 4);
        new Thing(hyrule, 8, 6);
        new Thing(hyrule, 9, 0);
        new Thing(hyrule, 9, 1);
        new Thing(hyrule, 9, 3);
        new Thing(hyrule, 9, 4);
        new Thing(hyrule, 9, 6);
        
    }
}
