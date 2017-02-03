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
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;

public class UI {

	private JFrame frmCarAdvisorExpert;
	private final JLabel lblNewLabel = new JLabel("New label");
	private final JLabel lblNewLabel_1 = new JLabel("New label");
	JPanel panelTitle = new JPanel();

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
		
		JTextPane txtpnQuestions = new JTextPane();
		txtpnQuestions.setBounds(21, 11, 102, 26);
		frmCarAdvisorExpert.getContentPane().add(txtpnQuestions);
		txtpnQuestions.setBackground(SystemColor.control);
		txtpnQuestions.setFont(new Font("Cambria", Font.BOLD, 18));
		txtpnQuestions.setText("QUESTIONS");
		
		JPanel panelQuestions = new JPanel();
		panelQuestions.setBounds(0, 46, 784, 516);
		frmCarAdvisorExpert.getContentPane().add(panelQuestions);
		panelQuestions.setLayout(new GridLayout(20, 9, 0, 2));
		
		JTextPane txtpnYouFind = new JTextPane();
		txtpnYouFind.setName("Q1");
		txtpnYouFind.setEditable(false);
		panelQuestions.add(txtpnYouFind);
		txtpnYouFind.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouFind.setText("1. You find it difficult to introduce yourself to other people");
		
		JTextPane txtpnYouOften = new JTextPane();
		txtpnYouOften.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouOften.setText("2. You often get so lost in thoughts that you ignore or forget your surroundings");
		panelQuestions.add(txtpnYouOften);
		
		JTextPane txtpnYouTry = new JTextPane();
		txtpnYouTry.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouTry.setText("3. You try to respond to your e-mails as soon as possible and cannot stand a messy inbox");
		panelQuestions.add(txtpnYouTry);
		
		JTextPane txtpnYouFind_1 = new JTextPane();
		txtpnYouFind_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouFind_1.setText("4. You find it easy to stay relaxed and focused even when there is some pressure");
		panelQuestions.add(txtpnYouFind_1);
		
		panelTitle = new JPanel();
		panelTitle.setVisible(false);
		panelTitle.setBounds(199, 190, 420, 196);
		frmCarAdvisorExpert.getContentPane().add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblCarAdvisorExpert = new JLabel("CAR ADVISOR EXPERT SYSTEM");
		lblCarAdvisorExpert.setBounds(6, 5, 408, 32);
		panelTitle.add(lblCarAdvisorExpert);
		lblCarAdvisorExpert.setFont(new Font("Tahoma", Font.BOLD, 26));
		
		JTextPane txtpnAnExpertSystem = new JTextPane();
		txtpnAnExpertSystem.setBounds(25, 42, 370, 56);
		panelTitle.add(txtpnAnExpertSystem);
		txtpnAnExpertSystem.setEditable(false);
		txtpnAnExpertSystem.setBackground(SystemColor.control);
		txtpnAnExpertSystem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnAnExpertSystem.setText("An expert system that advises you which\r\nvehicle to buy based on your personality");
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setBounds(168, 114, 83, 29);
		panelTitle.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelTitle.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
	}
}
