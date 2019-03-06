import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* program to create an applet to handle keyboard events 
	(message for F1, F2, F3, F4, F5 to be displayed) */

/* <applet code="Question70" height=100 width=300>
	</applet>
*/

public class Question70 extends Applet implements KeyListener {
	String msg = "";
	int X = 10, Y = 20;
	public void init () {
		addKeyListener (this);
		requestFocus ();
	}
	public void keyPressed (KeyEvent ke) {
		showStatus ("Key Down!");
		int key = ke.getKeyCode ();
		switch (key) {
			case KeyEvent.VK_F1: msg += "<F1>";
				break;
			case KeyEvent.VK_F2: msg += "<F2>";
				break;
			case KeyEvent.VK_F3: msg += "<F3>";
				break;
			case KeyEvent.VK_F4: msg += "<F4>";
				break;
			case KeyEvent.VK_F5: msg += "<F5>";
				break;
			case KeyEvent.VK_UP: msg += "<Up Arrow>";
				break;
			case KeyEvent.VK_DOWN: msg += "<Down Arrow>";
				break;
			case KeyEvent.VK_LEFT: msg += "<Left Arrow>";
				break;
			case KeyEvent.VK_RIGHT: msg += "<Right Arrow>";
				break;
			case KeyEvent.VK_PAGE_UP: msg += "<PgUp>";
				break;
			case KeyEvent.VK_PAGE_DOWN: msg += "<PgDn>";
				break;
		}
		repaint ();
	}
	public void keyReleased (KeyEvent ke) {
		showStatus ("Key up!");
	}
	public void keyTyped (KeyEvent ke) {
		msg += ke.getKeyChar ();
		repaint ();
	}
	public void paint (Graphics g) {
		g.drawString (msg, X, Y);
	}
}