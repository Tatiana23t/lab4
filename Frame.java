package Vector;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;


public class Frame extends JFrame{
	public Frame(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		Dimension windowSize = new Dimension(550,250);
		setSize(windowSize.width , windowSize.height );
		setLocation((screenSize.width - windowSize.width) / 2, 
				(screenSize.height - windowSize.height) / 2);
		this.setName("Vector");
		//Panel race = new Panel();
		Container pane = getContentPane();
		this.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
		VectorContainer v = new VectorContainer();
		pane.add(v);
		//OperationContainer o = new OperationContainer();
		//pane.add(o);
		//ResultContainer r = new ResultContainer();
		//pane.add(r);
		this.repaint();
		
		//pane.add(p);
	}
}
