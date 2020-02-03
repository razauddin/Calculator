package cp213;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
/**
 * 
 * @author Raza Naeemuddin(160411700)
 * @version 10.0.02/1.8.0_181
 * @since 2018-11-04
 * 
 *
 */
public class calculator extends JFrame {
	/* Calculator dimensions height and width */
	public static final int WIDTH = 300;
	public static final int HEIGHT = 400;

	// Initializes buttons
	private JButton buttonSeven = new JButton("7");
	private JButton buttonEight = new JButton("8");
	private JButton buttonNine = new JButton("9");
	private JButton buttonDivide = new JButton("/");
	private JButton buttonC = new JButton("C");
	private JButton buttonFour = new JButton("4");
	private JButton buttonFive = new JButton("5");
	private JButton buttonSix = new JButton("6");
	private JButton buttonMultiply = new JButton("*");
	private JButton buttonOne = new JButton("1");
	private JButton buttonTwo = new JButton("2");
	private JButton buttonThree = new JButton("3");
	private JButton buttonSubtract = new JButton("-");
	private JButton buttonZero = new JButton("0");
	private JButton buttonAdd = new JButton("+");
	private JButton buttonEqual = new JButton("=");

	// Initializes labels
	private JLabel inputLabel = new JLabel();
	private JLabel outputLabel = new JLabel();

	// Initlaizes panels
	private JPanel screen = new JPanel();
	private JPanel buttonScreen = new JPanel();
	private JPanel inputScreen = new JPanel();
	private JPanel outputScreen = new JPanel();

	private double tempFirst = -1;

	private boolean[] operation = new boolean[4];

	public double getTempFirst() {
		return tempFirst;
	}

	public void setTempFirst(double tempFirst) {
		this.tempFirst = tempFirst;
	}

	public static void main(String Args[]) {
		new calculator();

	}

