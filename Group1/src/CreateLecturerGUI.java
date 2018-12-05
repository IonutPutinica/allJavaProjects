import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CreateLecturerGUI extends JFrame
{
   private JTextField lecturerName;
   private JLabel lecturerNameLabel;
   private JTextField lecturerPhone;
   private JLabel lecturerPhoneLabel;
   private JTextField lecturerEmail;
   private JLabel lecturerEmailLabel;
   private JTextField lecturerSpec;
   private JLabel lecturerSpecLabel;
   private JTextField lecturerSalary;
   private JLabel lecturerSalaryLabel;
   private JButton save;
   private JButton close;
   private JButton clear;
   
   public CreateLecturerGUI() {
      super("Create Lecturer");
      createComponents();
      initializeComponents();
      registerEventHandlers();
      addComponentsToFrame();
      
   }
   
   private void createComponents() {
      lecturerName = new JTextField(30);
      lecturerNameLabel = new JLabel("Lecturer name:");
      lecturerPhone = new JTextField(15);
      lecturerPhoneLabel = new JLabel("Lecturer phone number:");
      lecturerEmail = new JTextField(30);
      lecturerEmailLabel = new JLabel("Lecturer email adress:");
      lecturerSpec = new JTextField(30);
      lecturerSpecLabel = new JLabel("Lecturer specialization:");
      lecturerSalary = new JTextField(10);
      lecturerSalaryLabel = new JLabel("Lecturer salary:");
      save = new JButton("Save");
      close = new JButton("Close");
      clear = new JButton("Clear all");
   }
   
   private void initializeComponents() {
      setSize(550,400);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
   private void registerEventHandlers() {
      ButtonHandler handler = new ButtonHandler();
      close.addActionListener(handler);
      save.addActionListener(handler);
      clear.addActionListener(handler);
   }
   private void addComponentsToFrame() {
      JPanel name = new JPanel(new FlowLayout());
      JPanel nameBox = new JPanel(new BorderLayout());
      JPanel phone = new JPanel(new FlowLayout());
      JPanel phoneBox = new JPanel(new BorderLayout());
      JPanel email = new JPanel(new FlowLayout());
      JPanel emailBox = new JPanel(new BorderLayout());
      JPanel spec = new JPanel(new FlowLayout());
      JPanel specBox = new JPanel(new BorderLayout());
      JPanel sal = new JPanel(new FlowLayout());
      JPanel salBox = new JPanel(new BorderLayout());
      JPanel middle = new JPanel(new GridLayout(5,1));
      JPanel main = new JPanel(new BorderLayout());
      JPanel buttons = new JPanel(new FlowLayout());
      //name
      name.add(lecturerNameLabel);
      name.add(lecturerName);
      //nameBox
      nameBox.add(name, BorderLayout.CENTER);
      //phone
      phone.add(lecturerPhoneLabel);
      phone.add(lecturerPhone);
      //phoneBox
      phoneBox.add(phone, BorderLayout.CENTER);
      //email
      email.add(lecturerEmailLabel);
      email.add(lecturerEmail);
      //emailBox
      emailBox.add(email, BorderLayout.CENTER);
      //spec
      spec.add(lecturerSpecLabel);
      spec.add(lecturerSpec);
      //specBox
      specBox.add(spec, BorderLayout.CENTER);
      //sal
      sal.add(lecturerSalaryLabel);
      sal.add(lecturerSalary);
      //salBox
      salBox.add(sal, BorderLayout.CENTER);
      //buttons
      buttons.add(save);
      buttons.add(close);
      buttons.add(clear);
      //middle
      middle.add(nameBox);
      middle.add(phoneBox);
      middle.add(emailBox);
      middle.add(specBox);
      middle.add(salBox);
      //main
      main.add(middle, BorderLayout.CENTER);
      main.add(buttons, BorderLayout.SOUTH);
      
      setContentPane(main);
   }
   private class ButtonHandler implements ActionListener{
      public void actionPerformed(ActionEvent event) {
         if(event.getSource() == close) {
            dispose();
         }
         if(event.getSource() == clear) {
            lecturerName.setText("");
            lecturerPhone.setText("");
            lecturerEmail.setText("");
            lecturerSpec.setText("");
            lecturerSalary.setText("");
            
         }
      }
   }
}