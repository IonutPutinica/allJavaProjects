package view;

import javax.swing.*;
import java.awt.*;

public class GUI_Teacher_CreateClass extends JFrame
{
   private JButton add;
   private JButton modify;
   private JButton delete;
   private JLabel nameTag;
   private JTextField name;
   private JLabel heading;
   private JList studentsList;

   public GUI_Teacher_CreateClass()
   {
      super("Create class");
      createComponents();
      initializeComponents();
      addComponentsToFrame();
   }

   private void createComponents()
   {
      add = new JButton("Add student");
      modify = new JButton("Modify student");
      delete = new JButton("Delete student");
      nameTag = new JLabel("Name: ");
      name = new JTextField(10);
      name.setBounds(40, 40, 40, 40);
      heading = new JLabel("Students List");
      studentsList = new JList();

   }

   private void initializeComponents()
   {
      setSize(400, 250);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

   }

   private void addComponentsToFrame()
   {
      JPanel mainPanel = new JPanel(new GridLayout(2, 2));
      JPanel frame = new JPanel(new GridLayout(2, 1));
      JPanel buttons = new JPanel(new GridLayout(3, 1));

      buttons.add(add);
      buttons.add(modify);
      buttons.add(delete);

      frame.add(heading);
      frame.add(studentsList);

      mainPanel.add(nameTag);
      mainPanel.add(name);
      mainPanel.add(frame);
      mainPanel.add(buttons);

      setContentPane(mainPanel);

   }
}