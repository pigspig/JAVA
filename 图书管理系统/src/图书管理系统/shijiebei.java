package 实验9;

import javax.swing.JFrame;

public class shijiebei extends JFrame{
	public shijiebei(){
		setLayout(null);
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
	 void init() {
		setBounds(400,200,200,200);
	   	setTitle("世界杯");
	 }
}
