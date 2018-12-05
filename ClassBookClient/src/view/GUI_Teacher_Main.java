package view;

import javax.swing.*;
import java.awt.*;

public class GUI_Teacher_Main extends JFrame
{
   private JButton viewContact;
   private JButton create;
   private JButton delete;
   private JButton open;
   private JLabel heading;
   private JList studentsList;

   public GUI_Teacher_Main()
   {
      super("Teacher");
      createComponents();
      initializeComponents();
      addComponentsToFrame();
   }

   private void createComponents()
   {
      viewContact = new JButton("View messages/Contact parent");
      create = new JButton("Create student");
      open = new JButton("View Student");
      delete = new JButton("Delete students");
      heading = new JLabel("List of students: ");
      studentsList = new JList();
   }

   private void initializeComponents()
   {
      setSize(500, 650);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

   }

   private void addComponentsToFrame()
   {
      JPanel mainFrame = new JPanel(new BorderLayout());
      JPanel buttons = new JPanel(new GridLayout(4, 1));

      buttons.add(create);
      buttons.add(open);
      buttons.add(delete);
      buttons.add(viewContact);
      mainFrame.add(heading, BorderLayout.NORTH);
      mainFrame.add(studentsList, BorderLayout.CENTER);
      mainFrame.add(buttons, BorderLayout.EAST);

      setContentPane(mainFrame);

   }

}
