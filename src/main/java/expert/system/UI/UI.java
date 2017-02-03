package expert.system.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UI {

	private JFrame frmCarAdvisorExpert;
	private final JLabel lblNewLabel = new JLabel("New label");
	private final JLabel lblNewLabel_1 = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frmCarAdvisorExpert.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarAdvisorExpert = new JFrame();
		frmCarAdvisorExpert.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmCarAdvisorExpert.setTitle("CAR ADVISOR EXPERT SYSTEM");
		frmCarAdvisorExpert.setBounds(50, 50, 800, 600);
		frmCarAdvisorExpert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarAdvisorExpert.getContentPane().setLayout(null);
		
		JLabel lblCarAdvisorExpert = new JLabel("CAR ADVISOR EXPERT SYSTEM");
		lblCarAdvisorExpert.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblCarAdvisorExpert.setBounds(224, 49, 363, 32);
		frmCarAdvisorExpert.getContentPane().add(lblCarAdvisorExpert);
		
		JTextPane txtpnAnExpertSystem = new JTextPane();
		txtpnAnExpertSystem.setEditable(false);
		txtpnAnExpertSystem.setBackground(SystemColor.control);
		txtpnAnExpertSystem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnAnExpertSystem.setText("An expert system that advises you which\r\nvehicle to buy based on your personality");
		txtpnAnExpertSystem.setBounds(224, 136, 378, 62);
		frmCarAdvisorExpert.getContentPane().add(txtpnAnExpertSystem);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//btnNewButton.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(338, 359, 150, 50);
		frmCarAdvisorExpert.getContentPane().add(btnNewButton);
	}
}
