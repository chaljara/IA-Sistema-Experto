package com.house.UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.house.DB.DB;
import com.house.cars.CarList;
import com.house.cars.InfoResult;
import com.house.cars.MultipleChoice;
import com.house.cars.Personality;
import com.house.cars.Question;
import com.house.cars.Quiz;
import com.house.drools.DroolsTest;
import java.awt.Toolkit;


public class UI {
	public static CarList carList;
	private InfoResult infoResult;
	private JFrame frmCarAdvisorExpert;
	private JFrame frmCarResult;
	private JPanel panelSlider;
	private JTextField txtQuiz;
	private JPanel panelSplash;
	private JButton btnNewButton;
	private JPanel panelQuiz;
	private JPanel panelObj;
	private JPanel panelResult;
	private JPanel panelInfoPersonality;
	private JButton btnResults;

	public JPanel panelCarImage;
	public JLabel lblNewLabel;
	public JPanel panelCarSpecs;
	private JTextField txtAgree;
	private JTextField txtDisagree;
	private JTextField textField;
	private Quiz Survey;
	private JSlider slider1, slider2, slider3, slider4, slider5;
	private JSlider slider6, slider7, slider8, slider9, slider10;
	private JSlider slider11, slider12, slider13, slider14, slider15;
	private JSlider slider16, slider17, slider18, slider19, slider20;
	private JSlider slider21, slider22, slider23, slider24, slider25;
	private JSlider slider26, slider27, slider28, slider29, slider30;
	private ArrayList<JSlider> sliderList = new ArrayList<JSlider>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		carList = DB.loadData();
		
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
		frmCarAdvisorExpert.setIconImage(Toolkit.getDefaultToolkit().getImage(UI.class.getResource("/res/icon.png")));
		frmCarAdvisorExpert.getContentPane().setFont(new Font("Cambria", Font.PLAIN, 18));
		frmCarAdvisorExpert.setTitle("CAR ADVISOR EXPERT SYSTEM");
		frmCarAdvisorExpert.setBounds(0, 0, 1100, 750);
		frmCarAdvisorExpert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarAdvisorExpert.getContentPane().setLayout(null);
		frmCarAdvisorExpert.setResizable(false);
		
		/*******/
		Survey = new Quiz();
		//Car = new CarSuggest();
		//Car.setSurvey(Survey);
		//Car.setModelCar("");
		/*******/
		
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
		
		slider1 = new JSlider();
		slider1.setBounds(0, -1, 200, 23);
		slider1.setBackground(Color.WHITE);
		slider1.setMajorTickSpacing(1);
		slider1.setValue(4);
		slider1.setMaximum(7);
		slider1.setMinimum(1);
		sliderList.add(slider1);
		panelSlider.add(slider1);
		
		slider2 = new JSlider();
		slider2.setBounds(0, 21, 200, 23);
		slider2.setValue(4);
		slider2.setMinimum(1);
		slider2.setMaximum(7);
		slider2.setMajorTickSpacing(1);
		sliderList.add(slider2);
		panelSlider.add(slider2);
		
		slider3 = new JSlider();
		slider3.setBounds(0, 43, 200, 23);
		slider3.setBackground(SystemColor.window);
		slider3.setValue(4);
		slider3.setMinimum(1);
		slider3.setMaximum(7);
		slider3.setMajorTickSpacing(1);
		sliderList.add(slider3);
		panelSlider.add(slider3);
		
		slider4 = new JSlider();
		slider4.setBounds(0, 65, 200, 23);
		slider4.setValue(4);
		slider4.setMinimum(1);
		slider4.setMaximum(7);
		slider4.setMajorTickSpacing(1);
		sliderList.add(slider4);
		panelSlider.add(slider4);
		
		slider5 = new JSlider();
		slider5.setBounds(0, 87, 200, 23);
		slider5.setBackground(SystemColor.window);
		slider5.setValue(4);
		slider5.setMinimum(1);
		slider5.setMaximum(7);
		slider5.setMajorTickSpacing(1);
		sliderList.add(slider5);
		panelSlider.add(slider5);
		
		slider6 = new JSlider();
		slider6.setBounds(0, 109, 200, 23);
		slider6.setValue(4);
		slider6.setMinimum(1);
		slider6.setMaximum(7);
		slider6.setMajorTickSpacing(1);
		sliderList.add(slider6);
		panelSlider.add(slider6);
		
