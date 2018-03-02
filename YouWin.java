import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWin extends World
{
    GreenfootSound myWin = new GreenfootSound("Undertale - 077 - ASGORE.mp3");

    /**
     * Constructor for objects of class YouWin.
     * 
     */
    public YouWin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Restart restart = new Restart();
        addObject(restart,240,59);
        restart.setLocation(300,363);
        restart.setLocation(290,216);
    }


    public void act()
    {
       myWin.play();
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld());
            myWin.pause();
        }

    }
}
