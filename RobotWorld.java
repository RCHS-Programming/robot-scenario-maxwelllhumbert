import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Robot(), 50, 50);
        
        addObject(new Wall(), 50, 150);
        addObject(new Wall(), 100, 150);
        addObject(new Wall(), 150, 150);
        addObject(new Wall(), 550, 150);
        addObject(new Wall(), 600, 150);
        addObject(new Wall(), 650, 150);
        addObject(new Wall(), 700, 150);
        addObject(new Wall(), 750, 150);
        addObject(new Wall(), 450, 150);
        addObject(new Block(), 300, 150);
        addObject(new Scorepanel(), 50, 550);
        addObject(new Home(), 750, 550);
        addObject(new Pizza(), Greenfoot.getRandomNumber(125), Greenfoot.getRandomNumber(800));
        addObject(new Pizza(), Greenfoot.getRandomNumber(125), Greenfoot.getRandomNumber(800));
        addObject(new Pizza(), Greenfoot.getRandomNumber(180), Greenfoot.getRandomNumber(800));
        addObject(new Pizza(), Greenfoot.getRandomNumber(180), Greenfoot.getRandomNumber(800));
        addObject(new Pizza(), Greenfoot.getRandomNumber(180), Greenfoot.getRandomNumber(800));
        addObject(new Pizza(), Greenfoot.getRandomNumber(180), Greenfoot.getRandomNumber(800));
        addObject(new Pizza(), Greenfoot.getRandomNumber(180), Greenfoot.getRandomNumber(800));
    }
}
