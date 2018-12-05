import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CreateMemberGUI extends JFrame
{
   private JTextField memberName;
   private JLabel memberNameLabel;
   private JTextField memberPhone;
   private JLabel memberPhoneLabel;
   private JTextField memberEmail;
   private JLabel memberEmailLabel;
   private JLabel dateMembershipLabel;
   private JTextField dateMembershipDay;
   private JLabel dateMembershipDayLabel;
   private JTextField dateMembershipMonth;
   private JLabel dateMembershipMonthLabel;
   private JTextField dateMembershipYear;
   private JLabel dateMembershipYearLabel;
   private JTextField paymentYear;
   private JLabel paymentYearLabel;
   private JButton save;
   private JButton close;
   private JButton clear;
   
   public CreateMemberGUI() {
      super("Create Member");
      createComponents();
      initializeComponents();
      registerEventHandlers();
      addComponentsToFrame();
      
   }
   
   private void createComponents() {
      memberName = new JTextField(30);
      memberNameLabel = new JLabel("Member name:");
      memberPhone = new JTextField(15);
      memberPhoneLabel = new JLabel("Member phone number:");
      memberEmail = new JTextField(30);
      memberEmailLabel = new JLabel("Member email adress:");
      dateMembershipLabel = new JLabel("Date of becoming a member:",JLabel.CENTER);
      dateMembershipDay = new JTextField(2);
      dateMembershipDayLabel = new JLabel("Day:");
      dateMembershipMonth = new JTextField(2);
      dateMembershipMonthLabel = new JLabel("Month:");
      dateMembershipYear = new JTextField(4);
      dateMembershipYearLabel = new JLabel("Year:");
      paymentYear = new JTextField(4);
      paymentYearLabel = new JLabel("Payment year:");
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
      JPanel dateMembership = new JPanel(new FlowLayout());
      JPanel dateMembershipBox = new JPanel(new BorderLayout());
      JPanel paymentYearBox = new JPanel(new FlowLayout());
      JPanel middle = new JPanel(new GridLayout(5,1));
      JPanel main = new JPanel(new BorderLayout());
      JPanel buttons = new JPanel(new FlowLayout());
      //name
      name.add(memberNameLabel);
      name.add(memberName);
      //nameBox
      nameBox.add(name, BorderLayout.CENTER);
      //phone
      phone.add(memberPhoneLabel);
      phone.add(memberPhone);
      //phoneBox
      phoneBox.add(phone, BorderLayout.CENTER);
      //email
      email.add(memberEmailLabel);
      email.add(memberEmail);
      //emailBox
      emailBox.add(email, BorderLayout.CENTER);
      //dateMembership
      dateMembership.add(dateMembershipDayLabel);
      dateMembership.add(dateMembershipDay);
      dateMembership.add(dateMembershipMonthLabel);
      dateMembership.add(dateMembershipMonth);
      dateMembership.add(dateMembershipYearLabel);
      dateMembership.add(dateMembershipYear);
      //dateMembershipBox
      dateMembershipBox.add(dateMembershipLabel, BorderLayout.NORTH);
      dateMembershipBox.add(dateMembership, BorderLayout.CENTER);
      //paymentYearBox
      paymentYearBox.add(paymentYearLabel);
      paymentYearBox.add(paymentYear);
      //buttons
      buttons.add(save);
      buttons.add(close);
      buttons.add(clear);
      //middle
      middle.add(nameBox);
      middle.add(phoneBox);
      middle.add(emailBox);
      middle.add(dateMembershipBox);
      middle.add(paymentYearBox);
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
            memberName.setText("");
            memberPhone.setText("");
            memberEmail.setText("");
            dateMembershipDay.setText("");
            dateMembershipMonth.setText("");
            dateMembershipYear.setText("");
            paymentYear.setText("");
            
         }
      }
   }
}
