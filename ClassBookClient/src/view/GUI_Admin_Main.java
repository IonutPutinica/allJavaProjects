package view;
import javax.swing.*;
import java.awt.*;

public class GUI_Admin_Main extends JFrame
{
   private JButton create;
   private JButton delete;
   private JButton open;
   private JLabel heading;
   private JList teacherList;
   
   
   public GUI_Admin_Main() {
      super("Administrator access");
      createComponents();
      initializeComponents();
      addComponentsToFrame();
   }

   private void createComponents()
   {
      create = new JButton("Create teacher");
      open = new JButton("View teacher");
      delete = new JButton("Delete teacher");
      heading = new JLabel("List of teachers: ");
      teacherList = new JList();
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
      JPanel buttons = new JPanel(new GridLayout(3,1));
      
      buttons.add(create);
      buttons.add(open);
      buttons.add(delete);
      
      mainFrame.add(heading, BorderLayout.NORTH);
      mainFrame.add(teacherList, BorderLayout.CENTER);
      mainFrame.add(buttons, BorderLayout.EAST);
      
      setContentPane(mainFrame);
      
   }


}
