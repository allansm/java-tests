import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test{
	public static void main(String[]args){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setLayout(null);

		JTextField txt = new JTextField();
		JButton button = new JButton("Show Name");
		JLabel label = new JLabel("Name:");
		
		label.setBounds(10,10,125,10);
		txt.setBounds(10,30,150,25);	
		button.setBounds(10,75,150,25);
		button.setActionCommand("showName");

		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getActionCommand().equals("showName")) System.out.println("name:"+txt.getText());
			}
		});

		panel.add(label);
		panel.add(txt);
		panel.add(button);
		
		frame.getContentPane().add(panel);

		frame.setSize(170,125);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}	
}