		slider7 = new JSlider();
		slider7.setBounds(0, 131, 200, 23);
		slider7.setBackground(SystemColor.window);
		slider7.setValue(4);
		slider7.setMinimum(1);
		slider7.setMaximum(7);
		slider7.setMajorTickSpacing(1);
		sliderList.add(slider7);
		panelSlider.add(slider7);
		
		slider8 = new JSlider();
		slider8.setBounds(0, 153, 200, 23);
		slider8.setValue(4);
		slider8.setMinimum(1);
		slider8.setMaximum(7);
		slider8.setMajorTickSpacing(1);
		sliderList.add(slider8);
		panelSlider.add(slider8);
		
		slider9 = new JSlider();
		slider9.setBounds(0, 175, 200, 23);
		slider9.setBorder(null);
		slider9.setBackground(SystemColor.window);
		slider9.setValue(4);
		slider9.setMinimum(1);
		slider9.setMaximum(7);
		slider9.setMajorTickSpacing(1);
		sliderList.add(slider9);
		panelSlider.add(slider9);
		
		slider10 = new JSlider();
		slider10.setBounds(0, 197, 200, 23);
		slider10.setValue(4);
		slider10.setMinimum(1);
		slider10.setMaximum(7);
		slider10.setMajorTickSpacing(1);
		sliderList.add(slider10);
		panelSlider.add(slider10);
		
		slider11 = new JSlider();
		slider11.setBounds(0, 219, 200, 23);
		slider11.setBackground(SystemColor.window);
		slider11.setValue(4);
		slider11.setMinimum(1);
		slider11.setMaximum(7);
		slider11.setMajorTickSpacing(1);
		sliderList.add(slider11);
		panelSlider.add(slider11);
		
		slider12 = new JSlider();
		slider12.setBounds(0, 241, 200, 23);
		slider12.setValue(4);
		slider12.setMinimum(1);
		slider12.setMaximum(7);
		slider12.setMajorTickSpacing(1);
		sliderList.add(slider12);
		panelSlider.add(slider12);
		
		slider13 = new JSlider();
		slider13.setBounds(0, 263, 200, 23);
		slider13.setBackground(SystemColor.window);
		slider13.setValue(4);
		slider13.setMinimum(1);
		slider13.setMaximum(7);
		slider13.setMajorTickSpacing(1);
		sliderList.add(slider13);
		panelSlider.add(slider13);
		
		slider14 = new JSlider();
		slider14.setBounds(0, 285, 200, 23);
		slider14.setValue(4);
		slider14.setMinimum(1);
		slider14.setMaximum(7);
		slider14.setMajorTickSpacing(1);
		sliderList.add(slider14);
		panelSlider.add(slider14);
		
		slider15 = new JSlider();
		slider15.setBounds(0, 307, 200, 23);
		slider15.setBackground(SystemColor.window);
		slider15.setValue(4);
		slider15.setMinimum(1);
		slider15.setMaximum(7);
		slider15.setMajorTickSpacing(1);
		sliderList.add(slider15);
		panelSlider.add(slider15);
		
		slider16 = new JSlider();
		slider16.setBounds(0, 329, 200, 23);
		slider16.setValue(4);
		slider16.setMinimum(1);
		slider16.setMaximum(7);
		slider16.setMajorTickSpacing(1);
		sliderList.add(slider16);
		panelSlider.add(slider16);
		
		slider17 = new JSlider();
		slider17.setBounds(0, 351, 200, 23);
		slider17.setBackground(SystemColor.window);
		slider17.setValue(4);
		slider17.setMinimum(1);
		slider17.setMaximum(7);
		slider17.setMajorTickSpacing(1);
		sliderList.add(slider17);
		panelSlider.add(slider17);
		
		slider18 = new JSlider();
		slider18.setBounds(0, 373, 200, 23);
		slider18.setValue(4);
		slider18.setMinimum(1);
		slider18.setMaximum(7);
		slider18.setMajorTickSpacing(1);
		sliderList.add(slider18);
		panelSlider.add(slider18);
		
		slider19 = new JSlider();
		slider19.setBounds(0, 395, 200, 23);
		slider19.setBackground(SystemColor.window);
		slider19.setValue(4);
		slider19.setMinimum(1);
		slider19.setMaximum(7);
		slider19.setMajorTickSpacing(1);
		sliderList.add(slider19);
		panelSlider.add(slider19);
		
