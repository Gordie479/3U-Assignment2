/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author simmg9723
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City castletown = new City();

        Robot guard = new Robot(castletown, 0, 0, Direction.EAST);

        new Wall(castletown, 2, 2, Direction.WEST);
        new Wall(castletown, 2, 2, Direction.NORTH);
        new Wall(castletown, 2, 3, Direction.NORTH);
        new Wall(castletown, 2, 3, Direction.EAST);
        new Wall(castletown, 3, 3, Direction.EAST);
        new Wall(castletown, 3, 3, Direction.SOUTH);
        new Wall(castletown, 3, 2, Direction.SOUTH);
        new Wall(castletown, 3, 2, Direction.WEST);
        new Wall(castletown, 1, 1, Direction.NORTH);
        new Wall(castletown, 1, 1, Direction.EAST);
        new Wall(castletown, 1, 1, Direction.SOUTH);
        new Wall(castletown, 1, 1, Direction.WEST);
        new Wall(castletown, 1, 4, Direction.NORTH);
        new Wall(castletown, 1, 4, Direction.EAST);
        new Wall(castletown, 1, 4, Direction.SOUTH);
        new Wall(castletown, 1, 4, Direction.WEST);
        new Wall(castletown, 4, 4, Direction.NORTH);
        new Wall(castletown, 4, 4, Direction.EAST);
        new Wall(castletown, 4, 4, Direction.SOUTH);
        new Wall(castletown, 4, 4, Direction.WEST);
        new Wall(castletown, 4, 1, Direction.NORTH);
        new Wall(castletown, 4, 1, Direction.EAST);
        new Wall(castletown, 4, 1, Direction.SOUTH);
        new Wall(castletown, 4, 1, Direction.WEST);

        while (true) {
            guard.move();
            guard.move();
            guard.turnLeft();
            guard.turnLeft();
            guard.turnLeft();
            guard.move();
            guard.turnLeft();
            guard.move();
            guard.turnLeft();
            guard.move();
            guard.turnLeft();
            guard.turnLeft();
            guard.turnLeft();
            guard.move();
            guard.move();
            guard.turnLeft();
            guard.turnLeft();
            guard.turnLeft();
        }
    }
}