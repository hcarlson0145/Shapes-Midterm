
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Hunter Carlson)
 * @version: (1/4/21)
 * 
 */
import java.io.File;
import java.io.IOException;

public class Picture {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("My Picture");
        pic.setBackgroundColor("white");

        // Draw my picture
        Circle c = new Circle(500,90,75,"green",true);
        c.makeVisible();
        Rect r = new Rect();
        r.makeVisible();
        Arc a = new Arc(-200,-200,360,270,360,"yellow",true);
        a.makeVisible();

        // Get the filename to save to from the command line arguments, defaulting to
        // MyPicture.png if no argument is given
        String filename;
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            filename = args[0];
        }
        else {
            filename = "MyPicture.png";
        }

        // Save the picture to a file
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}