		slider20 = new JSlider();
		slider20.setBounds(0, 417, 200, 23);
		slider20.setValue(4);
		slider20.setMinimum(1);
		slider20.setMaximum(7);
		slider20.setMajorTickSpacing(1);
		sliderList.add(slider20);
		panelSlider.add(slider20);
		
		slider21 = new JSlider();
		slider21.setBounds(0, 439, 200, 23);
		slider21.setBackground(SystemColor.window);
		slider21.setValue(4);
		slider21.setMinimum(1);
		slider21.setMaximum(7);
		slider21.setMajorTickSpacing(1);
		sliderList.add(slider21);
		panelSlider.add(slider21);
		
		slider22 = new JSlider();
		slider22.setBounds(0, 461, 200, 23);
		slider22.setValue(4);
		slider22.setMinimum(1);
		slider22.setMaximum(7);
		slider22.setMajorTickSpacing(1);
		sliderList.add(slider22);
		panelSlider.add(slider22);
		
		slider23 = new JSlider();
		slider23.setBounds(0, 483, 200, 23);
		slider23.setBackground(SystemColor.window);
		slider23.setValue(4);
		slider23.setMinimum(1);
		slider23.setMaximum(7);
		slider23.setMajorTickSpacing(1);
		sliderList.add(slider23);
		panelSlider.add(slider23);
		
		slider24 = new JSlider();
		slider24.setBounds(0, 505, 200, 23);
		slider24.setValue(4);
		slider24.setMinimum(1);
		slider24.setMaximum(7);
		slider24.setMajorTickSpacing(1);
		sliderList.add(slider24);
		panelSlider.add(slider24);
		
		slider25 = new JSlider();
		slider25.setBounds(0, 527, 200, 23);
		slider25.setBackground(SystemColor.window);
		slider25.setValue(4);
		slider25.setMinimum(1);
		slider25.setMaximum(7);
		slider25.setMajorTickSpacing(1);
		sliderList.add(slider25);
		panelSlider.add(slider25);
		
		slider26 = new JSlider();
		slider26.setBounds(0, 549, 200, 23);
		slider26.setValue(4);
		slider26.setMinimum(1);
		slider26.setMaximum(7);
		slider26.setMajorTickSpacing(1);
		sliderList.add(slider26);
		panelSlider.add(slider26);
		
		slider27 = new JSlider();
		slider27.setBounds(0, 571, 200, 23);
		slider27.setBackground(SystemColor.window);
		slider27.setValue(4);
		slider27.setMinimum(1);
		slider27.setMaximum(7);
		slider27.setMajorTickSpacing(1);
		sliderList.add(slider27);
		panelSlider.add(slider27);
		
		slider28 = new JSlider();
		slider28.setBounds(0, 593, 200, 23);
		slider28.setValue(4);
		slider28.setMinimum(1);
		slider28.setMaximum(7);
		slider28.setMajorTickSpacing(1);
		sliderList.add(slider28);
		panelSlider.add(slider28);
		
		slider29 = new JSlider();
		slider29.setBounds(0, 615, 200, 23);
		slider29.setBackground(SystemColor.window);
		slider29.setValue(4);
		slider29.setMinimum(1);
		slider29.setMaximum(7);
		slider29.setMajorTickSpacing(1);
		sliderList.add(slider29);
		panelSlider.add(slider29);
		
		slider30 = new JSlider();
		slider30.setBounds(0, 637, 200, 23);
		slider30.setValue(4);
		slider30.setMinimum(1);
		slider30.setMaximum(7);
		slider30.setMajorTickSpacing(1);
		sliderList.add(slider30);
		panelSlider.add(slider30);
		
		JPanel panelQuestions = new JPanel();
		panelQuestions.setBounds(0, 0, 751, 685);
		panelQuiz.add(panelQuestions);
		panelQuestions.setLayout(new GridLayout(30, 1, 0, 0));
		
		/********/
		ArrayList<Question> questions = Survey.getQuestions(); 
		/********/
		
		JTextPane txtpnYouFind = new JTextPane();
		txtpnYouFind.setName("Q1");
		txtpnYouFind.setEditable(false);
		panelQuestions.add(txtpnYouFind);
		txtpnYouFind.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouFind.setText(questions.get(0).getQuestion());
		
		JTextPane txtpnYouOften = new JTextPane();
		txtpnYouOften.setEditable(false);
		txtpnYouOften.setBackground(SystemColor.control);
		txtpnYouOften.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouOften.setText(questions.get(1).getQuestion());
		panelQuestions.add(txtpnYouOften);
		
