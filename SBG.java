import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SBG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SBG extends World
{
    GreenfootSound myOp = new GreenfootSound("Snail's House - Lullaby (Piano Keyboard Cover).mp3");
    /**
     * Constructor for objects of class SBG.
     * 
     */
    public SBG()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartLetter startletter = new StartLetter();
        addObject(startletter,400,300);
        startletter.setLocation(408,222);
        startletter.setLocation(401,219);
        startletter.setLocation(403,227);
        HowTo howto = new HowTo();
        addObject(howto,406,536);
        startletter.setLocation(403,220);
        howto.setLocation(399,501);
        removeObject(howto);
        HowTo howto2 = new HowTo();
        addObject(howto2,414,499);
        removeObject(startletter);
        StartLetter startletter2 = new StartLetter();
        addObject(startletter2,416,161);
        howto2.setLocation(541,488);
        startletter2.setLocation(406,103);
        howto2.setLocation(404,316);
        howto2.setLocation(401,495);
        startletter2.setLocation(400,215);
        startletter2.setLocation(423,189);
        startletter2.setLocation(404,219);
        startletter2.setLocation(405,210);
        howto2.setLocation(405,480);
        startletter2.setLocation(409,152);
        howto2.setLocation(405,443);
    }


    public void act()
    {
        myOp.play();
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld());
            myOp.pause();
        }
    }
}
