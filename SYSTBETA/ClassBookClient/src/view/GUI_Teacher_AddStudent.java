package view;

import javax.swing.*;
import java.awt.*;

public class GUI_Teacher_AddStudent extends JFrame
{
   private JLabel nameTagStudent;
   private JLabel cprTagStudent;
   private JLabel nameTagParent;
   private JLabel cprTagParent;
   private JTextField nameStudent;
   private JTextField cprStudent;
   private JTextField nameParent;
   private JTextField cprParent;
   private JButton create;
   private JButton cancel;

   public GUI_Teacher_AddStudent()
   {
      super("Add Student");
      createComponents();
      initializeComponents();
      addComponentsToFrame();
   }

   private void createComponents()
   {
      nameTagStudent = new JLabel("Student Name: ");
      cprTagStudent = new JLabel("Student CPR: ");
      nameTagParent = new JLabel("Parent Name: ");
      cprTagParent = new JLabel("Parent CPR: ");
      nameStudent = new JTextField(20);
      cprStudent = new JTextField(10);
      nameParent = new JTextField(20);
      cprParent = new JTextField(10);
      create = new JButton("Create");
      cancel = new JButton("Cancel");

   }

   private void initializeComponents()
   {
      setSize(450, 175);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

   }

   private void addComponentsToFrame()
   {
      JPanel mainPanel = new JPanel(new GridLayout(5, 2));

      mainPanel.add(nameTagStudent);
      mainPanel.add(nameStudent);
      mainPanel.add(nameTagParent);
      mainPanel.add(nameParent);
      mainPanel.add(cprTagStudent);
      mainPanel.add(cprStudent);
      mainPanel.add(cprTagStudent);
      mainPanel.add(cprStudent);
      mainPanel.add(cprTagParent);
      mainPanel.add(cprParent);
      mainPanel.add(create);
      mainPanel.add(cancel);

      setContentPane(mainPanel);

   }
}
