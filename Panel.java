package Vector;


import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Panel extends JPanel{
	public Panel(){
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		VectorContainer up = new VectorContainer();
		this.add(up);
		validate();
		this.revalidate();
		this.repaint();
	}
}
