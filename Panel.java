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
		/*OperationContainer middle = new OperationContainer();
		this.add(middle);
		ResultContainer down = new ResultContainer();
		this.add(down);
		up.addAncestorListener(new AncestorListener(){

			@Override
			public void ancestorAdded(AncestorEvent arg0) {
				
			// TODO Auto-generated method stub
				up.revalidate();
				up.repaint();
				
			}

			@Override
			public void ancestorMoved(AncestorEvent arg0) {
				// TODO Auto-generated method stub
				up.revalidate();
				up.repaint();
			}

			@Override
			public void ancestorRemoved(AncestorEvent arg0) {
				// TODO Auto-generated method stub
				up.revalidate();
				up.repaint();
			}
			
		});*/
		validate();
		this.revalidate();
		this.repaint();
	}
}
