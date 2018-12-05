package view;

import javax.swing.*;
import java.awt.*;

public class GUI_Teacher_InitialMain extends JFrame
{

   private JButton createClass;

   public GUI_Teacher_InitialMain()
   {
      super("Teacher");
      createComponents();
      initializeComponents();
      addComponentsToFrame();
   }

   private void createComponents()
   {
      createClass = new JButton("Create Class");

   }

   private void initializeComponents()
   {
      setSize(250, 150);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }

   private void addComponentsToFrame()
   {
      JPanel buttons = new JPanel(new GridLayout(1, 1));

      buttons.add(createClass);
      setContentPane(buttons);
   }
}
