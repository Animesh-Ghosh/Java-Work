import java.awt.*;
import java.applet.*;

// program to create an Applet and use param tag

/* <applet code="Question64" height="50" width="300">
<param name="yourname" value="muh name jeff!">
</applet> */

public class Question64 extends Applet {
	String name;
	public void init () {
		name = getParameter("yourname");
		if (name == null) name = "Not Found";
	}
	public void paint (Graphics g) {
		g.drawString("Your name: " + name, 0, 10);
	}
}