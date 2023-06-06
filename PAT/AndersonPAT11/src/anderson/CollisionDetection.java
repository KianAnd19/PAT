/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anderson;

import java.awt.geom.Area;
import javax.swing.JLabel;


/**
 * Checks if two Objects collide and returns a boolean.
 * @author Kian
 */
public class CollisionDetection
{

    Character player = new Character(0, 800, 0);

    //check collision between two labels, returns boolean

    /**
     * Checks if two Jlabels have collided, returns a boolean.
     * @param labelOne The first object to check collision.
     * @param labelTwo The second object to check collision.
     * @return A Boolean whether the two objects are intersecting.
     */
    public boolean checkCollision(JLabel labelOne, JLabel labelTwo)
    {
        Area areaOne = new Area(labelOne.getBounds());
        Area areaTwo = new Area(labelTwo.getBounds());
        return areaOne.intersects(areaTwo.getBounds2D());
    }


}
