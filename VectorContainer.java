package Vector;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Spring;

public class VectorContainer extends JPanel{
	private Vector a;
	private Vector b;
	private Vector c;
	private JLabel labelA;
	private JLabel labelB;
	private JTextField textXA;
	private JTextField textYA;
	private JTextField textXB;
	private JTextField textYB;
	private JLabel operationLabel;
	@SuppressWarnings("rawtypes")
	private JComboBox operat;
	private JRadioButton addVector;
	private boolean chooseRadioButton;
	private JLabel labelResult;
	private JLabel result;
	private String[] operation;
	public VectorContainer(){
		operation = new String[]{"|a|","a + b", "a - b", "a * b"};
		labelA = new JLabel();
		labelB = new JLabel();
		textXA = new JTextField();
		textYA = new JTextField();
		textXB = new JTextField();
		textYB = new JTextField();
		operat = new JComboBox();
		operat.addItem(operation[0]);
		operat.setPreferredSize(new Dimension(70,30));
		operationLabel = new JLabel("Operation:");
		chooseRadioButton = false;
		addVector = new JRadioButton("add");
		result = new JLabel();
		labelResult = new JLabel("Result");
		labelB.setVisible(chooseRadioButton);
		textXB.setVisible(chooseRadioButton);
		textYB.setVisible(chooseRadioButton);
		
		operat.addActionListener(new ActionListener() {

			//vecror(double,double)??
			@Override
			public void actionPerformed(ActionEvent e) {
				//if (operat.getSelectedItem().equals("|a|")) result.setText("" + a.getX());
				//else if (operat.getSelectedItem().equals("a + b")) result.setText("not"); 
				//else if (operat.getSelectedItem().equals("a - b")) result.setText("no"); 
				//else result.setText(" ");
				}
			});
		
		
		textXA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//textXA.getText()
				
				double numb = Double.parseDouble(textXA.getText());
				a.setX(numb);
				
				
				//result.setText(textXA.getText()); 
				//result.setText(" " + a.getX());
				}
			});
		
		
		
		textYA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a.setY(Double.parseDouble(textYA.getText()));
				//result.setText(textXA.getText()); 
				//result.setText(" " + a.getX());
				}
			});
		addVector.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				chooseRadioButton = !chooseRadioButton;
				labelB.setVisible(chooseRadioButton);
				textXB.setVisible(chooseRadioButton);
				textYB.setVisible(chooseRadioButton);
				setComboBox(chooseRadioButton);
				System.out.println(chooseRadioButton);
				result.setText("" + a.getX());
			}
			
		});
		labelA.setText("a");
		labelB.setText("b");
		//this.setLayout(new FlowLayout(FlowLayout.LEFT));
		//this.setLayout(new GridBagLayout());
		//GridBagConstraints c = new GridBagConstraints(); 
		GroupLayout layout = new GroupLayout(this);
		 this.setLayout(layout);
		 layout.setAutoCreateGaps(true);
		 layout.setAutoCreateContainerGaps(true);
		/*Dimension d = new Dimension(30,30);
		textXA.setMinimumSize(d);
		textXA.setPreferredSize(d);
		textXB.setPreferredSize(d);
		textYA.setPreferredSize(d);
		textYB.setPreferredSize(d);*/
		
		layout.setHorizontalGroup(layout.createSequentialGroup() 
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(labelA)
						.addComponent(operationLabel)
						.addComponent(labelResult))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				        .addComponent(textXA,70,70,70)
				        .addComponent(operat,GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
				        .addComponent(result))
				        .addComponent(textYA,70,70,70)
				        .addComponent(addVector)
				        .addComponent(labelB)
				        .addComponent(textXB,70,70,70)
				        .addComponent(textYB,70,70,70)
				);
		layout.setVerticalGroup(
				   layout.createSequentialGroup()
				   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				      .addComponent(labelA)
				      .addComponent(textXA,GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
				      .addComponent(textYA,GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
				      .addComponent(addVector)
				      .addComponent(labelB)
				      .addComponent(textXB,GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
				      .addComponent(textYB,GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE))
				      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				      .addComponent(operationLabel)
					  .addComponent(operat,GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE))
					  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					  .addComponent(labelResult)
					  .addComponent(result))
				);

		validate();
		this.revalidate();
		this.repaint();
	}

	public void setComboBox(boolean flag){
		operat.removeAllItems();
		if (flag)
			for (int i = 1; i < operation.length; i++)
					operat.addItem(operation[i]);
		else
			operat.addItem(operation[0]);
	}
	static private String selectedString(ItemSelectable is) {
	    Object selected[] = is.getSelectedObjects();
	    return ((selected.length == 0) ? "null" : (String)selected[0]);

	  } 
}
