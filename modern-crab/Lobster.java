// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("d")) {
            move(5);
        }
        else {
            move(-5);
        }
        if (Greenfoot.isKeyDown("a")) {
            move(-5);
        }
        else {
            move(5);
        }
        if (Greenfoot.isKeyDown("w")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("w")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("s")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-4);
        }
        if (isAtEdge()) {
            turn(4);
        }
        if (isTouching(Crab.class)) {
            move(-8);
        }
    }
}
