import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// program to demonstrate adapter class as an inner class

/* <applet code="Question72.java" height=150 width=300>
	</applet>
*/

public class Question72 extends Applet {
 	public void init () { 
  		addMouseListener (new MyMouseAdapter ());
  		addMouseMotionListener (new MyMouseMotionAdapter ());
	}
	// inner class for MouseAdapter
	class MyMouseAdapter extends MouseAdapter {
		public void mouseClicked (MouseEvent me) {
			showStatus ("Mouse Clicked!");
		}
		public void mousePressed (MouseEvent me) {
			showStatus ("Mouse Pressed!");
		}
	}
	// inner class for MouseMotionAdapter
	class MyMouseMotionAdapter extends MouseMotionAdapter {
		public void mouseDragged (MouseEvent me) {
			showStatus ("Mouse Dragged!");
		}
	}
 }