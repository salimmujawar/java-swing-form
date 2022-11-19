import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;


public class MyWindow extends JFrame {
    private JLabel heading;
    private Font font= new Font("", Font.BOLD, 30);

    private JPanel mainPanel;
    private JLabel nameLabel, passwordLabel;
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JButton btn1, btn2;

    //Constructor
    public MyWindow() {
        super.setTitle("My First Form!!!");
        super.setSize(500, 500);
        super.setLocation(100,100);
        //Used default close option, to close the app
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();
        super.setVisible(true);
    }

    //Create GUI
    public void createGUI() {
        this.setLayout(new BorderLayout());
        heading = new JLabel("My First Form");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);
        this.add(heading, BorderLayout.NORTH);
        this.createForm();
    }

    //Create the form
    public void createForm() {
        mainPanel = new JPanel();
        //setting layout of main panel, 3 rows and 2 cols
        mainPanel.setLayout(new GridLayout(3, 2));

        nameLabel = new JLabel("Enter Name :");
        nameLabel.setFont(font);
        nameTextField = new JTextField();
        nameTextField.setFont(font);

        passwordLabel = new JLabel("Enter Name :");
        passwordLabel.setFont(font);
        passwordField = new JPasswordField();
        passwordField.setFont(font);

        btn1 = new JButton("Submit");
        btn1.setFont(font);

        btn2 = new JButton("Reset");
        btn2.setFont(font);

        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);
        mainPanel.add(btn1);
        mainPanel.add(btn2);

        this.add(mainPanel, BorderLayout.CENTER);

    }

}
