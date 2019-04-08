import java.awt.*;
import java.applet.*;

// program to create an Applet to calculate the sum of two numbers

/* <applet code="Question67" height="80" width="300"> 
	</applet>
*/

public class Question67 extends Applet {
	public void paint (Graphics g) {
		int x = 5;
		int y = 3;
		int z = x + y;
		String s = "Sum of x and y is " + String.valueOf(z);
		g.drawString (s, 10, 10);
	} 
}
