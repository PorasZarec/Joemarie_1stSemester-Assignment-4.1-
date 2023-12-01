import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.util.regex.*;


public class mainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private static JTextField txt_user_Fname;
	private static JTextField txt_user_Mname;
	public static JTextField txt_user_Lname;
	public static JTextField txt_user_contactNum;
	private JLabel lblFirstName;
	private JLabel lblWelcome;
	private JLabel lblMiddleName;
	private JLabel lblCourse;
	private JLabel lblLastName;
	private JLabel lblContactNumber;
	
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	
	private static Checkbox cb_terms;
	private static CheckboxGroup checkboxGroup;
	private static Choice choice_course;
	private static Checkbox radBtn_male;
	private static Checkbox radBtn_female;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("ic_svcc_logo.png")); // set the Image in task bar and icon bar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // Disable window resizing
        setTitle("Simple Student Enrollment GUI"); // Set window title
		setBounds(100, 100, 680, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_user_Fname = new JTextField();
		txt_user_Fname.setHorizontalAlignment(SwingConstants.CENTER);
		txt_user_Fname.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		txt_user_Fname.setBounds(83, 119, 500, 30);
		contentPane.add(txt_user_Fname);
		txt_user_Fname.setColumns(10);
		
		lblFirstName = new JLabel("First name :");
		lblFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstName.setFont(new Font("Roboto Medium", Font.BOLD, 12));
		lblFirstName.setBounds(92, 89, 100, 30);
		contentPane.add(lblFirstName);
		
		lblWelcome = new JLabel("Welcome!");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Roboto Medium", Font.BOLD, 30));
		lblWelcome.setBounds(3, 10, 660, 69);
		contentPane.add(lblWelcome);
		
		lblMiddleName = new JLabel("Middle name :");
		lblMiddleName.setHorizontalAlignment(SwingConstants.LEFT);
		lblMiddleName.setFont(new Font("Roboto Medium", Font.BOLD, 12));
		lblMiddleName.setBounds(92, 159, 100, 30);
		contentPane.add(lblMiddleName);
		
		txt_user_Mname = new JTextField();
		txt_user_Mname.setHorizontalAlignment(SwingConstants.CENTER);
		txt_user_Mname.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		txt_user_Mname.setColumns(10);
		txt_user_Mname.setBounds(83, 189, 500, 30);
		contentPane.add(txt_user_Mname);
		
		lblLastName = new JLabel("Last name :");
		lblLastName.setHorizontalAlignment(SwingConstants.LEFT);
		lblLastName.setFont(new Font("Roboto Medium", Font.BOLD, 12));
		lblLastName.setBounds(92, 229, 100, 30);
		contentPane.add(lblLastName);
		
		txt_user_Lname = new JTextField();
		txt_user_Lname.setHorizontalAlignment(SwingConstants.CENTER);
		txt_user_Lname.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		txt_user_Lname.setColumns(10);
		txt_user_Lname.setBounds(83, 259, 500, 30);
		contentPane.add(txt_user_Lname);
		
		lblContactNumber = new JLabel("Contact number :");
		lblContactNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblContactNumber.setFont(new Font("Roboto Medium", Font.BOLD, 12));
		lblContactNumber.setBounds(92, 299, 100, 30);
		contentPane.add(lblContactNumber);
		
		txt_user_contactNum = new JTextField();
		txt_user_contactNum.setHorizontalAlignment(SwingConstants.CENTER);
		txt_user_contactNum.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		txt_user_contactNum.setColumns(10);
		txt_user_contactNum.setBounds(83, 329, 500, 30);
		contentPane.add(txt_user_contactNum);
		
		lblCourse = new JLabel("( Select Course )");
		lblCourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourse.setFont(new Font("Roboto Medium", Font.BOLD, 12));
		lblCourse.setBounds(283, 369, 100, 30);
		contentPane.add(lblCourse);
		
	// adding Choice drop down
		
		choice_course = new Choice();
		choice_course.add("Bachelor of Science in Information Technology");
		choice_course.add("Bachelor of Science in Computer Science");
		choice_course.add("Bachelor of Science in Computer Engineering");
		choice_course.setFont(new Font("Roboto Black", Font.PLAIN, 20));
		choice_course.setBounds(83, 399, 500, 30);
		contentPane.add(choice_course);
		
	// adding RADIO BUTTONS
		
		checkboxGroup = new CheckboxGroup();
		radBtn_male = new Checkbox("Male", checkboxGroup, false);
		radBtn_female = new Checkbox("Female", checkboxGroup, false);
		
		radBtn_male.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		radBtn_male.setBounds(147, 434, 125, 30);
		contentPane.add(radBtn_male);
		
		radBtn_female.setFont(new Font("Roboto Medium", Font.PLAIN, 15));
		radBtn_female.setBounds(147, 466, 125, 30);
		contentPane.add(radBtn_female);
	
	// Adding Images using Label
		
		ImageIcon icon = new ImageIcon("C:\\Users\\TOYOTA\\eclipse_wokspace\\Joemarie\\img\\user-question.png");
		Image image = icon.getImage();
		Image resizedImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		icon = new ImageIcon(resizedImage);

		lblNewLabel_4 = new JLabel(icon);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(83, 434, 58, 62);
		contentPane.add(lblNewLabel_4);
		
		ImageIcon icon1 = new ImageIcon("C:\\Users\\TOYOTA\\eclipse_wokspace\\Joemarie\\img\\ic_svcc_logo.png");
		Image image1 = icon1.getImage();
		Image resizedImage1 = image1.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		icon1 = new ImageIcon(resizedImage1);
		
		lblNewLabel_4 = new JLabel(icon1);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(583, 10, 80, 79);
		contentPane.add(lblNewLabel_4);
		
		ImageIcon icon2 = new ImageIcon("C:\\Users\\TOYOTA\\eclipse_wokspace\\Joemarie\\img\\ic_bsit_logo.png");
		Image image2 = icon2.getImage();
		Image resizedImage2 = image2.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		icon2 = new ImageIcon(resizedImage2);
		
		lblNewLabel_6 = new JLabel(icon2);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(3, 10, 80, 79);
		contentPane.add(lblNewLabel_6);
	
	// Adding CHECKBOX 
	
			cb_terms = new Checkbox("I Agree to the Terms & Privacy Policy");
			cb_terms.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
			cb_terms.setBounds(333, 450, 250, 30);
			contentPane.add(cb_terms);
		
	// Adding BUTTONS
		
		Button btn_submit = new Button("Submit");
		
		btn_submit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String contactNumber = txt_user_contactNum.getText();
		        String firstName = txt_user_Fname.getText();
		        String middleName = txt_user_Mname.getText();
		        String lastName = txt_user_Lname.getText();
		        String fullName = firstName + middleName + lastName;

		        if (firstName.isEmpty() || middleName.isEmpty() || lastName.isEmpty()) {
		            JOptionPane.showMessageDialog(contentPane, "Please provide your full name!");
		            return;
		        } else if (containsNumbersOrSpecialCharacters(fullName)) {
		            JOptionPane.showMessageDialog(contentPane, "Please enter a valid name (characters only)!");
		            return;
		        } else if (!checkContactNumber(contactNumber)) {
		            JOptionPane.showMessageDialog(contentPane, "Please enter a valid contact number (digits only)!");
		            return;
		        } else if (contactNumber.length() < 11 || contactNumber.length() >= 12) {
		            JOptionPane.showMessageDialog(contentPane, "Please enter a contact number with at least 11 digits!");
		            return;
		        } else if (!cb_terms.getState()) {
		            JOptionPane.showMessageDialog(contentPane, "Please Agree to terms and privacy policy!");
		            return;
		        } else if (contactNumber.isEmpty()) {
		            JOptionPane.showMessageDialog(contentPane, "Please provide your contact number!");
		            return;
		        } else if (!radBtn_male.getState() && !radBtn_female.getState()) {
		            JOptionPane.showMessageDialog(contentPane, "Please select your gender!");
		            return;
		        } else {
		            JOptionPane.showMessageDialog(contentPane, "Registration Successful!");

		            showContents();

		            clearContents();
		        }
		    }
		});
        
		btn_submit.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		btn_submit.setBounds(333, 504, 250, 30);
		contentPane.add(btn_submit);
	}
	
	public static void clearContents() {

	    // Clear text fields
	    txt_user_Fname.setText("");
	    txt_user_Mname.setText("");
	    txt_user_Lname.setText("");
	    txt_user_contactNum.setText("");

	    // Set the index of the choice to index 0
	    choice_course.select(0);

	    // Uncheck the checkbox
	    cb_terms.setState(false);
	}
	
	public static void showContents() {

		String gender = radBtn_male.getState() ? "Male" : "Female";
		
		JOptionPane.showMessageDialog(contentPane,
				"First name     : " + txt_user_Fname.getText() +
				"\nMidlle name  : " + txt_user_Mname.getText() +
				"\nLast name     : " + txt_user_Lname.getText() +
				"\nContact         : " + txt_user_contactNum.getText() +
				"\nCourse          : " + choice_course.getSelectedItem() + 
				"\nGender         : " + gender
		);
	}
	
	public static boolean containsNumbersOrSpecialCharacters(String input) {
		
        // Use a regular expression to check if the input contains numbers or special characters
        String regex = ".*[0-9!@#$%^&*()_+{}|<>?~].*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
	
	public static boolean checkContactNumber(String contactNumber) {
		
        // Use a regular expression to check if the contact number contains only digits
        String regex = "^[0-9]+$";
        Pattern digitPattern = Pattern.compile(regex);
        Matcher digitMatcher = digitPattern.matcher(contactNumber);

        // Check if there are any special characters in the contact number
        String specialCharRegex = "[^a-zA-Z0-9]";
        Pattern specialCharPattern = Pattern.compile(specialCharRegex);
        Matcher specialCharMatcher = specialCharPattern.matcher(contactNumber);

        return digitMatcher.matches() && !specialCharMatcher.find();
    }
}
