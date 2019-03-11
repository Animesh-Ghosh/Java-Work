import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// program to demonstrate adapter class as an anonymous inner class

/* <applet code="Question73.java" height=150 width=300>
	</applet>
*/

public class Question73 extends Applet {
 	public void init () { 
 		// anonymous inner class for MouseAdapter
  		addMouseListener (new MouseAdapter () {
			public void mouseClicked (MouseEvent me) {
				showStatus ("Mouse Clicked!");
			}
			public void mousePressed (MouseEvent me) {
				showStatus ("Mouse Pressed!");
			}
  		});
  		// anonymous inner class for MouseMotionAdapter
  		addMouseMotionListener (new MouseMotionAdapter () {
			public void mouseDragged (MouseEvent me) {
				showStatus ("Mouse Dragged!");
			}
  		});
	}
 }