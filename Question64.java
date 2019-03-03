import java.awt.*;
import java.applet.*;
/*<applet code="Question64" width=300 height=50>
<param name="yourname" value="jeff">
</applet> */
public class Question64 extends Applet
{
	String name;
	public void init()
	{
		name = getParameter("yourname");
		if(name == null)
			name = "Not Found";
	}
	public void paint(Graphics g)
	{
		g.drawString("Your name : " + name, 0,10);
	}
}