package 实验9;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Football extends JFrame{
	 public Football(){
		setLayout(null);
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
	 void init() {
		setBounds(400,200,400,400);
	   	setTitle("足球先生");
	 }
}
