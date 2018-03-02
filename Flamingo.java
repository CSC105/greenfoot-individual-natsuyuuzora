import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flamingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingo extends Moment
{

    int horizonSpeed = Greenfoot.getRandomNumber(5)-3;
    int verticalSpeed = Greenfoot.getRandomNumber(5)-3;
    /**
     * Act - do whatever the Flamingo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(horizonSpeed, verticalSpeed);   //ทำไมดึงเอาmethod public จากclass Aim มาไม่ได้
        bounceEdge();
        hitEdge();
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

}

