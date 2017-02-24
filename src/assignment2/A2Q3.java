/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author simmg9723
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City hyrule = new City();

        Robot link = new Robot(hyrule, 13, 12, Direction.NORTH);

        while (link.getStreet() > 0) {
            link.move();
            if (link.getStreet() == 0) {
                link.turnLeft();
                link.turnLeft();
                link.turnLeft();
                break;
            }
        }
        if (link.getStreet() < 0) {
            link.turnLeft();
            link.turnLeft();
            while (link.getStreet() < 0) {
                link.move();
            }
            if (link.getStreet() == 0) {
                link.turnLeft();
            }
        }
        if (link.getAvenue() > 0) {
            link.turnLeft();
            link.turnLeft();
            while (link.getAvenue() > 0) {
                link.move();
                if (link.getAvenue() == 0) {
                    break;
                }
            }
        }

        while (link.getAvenue() < 0) {
            link.move();
        }
        if (link.getStreet() == 0) {
            link.turnLeft();
        }
    }
}