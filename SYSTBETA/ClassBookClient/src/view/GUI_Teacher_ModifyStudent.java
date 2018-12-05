package view;

import javax.swing.*;
import java.awt.*;

public class GUI_Teacher_ModifyStudent extends JFrame
{
   private JLabel nameTagStudent;
   private JLabel cprTagStudent;
   private JLabel nameTagParent;
   private JLabel cprTagParent;
   private JLabel mathGrades;
   private JLabel literatureGrades;
   private JLabel mathAttendence;
   private JLabel literatureAttendence;
   private JTextField nameStudent;
   private JTextField cprStudent;
   private JTextField nameParent;
   private JTextField cprParent;
   private JTextField mathG;
   private JTextField literatureG;
   private JTextField mathA;
   private JTextField literatureA;
   private JButton create;
   private JButton cancel;

   public GUI_Teacher_ModifyStudent()
   {
      super("Modify Student");
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
      mathGrades = new JLabel("Math grades: ");
      literatureGrades = new JLabel("Literature grades: ");
      mathAttendence = new JLabel("Math attendence: ");
      literatureAttendence = new JLabel("Literature attendence: ");
      nameStudent = new JTextField(20);
      cprStudent = new JTextField(10);
      nameParent = new JTextField(20);
      cprParent = new JTextField(10);
      mathG = new JTextField(10);
      literatureG = new JTextField(10);
      mathA = new JTextField(10);
      literatureA = new JTextField(10);
      create = new JButton("Create");
      cancel = new JButton("Cancel");

   }

   private void initializeComponents()
   {
      setSize(500, 350);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

   }

   private void addComponentsToFrame()
   {
      JPanel mainPanel = new JPanel(new GridLayout(9, 2));

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
      mainPanel.add(mathGrades);
      mainPanel.add(mathG);
      mainPanel.add(mathAttendence);
      mainPanel.add(mathA);
      mainPanel.add(literatureGrades);
      mainPanel.add(literatureG);
      mainPanel.add(literatureAttendence);
      mainPanel.add(literatureA);
      mainPanel.add(create);
      mainPanel.add(cancel);

      setContentPane(mainPanel);

   }
}
