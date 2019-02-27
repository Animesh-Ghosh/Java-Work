import java.awt.*;
import java.applet.*;
/* <applet code="Question67" width=300 height=80> 
	</applet>
*/

public class Question67 extends Applet
{
	public void paint(Graphics g){
		int x=5;
		int y=3;
		int z=x+y;
		String s="sum of x and y is "+ String.valueOf(z);
		g.drawString(s,10, 10);	
	}
	 
}
