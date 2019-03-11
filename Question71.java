import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// program to demonstrate adapter class for mouse events

/* <applet code="Question71" width=300 height=100>
	</applet>
*/

public class Question71 extends Applet {
 	public void init () { 
  		addMouseListener (new MyMouseAdapter (this));
  		addMouseMotionListener (new MyMouseMotionAdapter (this));
	}
 }

class MyMouseAdapter extends MouseAdapter {
	Question71 adapterDemo;
	public MyMouseAdapter (Question71 adapterDemo) {
		this.adapterDemo = adapterDemo;
	}
	public void mouseClicked (MouseEvent me) {
		adapterDemo.showStatus ("Mouse Clicked!");
	}
	public void mousePressed (MouseEvent me) {
		adapterDemo.showStatus ("Mouse Pressed!");
	}
}

class MyMouseMotionAdapter extends MouseMotionAdapter {
	Question71 adapterDemo;
	public MyMouseMotionAdapter (Question71 adapterDemo) {
		this.adapterDemo = adapterDemo;
	}
	public void mouseDragged (MouseEvent me) {
		adapterDemo.showStatus ("Mouse Dragged!");
	}
}
