import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.Color;

public class CompsciGuiforGame {

	private JFrame frmProjectTest;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompsciGuiforGame window = new CompsciGuiforGame();
					window.frmProjectTest.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public CompsciGuiforGame() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProjectTest = new JFrame();
		frmProjectTest.setTitle("Project Test ");
		frmProjectTest.setBounds(100, 100, 450, 300);
		frmProjectTest.setSize(450, 450);
		frmProjectTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btnExit = new JButton("Exit ");
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		
	

		
		
		
		
		
		SpringLayout springLayout = new SpringLayout();
		frmProjectTest.getContentPane().setLayout(springLayout);
		
		final JButton btnStart = new JButton("Start ");
		btnStart.setForeground(new Color(0, 128, 0));
	
	

		




		
		springLayout.putConstraint(SpringLayout.NORTH, btnExit, 0, SpringLayout.NORTH, btnStart);
		springLayout.putConstraint(SpringLayout.WEST, btnExit, 70, SpringLayout.EAST, btnStart);
		springLayout.putConstraint(SpringLayout.NORTH, btnStart, 59, SpringLayout.NORTH, frmProjectTest.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnStart, 123, SpringLayout.WEST, frmProjectTest.getContentPane());
		frmProjectTest.getContentPane().add(btnStart);
		frmProjectTest.getContentPane().add(btnExit);
		
		
		String helptxt = "To start the game press the Start button.";
		JLabel lblYouGet = new JLabel("<html>"+helptxt+"</html>");
		lblYouGet.setVisible(false);
		frmProjectTest.getContentPane().add(lblYouGet);
		
		final JLabel lblYouGain = new JLabel("You gain $50,000 everytime you answer a question correctly.");
		springLayout.putConstraint(SpringLayout.WEST, lblYouGain, 10, SpringLayout.WEST, frmProjectTest.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblYouGet, 0, SpringLayout.WEST, lblYouGain);
		springLayout.putConstraint(SpringLayout.SOUTH, lblYouGet, -17, SpringLayout.NORTH, lblYouGain);
		frmProjectTest.getContentPane().add(lblYouGain);
		
		final JLabel lblToExitPress = new JLabel("To exit press the X button in the right hand corner or press exit.");
		springLayout.putConstraint(SpringLayout.NORTH, lblToExitPress, 216, SpringLayout.NORTH, frmProjectTest.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblToExitPress, 10, SpringLayout.WEST, frmProjectTest.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblYouGain, -16, SpringLayout.NORTH, lblToExitPress);
		frmProjectTest.getContentPane().add(lblToExitPress);
		
		final JLabel lblToExitPress_1 = new JLabel("To exit press the X Button in the right hand corner or press exit. ");
		springLayout.putConstraint(SpringLayout.WEST, lblToExitPress_1, 0, SpringLayout.WEST, lblYouGet);
		springLayout.putConstraint(SpringLayout.SOUTH, lblToExitPress_1, -51, SpringLayout.SOUTH, frmProjectTest.getContentPane());
		lblToExitPress_1.setVisible(false);
		frmProjectTest.getContentPane().add(lblToExitPress_1);
		
		
		btnStart.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				 btnStart.setVisible(false);
				 lblYouGain.setVisible(false);
				 lblToExitPress_1.setVisible(true);
				 lblToExitPress.setVisible(false);
				
			}
		});
		
	}
}
	


