import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound myMusic = new GreenfootSound("Lobo_Loco_-_07_-_Lucky_Nightwalk_ID_776.mp3");
    public void act()
    {
        //myMusic.play();
    }

    ScoreCount scorecount = new ScoreCount();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public ScoreCount getScoreCount()
    {
        return scorecount;
    }

    private void prepare()
    {
        Aim aim = new Aim();
        addObject (aim, 550, 350);

        Flamingo flamingo = new Flamingo();
        addObject(flamingo,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200)); 
        Flamingo flamingo2 = new Flamingo();
        addObject(flamingo2,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200));  
        Flamingo flamingo3 = new Flamingo();
        addObject(flamingo3,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200));  
        Flamingo flamingo4 = new Flamingo();
        addObject(flamingo4,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200));  
        Flamingo flamingo5 = new Flamingo();
        addObject(flamingo5,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200)); 
        Flamingo flamingo6 = new Flamingo();
        addObject(flamingo6,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200));  
        Flamingo flamingo7 = new Flamingo();
        addObject(flamingo7,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200)); 
        FakeFlamingo fakeflamingo = new FakeFlamingo();
        addObject(fakeflamingo,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200));  
        FakeFlamingo fakeflamingo2 = new FakeFlamingo();
        addObject(fakeflamingo2,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200)); 
        FakeFlamingo fakeflamingo3 = new FakeFlamingo();
        addObject(fakeflamingo3,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200));   
        FakeFlamingo fakeflamingo4 = new FakeFlamingo();
        addObject(fakeflamingo4,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200)); 
        FakeFlamingo fakeflamingo5 = new FakeFlamingo();
        addObject(fakeflamingo5,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200));   
        FakeFlamingo fakeflamingo7 = new FakeFlamingo();
        addObject(fakeflamingo7,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200));
        addObject(scorecount,483,360);
        FakeFlamingo fakeflamingo6 = new FakeFlamingo();
        addObject(fakeflamingo6,Greenfoot.getRandomNumber(getWidth()-300), Greenfoot.getRandomNumber(getHeight()-200));
    }

}
