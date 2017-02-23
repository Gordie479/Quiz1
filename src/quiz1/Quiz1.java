/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author simmg9723
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creates a new city called hyrule
        City hyrule = new City();
        
        //adds a robot on the intersection at 4, 0
        RobotSE link = new RobotSE(hyrule, 4, 0, Direction.EAST);
        
        //adds the staricase made of walls
        new Wall(hyrule, 4, 2, Direction.WEST);
        new Wall(hyrule, 4, 2, Direction.NORTH);
        new Wall(hyrule, 3, 3, Direction.WEST);
        new Wall(hyrule, 3, 3, Direction.NORTH);
        new Wall(hyrule, 2, 4, Direction.WEST);
        new Wall(hyrule, 2, 4, Direction.NORTH);
        new Wall(hyrule, 2, 5, Direction.NORTH);
        new Wall(hyrule, 2, 5, Direction.EAST);
        new Wall(hyrule, 3, 6, Direction.NORTH);
        new Wall(hyrule, 3, 6, Direction.EAST);
        new Wall(hyrule, 4, 7, Direction.NORTH);
        new Wall(hyrule, 4, 7, Direction.EAST);
        
        //adds (things) to the staircase
        new Thing(hyrule, 4, 1);
        new Thing(hyrule, 3, 2);
        new Thing(hyrule, 2, 3);
        new Thing(hyrule, 1, 4);
        
        //link goes up each step, picking up (things) along the way
        link.move();
        link.pickThing();
        link.turnLeft();
        link.move();
        link.turnRight();
        
        link.move();
        link.pickThing();
        link.turnLeft();
        link.move();
        link.turnRight();
        
        link.move();
        link.pickThing();
        link.turnLeft();
        link.move();
        link.turnRight();
        
        link.move();
        link.pickThing();
        
        //link goes down each step, replacing lightbulbs as he goes
        link.move();
        link.putThing();
        
        link.move();
        link.turnRight();
        link.move();
        link.turnLeft();
        link.putThing();
        
        link.move();
        link.turnRight();
        link.move();
        link.turnLeft();
        link.putThing();
        
        link.move();
        link.turnRight();
        link.move();
        link.turnLeft();
        link.putThing();
        link.move();
        
    }
}
