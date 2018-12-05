package view;

import javax.swing.*;
import java.awt.*;

public class GUI_Admin_TeacherPanel extends JFrame
{
   private JLabel nameTag;
   private JLabel cprTag;
   private JTextField name;
   private JTextField cpr;
   
   public GUI_Admin_TeacherPanel() {
      super("Teacher");
      createComponents();
      initializeComponents();
      addComponentsToFrame();
   }

   private void createComponents()
   {
      nameTag = new JLabel("Name: ");
      cprTag = new JLabel("CPR: ");
      name = new JTextField(20);
      cpr = new JTextField(10);
      
   }
   

   private void initializeComponents()
   {
      setSize(300,200);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
   }

   private void addComponentsToFrame()
   {
      JPanel mainPanel = new JPanel(new GridLayout(2,2));
      
      mainPanel.add(nameTag);
      mainPanel.add(name);
      mainPanel.add(cprTag);
      mainPanel.add(cpr);
      
      setContentPane(mainPanel);
      
   }
}