		JTextPane txtpnYouFind_1 = new JTextPane();
		txtpnYouFind_1.setEditable(false);
		txtpnYouFind_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouFind_1.setText(questions.get(2).getQuestion());
		panelQuestions.add(txtpnYouFind_1);
		
		JTextPane txtpnYouDo = new JTextPane();
		txtpnYouDo.setBackground(SystemColor.control);
		panelQuestions.add(txtpnYouDo);
		txtpnYouDo.setText(questions.get(3).getQuestion());
		txtpnYouDo.setName("Q1");
		txtpnYouDo.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouDo.setEditable(false);
		
		JTextPane txtpnYouFeel = new JTextPane();
		txtpnYouFeel.setEditable(false);
		panelQuestions.add(txtpnYouFeel);
		txtpnYouFeel.setText(questions.get(4).getQuestion());
		txtpnYouFeel.setFont(new Font("Cambria", Font.PLAIN, 16));
		
		JTextPane txtpnBeingOrganized = new JTextPane();
		txtpnBeingOrganized.setEditable(false);
		txtpnBeingOrganized.setBackground(SystemColor.control);
		panelQuestions.add(txtpnBeingOrganized);
		txtpnBeingOrganized.setText(questions.get(5).getQuestion());
		txtpnBeingOrganized.setFont(new Font("Cambria", Font.PLAIN, 16));
		
		JTextPane txtpnWinningA = new JTextPane();
		txtpnWinningA.setEditable(false);
		panelQuestions.add(txtpnWinningA);
		txtpnWinningA.setText(questions.get(6).getQuestion());
		txtpnWinningA.setFont(new Font("Cambria", Font.PLAIN, 16));
		
		JTextPane txtpnYouDo_1 = new JTextPane();
		txtpnYouDo_1.setBackground(SystemColor.control);
		txtpnYouDo_1.setText(questions.get(7).getQuestion());
		txtpnYouDo_1.setName("Q1");
		txtpnYouDo_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouDo_1.setEditable(false);
		panelQuestions.add(txtpnYouDo_1);
		
