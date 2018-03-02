import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCount extends Actor
{
    int score = 0;
    /**
     * Act - do whatever the ScoreCount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Score : "+ score, 24, Color.RED, Color.WHITE));
    }   

    public void addScore()
    {
        score++;
        if(score == 7)
        {
            Greenfoot.setWorld(new YouWin());
        }
    }
}
