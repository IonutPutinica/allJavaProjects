package view;

import javax.swing.*;
import java.awt.*;

public class GUI_Student_Main extends JFrame
{

   private JLabel nameTag;
   private JLabel classTag;
   private JList subjectList;

   public GUI_Student_Main()
   {
      super("Student access");
      createComponents();
      initializeComponents();
      addComponentsToFrame();
   }

   private void createComponents()
   {

      nameTag = new JLabel("Name: ");
      classTag = new JLabel("Class: ");
      subjectList = new JList();
   }

   private void initializeComponents()
   {
      setSize(300, 150);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

   }

   private void addComponentsToFrame()
   {

      JPanel mainPanel = new JPanel(new GridLayout(3, 1));

      mainPanel.add(nameTag);
      mainPanel.add(classTag);
      mainPanel.add(subjectList);

      setContentPane(mainPanel);

   }

}