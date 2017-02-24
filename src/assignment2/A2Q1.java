/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author simmg9723
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City hyrule = new City();

        Robot link = new Robot(hyrule, 1, 1, Direction.EAST);

        new Thing(hyrule, 1, 2);
        new Thing(hyrule, 1, 3);
        new Thing(hyrule, 1, 4);
        new Thing(hyrule, 1, 5);
        new Thing(hyrule, 1, 6);
        new Thing(hyrule, 1, 7);
        new Thing(hyrule, 1, 8);
        new Thing(hyrule, 1, 9);
        new Thing(hyrule, 1, 10);
        new Thing(hyrule, 1, 11);

        while (link.frontIsClear()) {
            link.move();
            if (link.canPickThing()) {
                if(link.countThingsInBackpack() < 7){
                    link.pickThing();
                }else if (link.countThingsInBackpack() == 7) {
                    while (link.canPickThing()) {
                        link.move();

                    }
                    break;
                }

            }
           

        }

    }
}
