
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square garage;
    private Square window;
    private Square window2;
    private Square trunk;
    private Triangle roof;
    private Triangle groof;
    private Triangle leaves;
    private Circle sun;
    private Square back;
    private Square fore;
    private Square door;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        back = new Square();
        back.changeColor("blue");
        back.moveHorizontal(-100);
        back.moveVertical(-100);
        back.changeSize(500);
        back.makeVisible();
        
        fore = new Square();
        fore.changeColor("white");
        fore.moveHorizontal(-100);
        fore.moveVertical(180);
        fore.changeSize(500);
        fore.makeVisible();
        
      
       
        wall = new Square();
        wall.changeColor("yellow");
        wall.moveVertical(80);
        wall.moveHorizontal(-20);
        wall.changeSize(100);
        wall.makeVisible();
        
        garage = new Square();
        garage.changeColor("yellow");
        garage.moveHorizontal(80);
        garage.moveVertical(110);
        garage.changeSize(70);
        garage.makeVisible();

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(-10);
        window.moveVertical(120);
        window.changeSize(20);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("white");
        window2.moveHorizontal(45);
        window2.moveVertical(120);
        window2.changeSize(20);
        window2.makeVisible();

        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(50, 140);
        roof.moveHorizontal(40);
        roof.moveVertical(70);
        roof.makeVisible();
        
        groof = new Triangle();
        groof.changeColor("black");
        groof.changeSize(25, 100);
        groof.moveHorizontal(120);
        groof.moveVertical(120);
        groof.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(200);
        sun.moveVertical(-40);
        sun.changeSize(60);
        sun.makeVisible();
        
        door = new Square();
        door.changeColor("red");
        door.moveHorizontal(15);
        door.moveVertical(150);
        door.changeSize(30);
        door.makeVisible();
        
        trunk = new Square();
        trunk.changeColor("black");
        trunk.moveVertical(150);
        trunk.moveHorizontal(180);
        trunk.changeSize(30);
        trunk.makeVisible();
        
        leaves = new Triangle();
        leaves.changeColor("green");
        leaves.changeSize(80, 45);
        leaves.moveHorizontal(205);
        leaves.moveVertical(110);
        leaves.makeVisible();
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