		JTextPane txtpnYouConsider = new JTextPane();
		txtpnYouConsider.setEditable(false);
		txtpnYouConsider.setText(questions.get(8).getQuestion());
		txtpnYouConsider.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouConsider);
		
		JTextPane txtpnPeopleCan = new JTextPane();
		txtpnPeopleCan.setEditable(false);
		txtpnPeopleCan.setBackground(SystemColor.control);
		txtpnPeopleCan.setText(questions.get(9).getQuestion());
		txtpnPeopleCan.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnPeopleCan);
		
		JTextPane txtpnYourTravel = new JTextPane();
		txtpnYourTravel.setEditable(false);
		txtpnYourTravel.setText(questions.get(10).getQuestion());
		txtpnYourTravel.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYourTravel);
		
		JTextPane txtpnItIs = new JTextPane();
		txtpnItIs.setBackground(SystemColor.control);
		txtpnItIs.setText(questions.get(11).getQuestion());
		txtpnItIs.setName("Q1");
		txtpnItIs.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnItIs.setEditable(false);
		panelQuestions.add(txtpnItIs);
		
		JTextPane txtpnYourMood = new JTextPane();
		txtpnYourMood.setEditable(false);
		txtpnYourMood.setText(questions.get(12).getQuestion());
		txtpnYourMood.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYourMood);
		
		JTextPane txtpnInA = new JTextPane();
		txtpnInA.setEditable(false);
		txtpnInA.setBackground(SystemColor.control);
		txtpnInA.setText(questions.get(13).getQuestion());
		txtpnInA.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnInA);
		
		JTextPane txtpnYouRarely = new JTextPane();
		txtpnYouRarely.setEditable(false);
		txtpnYouRarely.setText(questions.get(14).getQuestion());
		txtpnYouRarely.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouRarely);
		
		JTextPane txtpnYouRarely_1 = new JTextPane();
		txtpnYouRarely_1.setBackground(SystemColor.control);
		txtpnYouRarely_1.setText(questions.get(15).getQuestion());
		txtpnYouRarely_1.setName("Q1");
		txtpnYouRarely_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouRarely_1.setEditable(false);
		panelQuestions.add(txtpnYouRarely_1);
		
		JTextPane txtpnYouOften_1 = new JTextPane();
		txtpnYouOften_1.setEditable(false);
		txtpnYouOften_1.setText(questions.get(16).getQuestion());
		txtpnYouOften_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouOften_1);
		
		JTextPane txtpnYouDo_2 = new JTextPane();
		txtpnYouDo_2.setEditable(false);
		txtpnYouDo_2.setBackground(SystemColor.control);
		txtpnYouDo_2.setText(questions.get(17).getQuestion());
		txtpnYouDo_2.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouDo_2);
		
		JTextPane txtpnYourDreams = new JTextPane();
		txtpnYourDreams.setEditable(false);
		txtpnYourDreams.setText(questions.get(18).getQuestion());
		txtpnYourDreams.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYourDreams);
		
		JTextPane txtpnYouOften_2 = new JTextPane();
		txtpnYouOften_2.setBackground(SystemColor.control);
		txtpnYouOften_2.setText(questions.get(19).getQuestion());
		txtpnYouOften_2.setName("Q1");
		txtpnYouOften_2.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnYouOften_2.setEditable(false);
		panelQuestions.add(txtpnYouOften_2);
		
		JTextPane txtpnYouWould = new JTextPane();
		txtpnYouWould.setEditable(false);
		txtpnYouWould.setText(questions.get(20).getQuestion());
		txtpnYouWould.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouWould);
		
		JTextPane txtpnYouAre = new JTextPane();
		txtpnYouAre.setEditable(false);
		txtpnYouAre.setBackground(SystemColor.control);
		txtpnYouAre.setText(questions.get(21).getQuestion());
		txtpnYouAre.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouAre);
		
		JTextPane txtpnYouOften_3 = new JTextPane();
		txtpnYouOften_3.setEditable(false);
		txtpnYouOften_3.setText(questions.get(22).getQuestion());
		txtpnYouOften_3.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouOften_3);
		
		JTextPane txtpnIfYour = new JTextPane();
		txtpnIfYour.setBackground(SystemColor.control);
		txtpnIfYour.setText(questions.get(23).getQuestion());
		txtpnIfYour.setName("Q1");
		txtpnIfYour.setFont(new Font("Cambria", Font.PLAIN, 16));
		txtpnIfYour.setEditable(false);
		panelQuestions.add(txtpnIfYour);
		
		JTextPane txtpnBeingRight = new JTextPane();
		txtpnBeingRight.setEditable(false);
		txtpnBeingRight.setText(questions.get(24).getQuestion());
		txtpnBeingRight.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnBeingRight);
		
		JTextPane txtpnYouFrequently = new JTextPane();
		txtpnYouFrequently.setEditable(false);
		txtpnYouFrequently.setBackground(SystemColor.control);
		txtpnYouFrequently.setText(questions.get(25).getQuestion());
		txtpnYouFrequently.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouFrequently);
		
		JTextPane txtpnYouFrequently_1 = new JTextPane();
		txtpnYouFrequently_1.setEditable(false);
		txtpnYouFrequently_1.setText(questions.get(26).getQuestion());
		txtpnYouFrequently_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouFrequently_1);
		
		JTextPane txtpnYourMind = new JTextPane();
		txtpnYourMind.setEditable(false);
		txtpnYourMind.setBackground(SystemColor.control);
		txtpnYourMind.setText(questions.get(27).getQuestion());
		txtpnYourMind.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYourMind);
		
		JTextPane txtpnYouHave = new JTextPane();
		txtpnYouHave.setEditable(false);
		txtpnYouHave.setText(questions.get(28).getQuestion());
		txtpnYouHave.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouHave);
		
		JTextPane txtpnYouOften_4 = new JTextPane();
		txtpnYouOften_4.setEditable(false);
		txtpnYouOften_4.setBackground(SystemColor.control);
		txtpnYouOften_4.setText(questions.get(29).getQuestion());
		txtpnYouOften_4.setFont(new Font("Cambria", Font.PLAIN, 16));
		panelQuestions.add(txtpnYouOften_4);
		
		btnResults = new JButton("RESULT");
		btnResults.setFont(new Font("Cambria", Font.PLAIN, 14));
		btnResults.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				infoResult = DroolsTest.recommendACarByPersonality(calculatePersonality());
				showResultOnWindow();
			}
		});
		/*btnResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});*/
		btnResults.setBounds(962, 540, 102, 83);
		panelQuiz.add(btnResults);
		
		JButton btnRandom = new JButton("RANDOM");
		btnRandom.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnRandom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				randomSliders();
			}
		});
		btnRandom.setBounds(962, 634, 102, 23);
		panelQuiz.add(btnRandom);
		panelObj.setBounds(0, 0, 1084, 711);
		frmCarAdvisorExpert.getContentPane().add(panelObj);
		panelObj.setLayout(null);
		
		txtQuiz = new JTextField();
		txtQuiz.setEditable(false);
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
		txtDisagree.setBounds(973, 4, 99, 20);
		panelObj.add(txtDisagree);
		txtDisagree.setText("Agree");
		txtDisagree.setColumns(10);
		
		txtAgree = new JTextField();
		txtAgree.setEditable(false);
		txtAgree.setBorder(null);
		txtAgree.setBackground(SystemColor.control);
		txtAgree.setFont(new Font("Cambria", Font.BOLD, 14));
		txtAgree.setBounds(695, 5, 64, 20);
		panelObj.add(txtAgree);
		txtAgree.setText("Disagree");
		txtAgree.setColumns(10);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBorder(null);
		textField.setBackground(SystemColor.control);
		textField.setFont(new Font("Cambria", Font.PLAIN, 16));
		textField.setText("3  -   2  -  1  -  0  -  1  -   2  -  3");
		textField.setBounds(759, 4, 202, 20);
		panelObj.add(textField);
		textField.setColumns(12);
		
		panelSplash = new JPanel();
		panelSplash.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSplash.setBounds(292, 172, 548, 362);
		frmCarAdvisorExpert.getContentPane().add(panelSplash);
		panelSplash.setLayout(null);
		
		JLabel lblCarAdvisorExpert = new JLabel("CAR ADVISOR EXPERT SYSTEM");
		lblCarAdvisorExpert.setBounds(82, 100, 408, 32);
		panelSplash.add(lblCarAdvisorExpert);
		lblCarAdvisorExpert.setFont(new Font("Cambria", Font.BOLD, 26));
		
		JTextPane txtpnAnExpertSystem = new JTextPane();
		txtpnAnExpertSystem.setBounds(101, 155, 370, 56);
		panelSplash.add(txtpnAnExpertSystem);
		txtpnAnExpertSystem.setEditable(false);
		txtpnAnExpertSystem.setBackground(SystemColor.control);
		txtpnAnExpertSystem.setFont(new Font("Cambria", Font.PLAIN, 20));
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
		btnNewButton.setBounds(227, 234, 100, 50);
		panelSplash.add(btnNewButton);
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 16));
	}
	
