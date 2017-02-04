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
import javax.swing.JComboBox;
import javax.swing.JSlider;
import java.awt.Component;
import java.awt.CardLayout;
import javax.swing.JScrollBar;
import javax.swing.DropMode;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class UI {

	private JFrame frmCarAdvisorExpert;
	private final JLabel lblNewLabel = new JLabel("New label");
	private final JLabel lblNewLabel_1 = new JLabel("New label");
	JPanel panelTitle = new JPanel();
	private JPanel panelSlider;
	private JTextField txtQuiz;
	private JPanel panelSplash;
	private JButton btnNewButton;
	private JPanel panelQuiz;
	private JPanel panelObj;
	private JTextField txtAgree;
	private JTextField txtDisagree;
	private JTextField textField;

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
		frmCarAdvisorExpert.setBounds(0, 0, 1100, 750);
		frmCarAdvisorExpert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarAdvisorExpert.getContentPane().setLayout(null);
		
		panelObj = new JPanel();
		panelObj.setVisible(false);
		
		panelQuiz = new JPanel();
		panelQuiz.setVisible(false);
		panelQuiz.setBounds(10, 26, 1074, 685);
		frmCarAdvisorExpert.getContentPane().add(panelQuiz);
		panelQuiz.setLayout(null);
		
		panelSlider = new JPanel();
		panelSlider.setBounds(750, 12, 202, 673);
		panelQuiz.add(panelSlider);
		panelSlider.setLayout(null);
		
		JSlider slider1 = new JSlider();
		slider1.setBounds(0, -1, 200, 23);
		slider1.setBackground(Color.WHITE);
		slider1.setMajorTickSpacing(1);
		slider1.setValue(4);
		slider1.setMaximum(7);
		slider1.setMinimum(1);
		panelSlider.add(slider1);
		
		JSlider slider2 = new JSlider();
		slider2.setBounds(0, 21, 200, 23);
		slider2.setValue(4);
		slider2.setMinimum(1);
		slider2.setMaximum(7);
		slider2.setMajorTickSpacing(1);
		panelSlider.add(slider2);
		
		JSlider slider3 = new JSlider();
		slider3.setBounds(0, 43, 200, 23);
		slider3.setBackground(SystemColor.window);
		slider3.setValue(4);
		slider3.setMinimum(1);
		slider3.setMaximum(7);
		slider3.setMajorTickSpacing(1);
		panelSlider.add(slider3);
		
		JSlider slider4 = new JSlider();
		slider4.setBounds(0, 65, 200, 23);
		slider4.setValue(4);
		slider4.setMinimum(1);
		slider4.setMaximum(7);
		slider4.setMajorTickSpacing(1);
		panelSlider.add(slider4);
		
		JSlider slider5 = new JSlider();
		slider5.setBounds(0, 87, 200, 23);
		slider5.setBackground(SystemColor.window);
		slider5.setValue(4);
		slider5.setMinimum(1);
		slider5.setMaximum(7);
		slider5.setMajorTickSpacing(1);
		panelSlider.add(slider5);
		
		JSlider slider6 = new JSlider();
		slider6.setBounds(0, 109, 200, 23);
		slider6.setValue(4);
		slider6.setMinimum(1);
		slider6.setMaximum(7);
		slider6.setMajorTickSpacing(1);
		panelSlider.add(slider6);
		
		JSlider slider7 = new JSlider();
		slider7.setBounds(0, 131, 200, 23);
		slider7.setBackground(SystemColor.window);
		slider7.setValue(4);
		slider7.setMinimum(1);
		slider7.setMaximum(7);
		slider7.setMajorTickSpacing(1);
		panelSlider.add(slider7);
		
		JSlider slider8 = new JSlider();
		slider8.setBounds(0, 153, 200, 23);
		slider8.setValue(4);
		slider8.setMinimum(1);
		slider8.setMaximum(7);
		slider8.setMajorTickSpacing(1);
		panelSlider.add(slider8);
		
		JSlider slider9 = new JSlider();
		slider9.setBounds(0, 175, 200, 23);
		slider9.setBorder(null);
		slider9.setBackground(SystemColor.window);
		slider9.setValue(4);
		slider9.setMinimum(1);
		slider9.setMaximum(7);
		slider9.setMajorTickSpacing(1);
		panelSlider.add(slider9);
		
		JSlider slider10 = new JSlider();
		slider10.setBounds(0, 197, 200, 23);
		slider10.setValue(4);
		slider10.setMinimum(1);
		slider10.setMaximum(7);
		slider10.setMajorTickSpacing(1);
		panelSlider.add(slider10);
		
		JSlider slider11 = new JSlider();
		slider11.setBounds(0, 219, 200, 23);
		slider11.setBackground(SystemColor.window);
		slider11.setValue(4);
		slider11.setMinimum(1);
		slider11.setMaximum(7);
		slider11.setMajorTickSpacing(1);
		panelSlider.add(slider11);
		
		JSlider slider12 = new JSlider();
		slider12.setBounds(0, 241, 200, 23);
		slider12.setValue(4);
		slider12.setMinimum(1);
		slider12.setMaximum(7);
		slider12.setMajorTickSpacing(1);
		panelSlider.add(slider12);
		
		JSlider slider13 = new JSlider();
		slider13.setBounds(0, 263, 200, 23);
		slider13.setBackground(SystemColor.window);
		slider13.setValue(4);
		slider13.setMinimum(1);
		slider13.setMaximum(7);
		slider13.setMajorTickSpacing(1);
		panelSlider.add(slider13);
		
		JSlider slider14 = new JSlider();
		slider14.setBounds(0, 285, 200, 23);
		slider14.setValue(4);
		slider14.setMinimum(1);
		slider14.setMaximum(7);
		slider14.setMajorTickSpacing(1);
		panelSlider.add(slider14);
		
		JSlider slider15 = new JSlider();
		slider15.setBounds(0, 307, 200, 23);
		slider15.setBackground(SystemColor.window);
		slider15.setValue(4);
		slider15.setMinimum(1);
		slider15.setMaximum(7);
		slider15.setMajorTickSpacing(1);
		panelSlider.add(slider15);
		
		JSlider slider16 = new JSlider();
		slider16.setBounds(0, 329, 200, 23);
		slider16.setValue(4);
		slider16.setMinimum(1);
		slider16.setMaximum(7);
		slider16.setMajorTickSpacing(1);
		panelSlider.add(slider16);
		
		JSlider slider17 = new JSlider();
		slider17.setBounds(0, 351, 200, 23);
		slider17.setBackground(SystemColor.window);
		slider17.setValue(4);
		slider17.setMinimum(1);
		slider17.setMaximum(7);
		slider17.setMajorTickSpacing(1);
		panelSlider.add(slider17);
		
		JSlider slider18 = new JSlider();
		slider18.setBounds(0, 373, 200, 23);
		slider18.setValue(4);
		slider18.setMinimum(1);
		slider18.setMaximum(7);
		slider18.setMajorTickSpacing(1);
		panelSlider.add(slider18);
		
		JSlider slider19 = new JSlider();
		slider19.setBounds(0, 395, 200, 23);
		slider19.setBackground(SystemColor.window);
		slider19.setValue(4);
		slider19.setMinimum(1);
		slider19.setMaximum(7);
		slider19.setMajorTickSpacing(1);
		panelSlider.add(slider19);
		
		JSlider slider20 = new JSlider();
		slider20.setBounds(0, 417, 200, 23);
		slider20.setValue(4);
		slider20.setMinimum(1);
		slider20.setMaximum(7);
		slider20.setMajorTickSpacing(1);
		panelSlider.add(slider20);
		
		JSlider slider21 = new JSlider();
		slider21.setBounds(0, 439, 200, 23);
		slider21.setBackground(SystemColor.window);
		panelSlider.add(slider21);
		slider21.setValue(4);
		slider21.setMinimum(1);
		slider21.setMaximum(7);
		slider21.setMajorTickSpacing(1);
		
		JSlider slider22 = new JSlider();
		slider22.setBounds(0, 461, 200, 23);
		panelSlider.add(slider22);
		slider22.setValue(4);
		slider22.setMinimum(1);
		slider22.setMaximum(7);
		slider22.setMajorTickSpacing(1);
		
		JSlider slider23 = new JSlider();
		slider23.setBounds(0, 483, 200, 23);
		slider23.setBackground(SystemColor.window);
		panelSlider.add(slider23);
		slider23.setValue(4);
		slider23.setMinimum(1);
		slider23.setMaximum(7);
		slider23.setMajorTickSpacing(1);
		
		JSlider slider24 = new JSlider();
		slider24.setBounds(0, 505, 200, 23);
		panelSlider.add(slider24);
		slider24.setValue(4);
		slider24.setMinimum(1);
		slider24.setMaximum(7);
		slider24.setMajorTickSpacing(1);
		
		JSlider slider25 = new JSlider();
		slider25.setBounds(0, 527, 200, 23);
		slider25.setBackground(SystemColor.window);
		panelSlider.add(slider25);
		slider25.setValue(4);
		slider25.setMinimum(1);
		slider25.setMaximum(7);
		slider25.setMajorTickSpacing(1);
		
		JSlider slider26 = new JSlider();
		slider26.setBounds(0, 549, 200, 23);
		slider26.setValue(4);
		slider26.setMinimum(1);
		slider26.setMaximum(7);
		slider26.setMajorTickSpacing(1);
		panelSlider.add(slider26);
		
		JSlider slider27 = new JSlider();
		slider27.setBounds(0, 571, 200, 23);
		slider27.setBackground(SystemColor.window);
		slider27.setValue(4);
		slider27.setMinimum(1);
		slider27.setMaximum(7);
		slider27.setMajorTickSpacing(1);
		panelSlider.add(slider27);
		
		JSlider slider28 = new JSlider();
		slider28.setBounds(0, 593, 200, 23);
		slider28.setValue(4);
		slider28.setMinimum(1);
		slider28.setMaximum(7);
		slider28.setMajorTickSpacing(1);
		panelSlider.add(slider28);
		
		JSlider slider29 = new JSlider();
		slider29.setBounds(0, 615, 200, 23);
		slider29.setBackground(SystemColor.window);
		slider29.setValue(4);
		slider29.setMinimum(1);
		slider29.setMaximum(7);
		slider29.setMajorTickSpacing(1);
		panelSlider.add(slider29);
		
		JSlider slider30 = new JSlider();
		slider30.setBounds(0, 637, 200, 23);
		slider30.setValue(4);
		slider30.setMinimum(1);
		slider30.setMaximum(7);
		slider30.setMajorTickSpacing(1);
		panelSlider.add(slider30);
		
		JPanel panelQuestions = new JPanel();
		panelQuestions.setBounds(0, 0, 751, 685);
		panelQuiz.add(panelQuestions);
		panelQuestions.setLayout(new GridLayout(30, 1, 0, 0));
		
		JTextPane txtpnYouFind = new JTextPane();
		txtpnYouFind.setName("Q1");
		txtpnYouFind.setEditable(false);
		panelQuestions.add(txtpnYouFind);
		txtpnYouFind.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouFind.setText("1. You find it difficult to introduce yourself to other people");
		
		JTextPane txtpnYouOften = new JTextPane();
		txtpnYouOften.setBackground(SystemColor.control);
		txtpnYouOften.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouOften.setText("2. You often get so lost in thoughts that you ignore or forget your surroundings");
		panelQuestions.add(txtpnYouOften);
		
		JTextPane txtpnYouFind_1 = new JTextPane();
		txtpnYouFind_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouFind_1.setText("3. You find it easy to stay relaxed and focused even when there is some pressure");
		panelQuestions.add(txtpnYouFind_1);
		
		JTextPane txtpnYouDo = new JTextPane();
		txtpnYouDo.setBackground(SystemColor.control);
		panelQuestions.add(txtpnYouDo);
		txtpnYouDo.setText("4. You do not usually initiate conversations");
		txtpnYouDo.setName("Q1");
		txtpnYouDo.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouDo.setEditable(false);
		
		JTextPane txtpnYouFeel = new JTextPane();
		panelQuestions.add(txtpnYouFeel);
		txtpnYouFeel.setText("5. You feel superior to other people");
		txtpnYouFeel.setFont(new Font("Cambria", Font.PLAIN, 16));
		
		JTextPane txtpnBeingOrganized = new JTextPane();
		txtpnBeingOrganized.setBackground(SystemColor.control);
		panelQuestions.add(txtpnBeingOrganized);
		txtpnBeingOrganized.setText("6. Being organized is more important to you than being adaptable");
		txtpnBeingOrganized.setFont(new Font("Cambria", Font.PLAIN, 16));
		
		JTextPane txtpnWinningA = new JTextPane();
		panelQuestions.add(txtpnWinningA);
		txtpnWinningA.setText("7. Winning a debate matters less to you than making sure no one gets upset");
		txtpnWinningA.setFont(new Font("Cambria", Font.PLAIN, 16));
		
		JTextPane txtpnYouDo_1 = new JTextPane();
		txtpnYouDo_1.setBackground(SystemColor.control);
		txtpnYouDo_1.setText("8. You do not mind being at the center of attention");
		txtpnYouDo_1.setName("Q1");
		txtpnYouDo_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouDo_1.setEditable(false);
		panelQuestions.add(txtpnYouDo_1);
		
		JTextPane txtpnYouConsider = new JTextPane();
		txtpnYouConsider.setText("9. You consider yourself more practical than creative");
		txtpnYouConsider.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouConsider);
		
		JTextPane txtpnPeopleCan = new JTextPane();
		txtpnPeopleCan.setBackground(SystemColor.control);
		txtpnPeopleCan.setText("10. People can rarely upset you");
		txtpnPeopleCan.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnPeopleCan);
		
		JTextPane txtpnYourTravel = new JTextPane();
		txtpnYourTravel.setText("11. Your travel plans are usually well thought out");
		txtpnYourTravel.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYourTravel);
		
		JTextPane txtpnItIs = new JTextPane();
		txtpnItIs.setBackground(SystemColor.control);
		txtpnItIs.setText("12. It is often difficult for you to relate to other people\u2019s feelings");
		txtpnItIs.setName("Q1");
		txtpnItIs.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnItIs.setEditable(false);
		panelQuestions.add(txtpnItIs);
		
		JTextPane txtpnYourMood = new JTextPane();
		txtpnYourMood.setText("13. Your mood can change very quickly");
		txtpnYourMood.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYourMood);
		
		JTextPane txtpnInA = new JTextPane();
		txtpnInA.setBackground(SystemColor.control);
		txtpnInA.setText("14. In a discussion, truth should be more important than people\u2019s sensitivities");
		txtpnInA.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnInA);
		
		JTextPane txtpnYouRarely = new JTextPane();
		txtpnYouRarely.setText("15. You rarely worry about how your actions affect other people");
		txtpnYouRarely.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouRarely);
		
		JTextPane txtpnYouRarely_1 = new JTextPane();
		txtpnYouRarely_1.setBackground(SystemColor.control);
		txtpnYouRarely_1.setText("16. You rarely get carried away by fantasies and ideas");
		txtpnYouRarely_1.setName("Q1");
		txtpnYouRarely_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouRarely_1.setEditable(false);
		panelQuestions.add(txtpnYouRarely_1);
		
		JTextPane txtpnYouOften_1 = new JTextPane();
		txtpnYouOften_1.setText("17. You often find yourself lost in thought when you are walking in nature");
		txtpnYouOften_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouOften_1);
		
		JTextPane txtpnYouDo_2 = new JTextPane();
		txtpnYouDo_2.setBackground(SystemColor.control);
		txtpnYouDo_2.setText("18. You do not let other people influence your actions");
		txtpnYouDo_2.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouDo_2);
		
		JTextPane txtpnYourDreams = new JTextPane();
		txtpnYourDreams.setText("19. Your dreams tend to focus on the real world and its events");
		txtpnYourDreams.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYourDreams);
		
		JTextPane txtpnYouOften_2 = new JTextPane();
		txtpnYouOften_2.setBackground(SystemColor.control);
		txtpnYouOften_2.setText("20. You often spend time exploring unrealistic and impractical yet intriguing ideas");
		txtpnYouOften_2.setName("Q1");
		txtpnYouOften_2.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouOften_2.setEditable(false);
		panelQuestions.add(txtpnYouOften_2);
		
		JTextPane txtpnYouWould = new JTextPane();
		txtpnYouWould.setText("21. You would rather improvise than spend time coming up with a detailed plan");
		txtpnYouWould.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouWould);
		
		JTextPane txtpnYouAre = new JTextPane();
		txtpnYouAre.setBackground(SystemColor.control);
		txtpnYouAre.setText("22. You are a relatively reserved and quiet person");
		txtpnYouAre.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouAre);
		
		JTextPane txtpnYouOften_3 = new JTextPane();
		txtpnYouOften_3.setText("23. You often contemplate the reasons for human existence");
		txtpnYouOften_3.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouOften_3);
		
		JTextPane txtpnIfYour = new JTextPane();
		txtpnIfYour.setBackground(SystemColor.control);
		txtpnIfYour.setText("24. As a parent, you would rather see your child grow up kind than smart");
		txtpnIfYour.setName("Q1");
		txtpnIfYour.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnIfYour.setEditable(false);
		panelQuestions.add(txtpnIfYour);
		
		JTextPane txtpnBeingRight = new JTextPane();
		txtpnBeingRight.setText("25. Being right is more important than being cooperative when it comes to teamwork");
		txtpnBeingRight.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnBeingRight);
		
		JTextPane txtpnYouFrequently = new JTextPane();
		txtpnYouFrequently.setBackground(SystemColor.control);
		txtpnYouFrequently.setText("26. You frequently misplace your things");
		txtpnYouFrequently.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouFrequently);
		
		JTextPane txtpnYouFrequently_1 = new JTextPane();
		txtpnYouFrequently_1.setText("27. Your mind is always buzzing with unexplored ideas and plans");
		txtpnYouFrequently_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouFrequently_1);
		
		JTextPane txtpnYourMind = new JTextPane();
		txtpnYourMind.setBackground(SystemColor.control);
		txtpnYourMind.setText("28. If the room is full, you stay closer to the walls, avoiding the center");
		txtpnYourMind.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYourMind);
		
		JTextPane txtpnYouHave = new JTextPane();
		txtpnYouHave.setText("29. You have always been interested in unconventional and ambiguous things, e.g. in books, art, or movies");
		txtpnYouHave.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouHave);
		
		JTextPane txtpnYouOften_4 = new JTextPane();
		txtpnYouOften_4.setBackground(SystemColor.control);
		txtpnYouOften_4.setText("30. You often take initiative in social situations");
		txtpnYouOften_4.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouOften_4);
		
		JButton btnResults = new JButton("RESULTS");
		btnResults.setBounds(962, 240, 102, 50);
		panelQuiz.add(btnResults);
		
		JButton btnRandom = new JButton("RANDOM");
		btnRandom.setBounds(962, 156, 102, 50);
		panelQuiz.add(btnRandom);
		panelObj.setBounds(0, 0, 1084, 711);
		frmCarAdvisorExpert.getContentPane().add(panelObj);
		panelObj.setLayout(null);
		
		txtQuiz = new JTextField();
		txtQuiz.setBounds(10, 2, 160, 22);
		panelObj.add(txtQuiz);
		txtQuiz.setBorder(null);
		txtQuiz.setBackground(SystemColor.control);
		txtQuiz.setFont(new Font("Cambria", Font.BOLD, 18));
		txtQuiz.setText("QUIZ");
		txtQuiz.setColumns(10);
		
		txtDisagree = new JTextField();
		txtDisagree.setEditable(false);
		txtDisagree.setBorder(null);
		txtDisagree.setFont(new Font("Cambria", Font.BOLD, 14));
		txtDisagree.setBackground(SystemColor.control);
		txtDisagree.setBounds(966, 4, 59, 20);
		panelObj.add(txtDisagree);
		txtDisagree.setText("Disagree");
		txtDisagree.setColumns(10);
		
		txtAgree = new JTextField();
		txtAgree.setEditable(false);
		txtAgree.setBorder(null);
		txtAgree.setBackground(SystemColor.control);
		txtAgree.setFont(new Font("Cambria", Font.BOLD, 14));
		txtAgree.setBounds(718, 4, 43, 20);
		panelObj.add(txtAgree);
		txtAgree.setText("Agree");
		txtAgree.setColumns(10);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setBackground(SystemColor.control);
		textField.setFont(new Font("Cambria", Font.PLAIN, 16));
		textField.setText("3  -  2  -  1  -  0  -  1  -  2  -  3");
		textField.setBounds(765, 4, 198, 20);
		panelObj.add(textField);
		textField.setColumns(10);
		
		panelSplash = new JPanel();
		panelSplash.setBounds(0, 0, 1084, 711);
		frmCarAdvisorExpert.getContentPane().add(panelSplash);
		panelSplash.setLayout(null);
		
		JLabel lblCarAdvisorExpert = new JLabel("CAR ADVISOR EXPERT SYSTEM");
		lblCarAdvisorExpert.setBounds(368, 255, 408, 32);
		panelSplash.add(lblCarAdvisorExpert);
		lblCarAdvisorExpert.setFont(new Font("Tahoma", Font.BOLD, 26));
		
		JTextPane txtpnAnExpertSystem = new JTextPane();
		txtpnAnExpertSystem.setBounds(387, 310, 370, 56);
		panelSplash.add(txtpnAnExpertSystem);
		txtpnAnExpertSystem.setEditable(false);
		txtpnAnExpertSystem.setBackground(SystemColor.control);
		txtpnAnExpertSystem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnAnExpertSystem.setText("An expert system that advises you which\r\nvehicle to buy based on your personality");
		
		btnNewButton = new JButton("START");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelSplash.setVisible(false);
				panelQuiz.setVisible(true);
				panelObj.setVisible(true);
			}
		});
		btnNewButton.setBounds(513, 377, 100, 50);
		panelSplash.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
	}
}
