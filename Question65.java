import java.awt.*;
import java.applet.*;

//  program to create an Applet and use setBackground () and setForeground ()

/* <applet code="Question65" width=300 height=50>
</applet> */

public class Question65 extends Applet {
	String msg;
	public void init () {
		setBackground (Color.magenta);
		setForeground (Color.white);
		msg = "Inside init() ";
	}
	public void start() {
		msg += "Inside start() ";
	}
	public void paint(Graphics g) {
		msg += "Inside paint() ";
		g.drawString(msg, 10, 30);
	}
}
