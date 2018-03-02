import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aim extends Moment
{
    GreenfootSound myMusic = new GreenfootSound("Lobo_Loco_-_07_-_Lucky_Nightwalk_ID_776.mp3");
    GreenfootSound shot = new GreenfootSound("johnj_wafare_gun_pistol_silenced_walther_pp7.mp3");
    private int horizonSpeed = 0;
    private int verticalSpeed = 0;
    /**
     * Act - do whatever the aim wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        Actor fakeflamingo = getOneIntersectingObject(FakeFlamingo.class);
        ScoreCount scoreC = new ScoreCount();
        World w = getWorld();
        turnCommand();
        move(horizonSpeed, verticalSpeed);
        accelCommand();
        bounceEdge();
        hitEdge();
        
        if(isTouching(Flamingo.class))
        {
            MyWorld myworld = (MyWorld)w;
            ScoreCount scorecount = myworld.getScoreCount();
            scorecount.addScore();
            removeTouching(Flamingo.class);
            shot.play();
            
        }
        
        else if(isTouching(FakeFlamingo.class))
        {
            myMusic.pause();
            w.removeObject(this);
            Greenfoot.setWorld(new GameOver());
        }

    }   

    public void turnCommand()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
        }
    }

    public void accelCommand()
    {  
        if(Greenfoot.isKeyDown("space"))
        {
            int rot = getRotation();
            if (rot == 0)
            {
                horizonSpeed = horizonSpeed +1;
            }
            else if (rot == 180)
            {
                horizonSpeed = horizonSpeed -1; 
            }
            else if (rot == 90)
            {
                verticalSpeed = verticalSpeed +1; 
            }
            else if (rot == 270)
            {
                verticalSpeed = verticalSpeed -1; 
            }
        }
    }

    public void move(int changeX, int changeY)
    {
        int x = getX();
        int y = getY();
        int newX = x + changeX;
        int newY = y + changeY;
        setLocation(newX, newY);
    }

    public String hitEdge()
    {
        int x = getX();
        int y = getY();
        World myWorld = getWorld();
        int rightSide = myWorld.getWidth() - 1;
        int bottomSide = myWorld.getHeight() - 1;
        if (y == 0)
        {
            return "top";
        }
        else if ( x == 0)
        {
            return "left";
        }
        else if ( x == rightSide)
        {
            return "right";
        }
        else if ( y == bottomSide)
        {
            return "bottom";
        }
        else {
            return null;
        }
    }

    public void bounceEdge()
    {
        String edge = hitEdge();
        if (edge == "top" || edge == "bottom")
        {
            verticalSpeed = verticalSpeed * -1;
        }
        else if (edge == "left" || edge == "right")
        {
            horizonSpeed = horizonSpeed * -1;
        }
    }

    public void hitFakeFlamingo()
    {
        Actor fakeflamingo = getOneIntersectingObject(FakeFlamingo.class);
        if(fakeflamingo != null)
        {
            World myWorld = getWorld();
            myWorld.removeObject(this);
        }
    }
}



