import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CreateEventTypeGUI extends JFrame
{
   private JButton createWorkshop;
   private JButton createSeminar;
   private JButton createJourney;
   private JButton createLecture;
   
   public CreateEventTypeGUI() {
      createComponents();
      initializeComponents();
      registerEventHandlers();
      addComponentsToFrame();
   }
   
   private void createComponents() {
      createWorkshop = new JButton("Workshop");
      createSeminar = new JButton("Seminar");
      createJourney = new JButton("Journey");
      createLecture = new JButton("Lecture");
   }
   
   private void initializeComponents() {
      setSize(600,200);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
   
   private void registerEventHandlers(){
      ButtonHandler handler = new ButtonHandler();
      createLecture.addActionListener(handler);
      createWorkshop.addActionListener(handler);
      createSeminar.addActionListener(handler);
      createJourney.addActionListener(handler);
   }
   private void  addComponentsToFrame() {
      JPanel main = new JPanel(new GridLayout(1,4));
      main.add(createLecture);
      main.add(createSeminar);
      main.add(createWorkshop);
      main.add(createJourney);
      
      setContentPane(main);
   }
   
   private class ButtonHandler implements ActionListener{
      public void actionPerformed(ActionEvent event) {
         if(event.getSource() == createLecture) {
            CreateLectureGUI cl = new CreateLectureGUI();
         }
         if(event.getSource() == createSeminar) {
            CreateSeminarGUI cs = new CreateSeminarGUI();
         }
         if(event.getSource() == createWorkshop) {
            CreateWorkshopGUI cw = new CreateWorkshopGUI();
         }
         if(event.getSource() == createJourney) {
            CreateJourneyGUI cj = new CreateJourneyGUI();
         }
      }
   }
}
