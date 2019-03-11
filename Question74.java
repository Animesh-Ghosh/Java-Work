import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// program to demonstrate working of Label control

/* <applet code="Question74" height=100 width=200>
	</applet>
*/

public class Question74 extends Applet {
	public void init () {
		Label one = new Label ("One");
  		Label two = new Label ("Two");
  		Label three = new Label ("Three");
  		// adding labels to applet window
  		add (one);
  		add (two);
  		add (three);
  	}
}
