package view;

import javax.swing.*;
import java.awt.*;

public class GUI_Parent_Main extends JFrame
{
   private JButton viewContact;
   private JLabel heading;
   private JList subjectList;

   public GUI_Parent_Main()
   {
      super("Parent access");
      createComponents();
      initializeComponents();
      addComponentsToFrame();
   }

   private void createComponents()
   {
      viewContact = new JButton("View messages/Contact teacher");
      heading = new JLabel("Name: ");
      subjectList = new JList();
   }

   private void initializeComponents()
   {
      setSize(350, 450);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

   }

   private void addComponentsToFrame()
   {
      JPanel mainFrame = new JPanel(new BorderLayout());
      JPanel buttons = new JPanel(new GridLayout(1, 1));

      buttons.add(viewContact);

      mainFrame.add(heading, BorderLayout.NORTH);
      mainFrame.add(subjectList, BorderLayout.CENTER);
      mainFrame.add(buttons, BorderLayout.SOUTH);

      setContentPane(mainFrame);

   }

}