	public calculator() {
		super();
		/* Parameters needed to define calculator/shape of it */
		setSize(WIDTH, HEIGHT);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));

		inputScreen.setBackground(new Color(150, 150, 150));
		outputScreen.setBackground(new Color(150, 150, 150));

		/* Adds the panels to the template */
		inputScreen.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1)));
		outputScreen.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1)));

		screen.setLayout(new GridLayout(2, 1));
		buttonScreen.setLayout(new GridLayout(4, 5));
		add(screen);
		add(buttonScreen);
		screen.add(inputScreen);
		screen.add(outputScreen);

		inputScreen.add(inputLabel);
		outputScreen.add(outputLabel);

		/* Adds buttons to buttonScreen panel */
		buttonScreen.add(buttonSeven);
		buttonScreen.add(buttonEight);
		buttonScreen.add(buttonNine);
		buttonScreen.add(buttonDivide);
		buttonScreen.add(buttonC);
		buttonScreen.add(buttonFour);
		buttonScreen.add(buttonFive);
		buttonScreen.add(buttonSix);
		buttonScreen.add(buttonMultiply);
		buttonScreen.add(new JButton());
		buttonScreen.add(buttonOne);
		buttonScreen.add(buttonTwo);
		buttonScreen.add(buttonThree);
		buttonScreen.add(buttonSubtract);
		buttonScreen.add(new JButton());
		buttonScreen.add(new JButton());
		buttonScreen.add(buttonZero);
		buttonScreen.add(new JButton());
		buttonScreen.add(buttonAdd);
		buttonScreen.add(buttonEqual);

		setVisible(true);

		// Adds listeners
		buttonZero.addActionListener(new buttonZeroL());
		buttonOne.addActionListener(new buttonOneL());
		buttonTwo.addActionListener(new buttonTwoL());
		buttonThree.addActionListener(new buttonThreeL());
		buttonFour.addActionListener(new buttonFourL());
		buttonFive.addActionListener(new buttonFiveL());
		buttonSix.addActionListener(new buttonSixL());
		buttonSeven.addActionListener(new buttonSevenL());
		buttonEight.addActionListener(new buttonEightL());
		buttonNine.addActionListener(new buttonNineL());
		buttonAdd.addActionListener(new buttonAddL());
		buttonSubtract.addActionListener(new buttonSubtractL());
		buttonMultiply.addActionListener(new buttonMultiplyL());
		buttonDivide.addActionListener(new buttonDivideL());
		buttonC.addActionListener(new buttonCL());
		buttonEqual.addActionListener(new buttonEqualL());

	}

	// Programs the buttons
	class buttonZeroL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			inputLabel.setText(inputLabel.getText() + "0");

		}

	}

	class buttonOneL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			inputLabel.setText(inputLabel.getText() + "1");

		}
	}

	class buttonTwoL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			inputLabel.setText(inputLabel.getText() + "2");

		}

	}

	class buttonThreeL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			inputLabel.setText(inputLabel.getText() + "3");

		}

	}

	class buttonFourL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			inputLabel.setText(inputLabel.getText() + "4");

		}
	}

	class buttonFiveL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			inputLabel.setText(inputLabel.getText() + "5");

		}

	}

	class buttonSixL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			inputLabel.setText(inputLabel.getText() + "6");

		}

	}

	class buttonSevenL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			inputLabel.setText(inputLabel.getText() + "7");

		}

	}

	class buttonEightL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			inputLabel.setText(inputLabel.getText() + "8");

		}

	}

	class buttonNineL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			inputLabel.setText(inputLabel.getText() + "9");

		}

	}

	class buttonAddL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				setTempFirst(Double.parseDouble(inputLabel.getText()));
			} catch (Exception e) {
			}
			inputLabel.setText(inputLabel.getText() + "+");
			operation[3] = true;

		}

	}

	class buttonSubtractL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				setTempFirst(Double.parseDouble(inputLabel.getText()));
			} catch (Exception e) {
			}
			inputLabel.setText(inputLabel.getText() + "-");
			operation[2] = true;

		}

	}

	class buttonMultiplyL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				setTempFirst(Double.parseDouble(inputLabel.getText()));
			} catch (Exception e) {
			}

			inputLabel.setText(inputLabel.getText() + "*");
			operation[1] = true;

		}

	}

	class buttonDivideL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				setTempFirst(Double.parseDouble(inputLabel.getText()));
			} catch (Exception e) {
			}
			inputLabel.setText(inputLabel.getText() + "/");
			operation[0] = true;

		}

	}

	class buttonCL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			inputLabel.setText("");
			outputLabel.setText("");
			setTempFirst(-1);
			for (int i = 0; i < 4; i++) {
				operation[i] = false;
			}

		}

	}

	class buttonEqualL implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				String a[] = inputLabel.getText().split("");
				String sNum = inputLabel.getText();

				if (operation[0]) {
					for (int i = 0; i < a.length; i++) {
						if (a[i].equals("/"))
							sNum = sNum.substring(i + 1);
					}
					System.out.println(getTempFirst());
					if (Double.parseDouble(sNum) != 0 && getTempFirst() != -1)
						outputLabel.setText(Double.toString(getTempFirst() / Double.parseDouble(sNum)));
					else {
						inputLabel.setText("");
						outputLabel.setText("0.0");
					}

					a = new String[a.length];
				} else if (operation[1]) {

					for (int i = 0; i < a.length; i++) {
						if (a[i].equals("*"))
							sNum = sNum.substring(i + 1);

					}
					if (getTempFirst() != -1)
						outputLabel.setText(Double.toString(getTempFirst() * Double.parseDouble(sNum)));
					else {
						inputLabel.setText("");
						outputLabel.setText("0.0");

					}
					a = new String[a.length];

				} else if (operation[2]) {

					for (int i = 0; i < a.length; i++) {
						if (a[i].equals("-"))
							sNum = sNum.substring(i + 1);

					}
					if (getTempFirst() != -1)
						outputLabel.setText(Double.toString(getTempFirst() - Double.parseDouble(sNum)));
					else {
						inputLabel.setText("");
						outputLabel.setText("0.0");
					}
					a = new String[a.length];

				} else if (operation[3]) {

					for (int i = 0; i < a.length; i++) {
						if (a[i].equals("+"))
							sNum = sNum.substring(i + 1);

					}
					if (getTempFirst() != -1)
						outputLabel.setText(Double.toString(getTempFirst() + Double.parseDouble(sNum)));
					else {
						inputLabel.setText("");
						outputLabel.setText("0.0");
					}
					a = new String[a.length];
				} else {
					outputLabel.setText(Double.toString(Double.parseDouble(inputLabel.getText())));
				}
			} catch (Exception e) {
				inputLabel.setText("");
				outputLabel.setText("0.0");
			}
			setTempFirst(-1);

			for (int i = 0; i < 4; i++) {
				operation[i] = false;
			}

		}

	}

}
