import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CompanyGUI extends JFrame
{
   private JButton createEvent;
   private JButton createMember;
   private JButton createLecturer;
   private JButton createSponsor;
   private JButton searchEvent;
   private JButton searchMember;
   private JButton searchLecturer;
   private JButton searchSponsor;
   
   public CompanyGUI() {
      super("Vipasanna");
      createComponents();
      initializeComponents();
      registerEventHandlers();
      addComponentsToFrame();
   }
   private void createComponents() {
      createEvent = new JButton("Create Event");
      createMember = new JButton("Create Member");
      createLecturer = new JButton("Create Lecturer");
      createSponsor = new JButton("Create Sponsor");
      searchEvent = new JButton("Search Event");
      searchMember = new JButton("Search Member");
      searchLecturer = new JButton("Search Lecturer");
      searchSponsor = new JButton("Search Sponsor");
   }
   private void initializeComponents() {
      setSize(800,400);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   private void registerEventHandlers() {
      ButtonHandler handler = new ButtonHandler();
      createEvent.addActionListener(handler);
      createMember.addActionListener(handler);
      createLecturer.addActionListener(handler);
      createSponsor.addActionListener(handler);
      searchEvent.addActionListener(handler);
      searchMember.addActionListener(handler);
      searchLecturer.addActionListener(handler);
      searchSponsor.addActionListener(handler);
   }
   private void addComponentsToFrame() {
      JPanel panelButtons = new JPanel(new GridLayout(2,4));
      panelButtons.add(createEvent);
      panelButtons.add(createMember);
      panelButtons.add(createLecturer);
      panelButtons.add(createSponsor);
      panelButtons.add(searchEvent);
      panelButtons.add(searchMember);
      panelButtons.add(searchLecturer);
      panelButtons.add(searchSponsor);
      
      JPanel contentPane = new JPanel(new GridLayout(1,1));
      contentPane.add(panelButtons);
      
      setContentPane(contentPane);
      
   }
   
   private class ButtonHandler implements ActionListener{
      public void actionPerformed(ActionEvent event) {
         if(event.getSource() == createEvent) {
            CreateEventTypeGUI ce = new CreateEventTypeGUI();
         }
         if(event.getSource() == createMember) {
            CreateMemberGUI cm = new CreateMemberGUI();
         }
         if(event.getSource() == createLecturer) {
            CreateLecturerGUI cl = new CreateLecturerGUI();
         }
         if(event.getSource() == createSponsor) {
            CreateSponsorGUI cs = new CreateSponsorGUI();
         }
      }
   }
}