private void showResultOnWindow(){
		
		if( infoResult == null) {
			btnResults.setBackground(Color.RED);
			return;
		}
		
		frmCarResult = new JFrame();
		frmCarResult.getContentPane().setFont(new Font("Cambria", Font.PLAIN, 18));
		frmCarResult.setTitle("RESULTS FOR " + infoResult.getTraits());
		//frmCarResult.setType(Type.POPUP);
		frmCarResult.setBounds(0, 0, 505, 600);
		frmCarResult.setLocationRelativeTo(frmCarAdvisorExpert);
		frmCarResult.getContentPane().setLayout(null);
		frmCarResult.setBackground(SystemColor.control);
		frmCarResult.setResizable(false);
		
		panelResult = new JPanel();
		panelResult.setBackground(Color.WHITE);
		panelResult.setBounds(0, 0, 500, 575);
		panelResult.setLayout(null);
		panelResult.setBackground(SystemColor.controlHighlight);
		panelResult.setVisible(true);
		
		panelInfoPersonality = new JPanel();
		panelInfoPersonality.setBounds(10, 11, 480, 118);
		panelResult.add(panelInfoPersonality);
		panelInfoPersonality.setLayout(null);
		
		JTextPane txtpnInforPer = new JTextPane();
		txtpnInforPer.setBackground(SystemColor.controlHighlight);
		txtpnInforPer.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtpnInforPer.setBounds(0, 0, 480, 118);
		txtpnInforPer.setEditable(false);
		txtpnInforPer.setText(infoResult.getPersonalityInfo());
		panelInfoPersonality.add(txtpnInforPer);

		panelCarImage = new JPanel();
		panelCarImage.setBounds(70, 140, 360, 243);
		panelResult.add(panelCarImage);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UI.class.getResource("/res/"+infoResult.getCarSelected().getId()+".jpg")));//..getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		panelCarImage.add(lblNewLabel);
		
		panelCarSpecs = new JPanel();
		panelCarSpecs.setBackground(SystemColor.controlHighlight);
		panelCarSpecs.setBounds(70, 394, 360, 130);
		panelResult.add(panelCarSpecs);
		panelCarSpecs.setLayout(null);
		
		JTextPane textPaneMaker = new JTextPane();
		textPaneMaker.setText("Make: "+infoResult.getCarSelected().getMake());
		textPaneMaker.setMargin(new Insets(0, 0, 0, 0));
		textPaneMaker.setFont(new Font("Cambria", Font.PLAIN, 18));
		textPaneMaker.setEditable(false);
		textPaneMaker.setBackground(SystemColor.controlHighlight);
		textPaneMaker.setBounds(0, 0, 360, 21);
		panelCarSpecs.add(textPaneMaker);
		
		JTextPane textPaneModel = new JTextPane();
		textPaneModel.setMargin(new Insets(0, 0, 0, 0));
		textPaneModel.setFont(new Font("Cambria", Font.PLAIN, 18));
		textPaneModel.setBackground(SystemColor.controlHighlight);
		textPaneModel.setBounds(0, 27, 360, 21);
		textPaneModel.setEditable(false);
		textPaneModel.setText("Model: "+infoResult.getCarSelected().getModel());
		panelCarSpecs.add(textPaneModel);
		
		JTextPane textPaneBody = new JTextPane();
		textPaneBody.setMargin(new Insets(0, 0, 0, 0));
		textPaneBody.setText("Style: "+ infoResult.getStyleType());
		textPaneBody.setFont(new Font("Cambria", Font.PLAIN, 18));
		textPaneBody.setEditable(false);
		textPaneBody.setBackground(SystemColor.controlHighlight);
		textPaneBody.setBounds(0, 54, 360, 21);
		panelCarSpecs.add(textPaneBody);
		
		JTextPane textPaneYearPrice = new JTextPane();
		textPaneYearPrice.setText("Year: "+infoResult.getCarSelected().getYear()+"     "+"Price: $"+infoResult.getCarSelected().getPrice());
		textPaneYearPrice.setMargin(new Insets(0, 0, 0, 0));
		textPaneYearPrice.setFont(new Font("Cambria", Font.PLAIN, 18));
		textPaneYearPrice.setEditable(false);
		textPaneYearPrice.setBackground(SystemColor.controlHighlight);
		textPaneYearPrice.setBounds(0, 79, 360, 21);
		panelCarSpecs.add(textPaneYearPrice);
		
		JTextPane textPaneCapacWei = new JTextPane();
		textPaneCapacWei.setText("Seat Capacity: "+infoResult.getCarSelected().getCapacity()+"     "+"Weight: "+infoResult.getCarSelected().getWeight()+" Kg");
		textPaneCapacWei.setMargin(new Insets(0, 0, 0, 0));
		textPaneCapacWei.setFont(new Font("Cambria", Font.PLAIN, 18));
		textPaneCapacWei.setEditable(false);
		textPaneCapacWei.setBackground(SystemColor.controlHighlight);
		textPaneCapacWei.setBounds(0, 105, 360, 21);
		panelCarSpecs.add(textPaneCapacWei);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmCarResult.dispatchEvent(new WindowEvent(frmCarResult, WindowEvent.WINDOW_CLOSING));
				frmCarResult = null;
			}
		});
		btnNewButton_1.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnNewButton_1.setBounds(70, 535, 360, 30);
		panelResult.add(btnNewButton_1);
		
		frmCarResult.getContentPane().add(panelResult);
		frmCarResult.setVisible(true);
	}
	
	public Personality calculatePersonality(){
		ArrayList<double[]> ListaEI;
		ListaEI=new ArrayList();
		ArrayList<double[]>ListaSN;
		ListaSN=new ArrayList();
		ArrayList<double[]> ListaTF;
		ListaTF=new ArrayList();
		ArrayList<double[]>ListaJP;
		ListaJP=new ArrayList();
		double vector[]=new double[2];
		String EI,SN,TF,JP;

		vector=MultipleChoice.Calcular_Percent_ExtravertionVsIntravertion(slider1.getValue());
		ListaEI.add(vector);
		vector=MultipleChoice.Calcular_Percent_ExtravertionVsIntravertion(slider4.getValue());
		ListaEI.add(vector);
		vector=MultipleChoice.Calcular_Percent_ExtravertionVsIntravertion(slider8.getValue());
		ListaEI.add(vector);
		vector=MultipleChoice.Calcular_Percent_ExtravertionVsIntravertion(slider12.getValue());
		ListaEI.add(vector);
		vector=MultipleChoice.Calcular_Percent_ExtravertionVsIntravertion(slider23.getValue());
		ListaEI.add(vector);
		vector=MultipleChoice.Calcular_Percent_ExtravertionVsIntravertion(slider28.getValue());
		ListaEI.add(vector);
		vector=MultipleChoice.Calcular_Percent_ExtravertionVsIntravertion(slider30.getValue());
		ListaEI.add(vector);
		EI=MultipleChoice.Evaluar_Pregunta_ExtravertionVsIntravertion(ListaEI);
		//System.out.println(EI);
		
		vector=MultipleChoice.Calcular_Percent_SensingVsIntuition(slider3.getValue());
		ListaSN.add(vector);
		vector=MultipleChoice.Calcular_Percent_SensingVsIntuition(slider16.getValue());
		ListaSN.add(vector);
		vector=MultipleChoice.Calcular_Percent_SensingVsIntuition(slider17.getValue());
		ListaSN.add(vector);
		vector=MultipleChoice.Calcular_Percent_SensingVsIntuition(slider20.getValue());
		ListaSN.add(vector);
		vector=MultipleChoice.Calcular_Percent_SensingVsIntuition(slider21.getValue());
		ListaSN.add(vector);
		vector=MultipleChoice.Calcular_Percent_SensingVsIntuition(slider24.getValue());
		ListaSN.add(vector);
		vector=MultipleChoice.Calcular_Percent_SensingVsIntuition(slider26.getValue());
		ListaSN.add(vector);
		vector=MultipleChoice.Calcular_Percent_SensingVsIntuition(slider29.getValue());
		ListaSN.add(vector);
		SN=MultipleChoice.Evaluar_Pregunta_SensingVsIntuition(ListaSN);
		//System.out.println(SN);
		
		vector=MultipleChoice.Calcular_Percent_ThinkingVsFeeling(slider2.getValue());
		ListaTF.add(vector);
		vector=MultipleChoice.Calcular_Percent_ThinkingVsFeeling(slider7.getValue());
		ListaTF.add(vector);
		vector=MultipleChoice.Calcular_Percent_ThinkingVsFeeling(slider10.getValue());
		ListaTF.add(vector);
		vector=MultipleChoice.Calcular_Percent_ThinkingVsFeeling(slider13.getValue());
		ListaTF.add(vector);
		vector=MultipleChoice.Calcular_Percent_ThinkingVsFeeling(slider14.getValue());
		ListaTF.add(vector);
		vector=MultipleChoice.Calcular_Percent_ThinkingVsFeeling(slider15.getValue());
		ListaTF.add(vector);
		vector=MultipleChoice.Calcular_Percent_ThinkingVsFeeling(slider18.getValue());
		ListaTF.add(vector);
		vector=MultipleChoice.Calcular_Percent_ThinkingVsFeeling(slider25.getValue());
		ListaTF.add(vector);
		TF=MultipleChoice.Evaluar_Pregunta_ThinkingVsFeeling(ListaTF);
		//System.out.println(TF);
		
		vector=MultipleChoice.Calcular_Percent_JudgingVsPerceiving(slider5.getValue());
		ListaJP.add(vector);
		vector=MultipleChoice.Calcular_Percent_JudgingVsPerceiving(slider6.getValue());
		ListaJP.add(vector);
		vector=MultipleChoice.Calcular_Percent_JudgingVsPerceiving(slider9.getValue());
		ListaJP.add(vector);
		vector=MultipleChoice.Calcular_Percent_JudgingVsPerceiving(slider11.getValue());
		ListaJP.add(vector);
		vector=MultipleChoice.Calcular_Percent_JudgingVsPerceiving(slider19.getValue());
		ListaJP.add(vector);
		vector=MultipleChoice.Calcular_Percent_JudgingVsPerceiving(slider22.getValue());
		ListaJP.add(vector);
		vector=MultipleChoice.Calcular_Percent_JudgingVsPerceiving(slider27.getValue());
		ListaJP.add(vector);
		JP=MultipleChoice.Evaluar_Pregunta_JudgingVsPerceiving(ListaJP);
		//System.out.println(JP);
		//System.out.println("-------------");
		
		return Quiz.DefinirPersonalidad(EI, SN, TF, JP);
	}
	
	public void randomSliders(){
		if(sliderList == null) return;
		for(JSlider slider: sliderList){
			if(slider != null){
				slider.setValue(1 + (int)(Math.random() * ((7 - 1) + 1)));
				
				
			}
				
		}
	}
}
