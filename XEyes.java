import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

/*
 * XEyes: 
 * This is the main class of the xeyes project.  To run, create an instance
 * of this class.
 */

public class XEyes extends JPanel implements MouseListener, MouseMotionListener{


    private String fileName = "mountrushmore.jpg";

    private JFrame myFrame;
    private ImageIcon myPic;
    
    // Each eye gets an instance variable.
    private Eye eye_1;
    private Eye eye_2;
    private Eye eye_3;
    private Eye eye_4;
    private Eye eye_5;
    private Eye eye_6;
    private Eye eye_7;
    private Eye eye_8;

    // Constructor: this loads the image "einstein.jpg" in the "images" directory 
    // within the project
    public XEyes() {
        //A String passed into the JFrame constructor will be used as the title of the JFrame window
        myFrame = new JFrame("XEyes");
        myFrame.add(this);
        
        constructImage(fileName);

        // these eyes fit right on Einstein's head.  
        eye_1 = new Eye(47, 124, 15, 15);
        eye_2 = new Eye(102, 119, 15, 15);
        eye_3 = new Eye(211, 183, 15, 15);
        eye_4 = new Eye(260, 188, 15, 15);
        eye_5 = new Eye(342, 274, 15, 15);
        eye_6 = new Eye(394, 285, 15, 15);
        eye_7 = new Eye(473, 263, 15, 15);
        eye_8 = new Eye(522, 255, 15, 15);
        addMouseListener(this);
        addMouseMotionListener(this);
        myFrame.setVisible(true);
        }

        
    // convert the image so that it can be drawn in a JPanel
    private void constructImage(String fileName) {
        File imageFile = new File("./images/" + fileName);
        // an ImageIcon is a class that contains an image and knows how to draw itself
        myPic = new ImageIcon (imageFile.toString());
        // sets the size of the window based on the picture loaded. 
        myFrame.setSize(myPic.getIconWidth(), myPic.getIconHeight() );
    }
           
          
    public void paintComponent(Graphics g) {
  
        g.drawImage(myPic.getImage(), 0, 0, this);
        eye_1.draw(g);
        eye_2.draw(g);
        eye_3.draw(g);
        eye_4.draw(g);
        eye_5.draw(g);
        eye_6.draw(g);
        eye_7.draw(g);
        eye_8.draw(g);


    }
    
    // move the pupil when the mouse is clicked
    public void mouseClicked (MouseEvent event) {
       
    }
    public void mouseDragged( MouseEvent event){
	}
    public void mouseMoved(MouseEvent event){ 
        eye_1.movePupil(event.getX(), event.getY());
        eye_2.movePupil(event.getX(), event.getY());
        eye_3.movePupil(event.getX(), event.getY());
        eye_4.movePupil(event.getX(), event.getY());
        eye_5.movePupil(event.getX(), event.getY());
        eye_6.movePupil(event.getX(), event.getY());
        eye_7.movePupil(event.getX(), event.getY());
        eye_8.movePupil(event.getX(), event.getY());
        eye_1.Lasers(event.getX(), event.getY());
        
        
        eye_2.Lasers(event.getX(), event.getY());
       
        eye_3.Lasers(event.getX(), event.getY());
       
        eye_4.Lasers(event.getX(), event.getY());
        
        eye_5.Lasers(event.getX(), event.getY());
        
        eye_6.Lasers(event.getX(), event.getY());
       
        eye_7.Lasers(event.getX(), event.getY());
        
        eye_8.Lasers(event.getX(), event.getY());
        
        repaint();}
  
    public void mouseReleased (MouseEvent event) {
    }
    
    public void mousePressed (MouseEvent event) {
    }
    
    public void mouseEntered (MouseEvent event) {
    }
    
    public void mouseExited (MouseEvent event) {
    }
    
} // end class