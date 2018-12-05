package view;
import javax.swing.*;
import java.awt.*;

public class GUI_Login extends JFrame
{
   
   private JButton login;
   private JTextField entry;
   private JLabel heading;
   
   public GUI_Login() {
      super("Class Book");
      createComponents();
      initializeComponents();
      addComponentsToFrame();
   }
   
   private void createComponents() {
      login = new JButton("Log in");
      entry = new JTextField(10);
      heading = new JLabel("Enter CPR", JLabel.CENTER);
   }
   
   private void initializeComponents() {
      setSize(300,150);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
   
   private void addComponentsToFrame() {
      JPanel contentPane = new JPanel(new GridLayout(3,1));
      
      contentPane.add(heading);
      contentPane.add(entry);
      contentPane.add(login);
      
      setContentPane(contentPane);
      
   }
}
