import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class ViewOOP extends JFrame
{
	JLabel makeJL = new JLabel("Make:");
	JLabel modelJL = new JLabel("Model:");
	JLabel bodyStyleJL = new JLabel("BodyStyle:");
	JLabel colorJL = new JLabel("Color:");
	JLabel mpgJL = new JLabel("Mpg:");
	JLabel mileageJL = new JLabel("Mileage:");
	JLabel vinJL = new JLabel("Vin:");
	JLabel yearJL = new JLabel("Year:");
	
	JButton clear = new JButton ("Clear");
	JButton insert = new JButton ("Insert");
	JButton display = new JButton("Display");
	JButton delete = new JButton("Delete");
	JButton help = new JButton("Help");
	
	JTextArea console = new JTextArea(10,10);
	JTextField makeTF = new JTextField(9);
	JTextField modelTF = new JTextField(9);
	JTextField bodyStyleTF = new JTextField(9);
	JTextField colorTF = new JTextField(9);
	JTextField mpgTF = new JTextField(9);
	JTextField mileageTF = new JTextField(9);
	JTextField vinTF = new JTextField(9);
	JTextField yearTF = new JTextField(9);
	
	JPanel tfLayout = new JPanel(new GridLayout(1,16));
	JPanel p1 = new JPanel(new GridLayout(1,5));
	JPanel p2 = new JPanel(new BorderLayout());
	
	
	ViewOOP()
	{
		this.setLayout(new BorderLayout());
		this.setBounds(500,200,970,355);
		this.add(console,BorderLayout.CENTER);
		console.setEditable(false);		
		console.setBackground(Color.DARK_GRAY);
		console.setForeground(Color.red);
		
			
		this.add(p2,BorderLayout.SOUTH);
		p2.add(p1, BorderLayout.NORTH);
		p1.add(insert);
		p1.add(display);
		p1.add(delete);
		p1.add(clear);
		p1.add(help);
		p2.add(tfLayout, BorderLayout.SOUTH);
		
		tfLayout.setBackground(Color.gray);
		p1.setBackground(Color.gray);
		makeJL.setForeground(Color.WHITE);
		makeJL.setForeground(Color.WHITE);
		modelJL.setForeground(Color.WHITE);
		bodyStyleJL.setForeground(Color.WHITE);
		colorJL.setForeground(Color.WHITE);
		mpgJL.setForeground(Color.WHITE);
		mileageJL.setForeground(Color.WHITE);
		vinJL.setForeground(Color.WHITE);
		yearJL.setForeground(Color.WHITE);



		
		
		tfLayout.add(makeJL);
		tfLayout.add(makeTF);
		tfLayout.add(modelJL);
		tfLayout.add(modelTF);
		tfLayout.add(bodyStyleJL);
		tfLayout.add(bodyStyleTF);
		tfLayout.add(colorJL);
		tfLayout.add(colorTF);
		tfLayout.add(mpgJL);
		tfLayout.add(mpgTF);
		tfLayout.add(mileageJL);
		tfLayout.add(mileageTF);
		tfLayout.add(vinJL);
		tfLayout.add(vinTF);
		tfLayout.add(yearJL);
		tfLayout.add(yearTF);
		this.setVisible(true);
	}
}
