import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	MyFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Chọn màu");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("Ăn quả nhớ kẻ trồng cây");
		label.setFont(new Font("Time New Roman",Font.PLAIN,25));
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color...I guess", Color.black);
			
			label.setForeground(color);
			//label.setBackground(color);
		}
	}
}
