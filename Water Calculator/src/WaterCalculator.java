import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class WaterCalculator {

	private JFrame frame;
	private JTextField textFieldWeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaterCalculator window = new WaterCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WaterCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 611, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHowMuchWater = new JLabel("How much water should I drink?");
		lblHowMuchWater.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblHowMuchWater.setBounds(105, 40, 402, 31);
		frame.getContentPane().add(lblHowMuchWater);
		
		JLabel lblNewLabel = new JLabel("My weight (kg):");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(115, 90, 179, 56);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldWeight.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textFieldWeight.setBounds(305, 90, 146, 56);
		frame.getContentPane().add(textFieldWeight);
		textFieldWeight.setColumns(10);
		
		JButton btnTellMe = new JButton("Tell Me");
		btnTellMe.setBackground(SystemColor.activeCaption);
		btnTellMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int weight;
				double water;
				
				try {
					weight=Integer.parseInt(textFieldWeight.getText());
					
					water=weight*0.033;
					JOptionPane.showMessageDialog(null, "Buddy, you should drink " + water + " L of water a day!");
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnTellMe.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnTellMe.setBounds(192, 186, 179, 56);
		frame.getContentPane().add(btnTellMe);
	}
}
