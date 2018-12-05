import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CreateSponsorGUI extends JFrame
{
   private JTextField sponsorName;
   private JLabel sponsorNameLabel;
   private JTextField sponsorPhone;
   private JLabel sponsorPhoneLabel;
   private JTextField sponsorEmail;
   private JLabel sponsorEmailLabel;
   private JTextField moneyContributed;
   private JLabel moneyContributedLabel;
   private JButton save;
   private JButton close;
   private JButton clear;
   
   public CreateSponsorGUI() {
      super("Create Sponsor");
      createComponents();
      initializeComponents();
      registerEventHandlers();
      addComponentsToFrame();
      
   }
   
   private void createComponents() {
      sponsorName = new JTextField(30);
      sponsorNameLabel = new JLabel("Sponsor name:");
      sponsorPhone = new JTextField(15);
      sponsorPhoneLabel = new JLabel("Sponsor phone number:");
      sponsorEmail = new JTextField(30);
      sponsorEmailLabel = new JLabel("Sponsor email adress:");
      moneyContributed = new JTextField(8);
      moneyContributedLabel = new JLabel("Money contributed:");
      save = new JButton("Save");
      close = new JButton("Close");
      clear = new JButton("Clear all");
   }
   
   private void initializeComponents() {
      setSize(550,350);
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
      JPanel contribution = new JPanel(new FlowLayout());
      JPanel contributionBox = new JPanel(new BorderLayout());
      JPanel middle = new JPanel(new GridLayout(4,1));
      JPanel main = new JPanel(new BorderLayout());
      JPanel buttons = new JPanel(new FlowLayout());
      //name
      name.add(sponsorNameLabel);
      name.add(sponsorName);
      //nameBox
      nameBox.add(name, BorderLayout.CENTER);
      //phone
      phone.add(sponsorPhoneLabel);
      phone.add(sponsorPhone);
      //phoneBox
      phoneBox.add(phone, BorderLayout.CENTER);
      //email
      email.add(sponsorEmailLabel);
      email.add(sponsorEmail);
      //emailBox
      emailBox.add(email, BorderLayout.CENTER);
      //contribution
      contribution.add(moneyContributedLabel);
      contribution.add(moneyContributed);
      //contributionBox
      contributionBox.add(contribution, BorderLayout.CENTER);
      //buttons
      buttons.add(save);
      buttons.add(close);
      buttons.add(clear);
      //middle
      middle.add(nameBox);
      middle.add(phoneBox);
      middle.add(emailBox);
      middle.add(contributionBox);
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
            sponsorName.setText("");
            sponsorPhone.setText("");
            sponsorEmail.setText("");
            moneyContributed.setText("");
            
         }
      }
   }
}