import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// program to demonstrate working of CheckBox control

/* <applet code="Question76" height=200 width=300>
	</applet>
*/

public class Question76 extends Applet implements ItemListener {
	String msg, msgWin98, msgWinNT, msgSolaris;
	Checkbox Win98, WinNT, Solaris;
	public void init () {
		Win98 = new Checkbox ("Windows98");
		WinNT = new Checkbox ("Windows NT");
		Solaris = new Checkbox ("Solaris");
		add (Win98);
		add (WinNT);
		add (Solaris);
		Win98.addItemListener (this);
		WinNT.addItemListener (this);
		Solaris.addItemListener (this);
	}
	public void itemStateChanged (ItemEvent ie) {
		repaint ();
	}
	public void paint (Graphics g) {
		msg = "Current state: ";
		msgWin98 = "Windows 98: " + Win98.getState ();
		msgWinNT = "Windows NT: " + WinNT.getState ();
		msgSolaris = "Solaris: " + Solaris.getState ();
		g.drawString (msg, 6, 100);
		g.drawString (msgWin98, 6, 120);
		g.drawString (msgWinNT, 6, 140);
		g.drawString (msgSolaris, 6, 160);
	}
}
