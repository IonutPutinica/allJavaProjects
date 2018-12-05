import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CreateJourneyGUI extends JFrame
{
   private JTextField eventName;
   private JLabel eventNameLabel;
   private JTextField eventDateDay;
   private JLabel eventDateDayLabel;
   private JTextField eventDateMonth;
   private JLabel eventDateMonthLabel;
   private JTextField eventDateYear;
   private JLabel eventDateYearLabel;
   private JTextField eventEndDateDay;
   private JLabel eventEndDateDayLabel;
   private JTextField eventEndDateMonth;
   private JLabel eventEndDateMonthLabel;
   private JTextField eventEndDateYear;
   private JLabel eventEndDateYearLabel;
   private JTextField eventDestination;
   private JLabel eventDestinationLabel;
   private JTextField eventDurationHour;
   private JLabel eventDurationHourLabel;
   private JTextField eventDurationMinute;
   private JLabel eventDurationMinuteLabel;
   private JTextField memberLimit;
   private JLabel memberLimitLabel;
   private JTextField eventPrice;
   private JLabel eventPriceLabel;
   private JLabel eventDateLabel;
   private JLabel eventEndDateLabel;
   private JLabel eventDurationLabel;
   private JButton save;
   private JButton close;
   private JButton finalize;
   private JButton clear;
   
   public CreateJourneyGUI() {
      super("Create Journey");
      createComponents();
      initializeComponents();
      registerEventHandlers();
      addComponentsToFrame();
   }
   
   private void createComponents() {
      eventName = new JTextField(30);
      eventNameLabel = new JLabel("Event name:");
      eventDateLabel = new JLabel("Date of event:", JLabel.CENTER);
      eventDateDay = new JTextField(2);
      eventDateDayLabel = new JLabel("Day:");
      eventDateMonth = new JTextField(2);
      eventDateMonthLabel = new JLabel("Month:");
      eventDateYear = new JTextField(4);
      eventDateYearLabel = new JLabel("Year:");
      eventEndDateLabel = new JLabel("End date of event:",JLabel.CENTER);
      eventEndDateDay = new JTextField(2);
      eventEndDateDayLabel = new JLabel("Day:");
      eventEndDateMonth = new JTextField(2);
      eventEndDateMonthLabel = new JLabel("Month:");
      eventEndDateYear = new JTextField(4);
      eventEndDateYearLabel = new JLabel("Year:");
      eventDestination = new JTextField(30);
      eventDestinationLabel = new JLabel("Destination:");
      eventDurationLabel = new JLabel("Event duration:", JLabel.CENTER);
      eventDurationHour = new JTextField(2);
      eventDurationHourLabel = new JLabel("Hour: ");
      eventDurationMinute = new JTextField(2);
      eventDurationMinuteLabel = new JLabel("Minute:");
      memberLimit = new JTextField(3);
      memberLimitLabel = new JLabel("Member limit:");
      eventPrice = new JTextField(8);
      eventPriceLabel = new JLabel("Price:");
      save = new JButton("Save");
      close = new JButton("Close");
      finalize = new JButton("Finalize event");
      clear = new JButton("Clear all");
   }
   private void initializeComponents() {
      setSize(550,600);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
   private void registerEventHandlers() {
      ButtonHandler handler = new ButtonHandler();
      close.addActionListener(handler);
      save.addActionListener(handler);
      finalize.addActionListener(handler);
      clear.addActionListener(handler);
   }
   private void addComponentsToFrame() {
      JPanel main = new JPanel(new BorderLayout());
      JPanel name = new JPanel(new FlowLayout());
      JPanel nameBox = new JPanel(new BorderLayout());
      JPanel nameBoxContainer = new JPanel(new BorderLayout());
      JPanel dateValues = new JPanel(new FlowLayout());
      JPanel dateBox = new JPanel(new BorderLayout());
      JPanel endDateValues = new JPanel(new FlowLayout());
      JPanel endDateBox = new JPanel(new BorderLayout());
      JPanel destination = new JPanel(new FlowLayout());
      JPanel destinationBox = new JPanel(new BorderLayout());
      JPanel destinationBoxContainer = new JPanel(new BorderLayout());
      JPanel durationValues = new JPanel(new FlowLayout());
      JPanel durationBox = new JPanel(new BorderLayout());
      JPanel mLimit = new JPanel(new FlowLayout());
      JPanel mLimitBox = new JPanel(new BorderLayout());
      JPanel mLimitBoxContainer = new JPanel(new BorderLayout());
      JPanel price = new JPanel(new FlowLayout());
      JPanel priceBox = new JPanel(new BorderLayout());
      JPanel middle = new JPanel(new GridLayout(7,1));
      JPanel middleBox = new JPanel(new FlowLayout());
      JPanel buttons = new JPanel(new FlowLayout());
      
      //name
      name.add(eventNameLabel);
      name.add(eventName);
      //nameBox
      nameBox.add(name, BorderLayout.NORTH);
      //nameBoxContainer
      nameBoxContainer.add(nameBox, BorderLayout.CENTER);
      nameBoxContainer.add(new JSeparator(), BorderLayout.SOUTH);
      //dateValues
      dateValues.add(eventDateDayLabel);
      dateValues.add(eventDateDay);
      dateValues.add(eventDateMonthLabel);
      dateValues.add(eventDateMonth);
      dateValues.add(eventDateYearLabel);
      dateValues.add(eventDateYear);
      //dateBox
      dateBox.add(eventDateLabel, BorderLayout.NORTH);
      dateBox.add(dateValues, BorderLayout.CENTER);
      //endDateValues
      endDateValues.add(eventEndDateDayLabel);
      endDateValues.add(eventEndDateDay);
      endDateValues.add(eventEndDateMonthLabel);
      endDateValues.add(eventEndDateMonth);
      endDateValues.add(eventEndDateYearLabel);
      endDateValues.add(eventEndDateYear);
      //endDateBox
      endDateBox.add(new JSeparator(), BorderLayout.NORTH);
      endDateBox.add(eventEndDateLabel, BorderLayout.CENTER);
      endDateBox.add(endDateValues, BorderLayout.SOUTH);
      //destination
      destination.add(eventDestinationLabel);
      destination.add(eventDestination);
      //destinationBox
      destinationBox.add(destination, BorderLayout.CENTER);
      //destinationBoxContainer
      destinationBoxContainer.add(new JSeparator(), BorderLayout.NORTH);
      destinationBoxContainer.add(destinationBox, BorderLayout.CENTER);
      destinationBoxContainer.add(new JSeparator(), BorderLayout.SOUTH);
      //durationValues
      durationValues.add(eventDurationHourLabel);
      durationValues.add(eventDurationHour);
      durationValues.add(eventDurationMinuteLabel);
      durationValues.add(eventDurationMinute);
      //durationBox
      durationBox.add(eventDurationLabel, BorderLayout.NORTH);
      durationBox.add(durationValues, BorderLayout.CENTER);
      //mLimit
      mLimit.add(memberLimitLabel);
      mLimit.add(memberLimit);
      //mLimitBox
      mLimitBox.add(mLimit, BorderLayout.CENTER);
      //mLimitBoxContainer
      mLimitBoxContainer.add(new JSeparator(), BorderLayout.NORTH);
      mLimitBoxContainer.add(mLimitBox, BorderLayout.CENTER);
      mLimitBoxContainer.add(new JSeparator(), BorderLayout.SOUTH);
      //price
      price.add(eventPriceLabel);
      price.add(eventPrice);
      //priceBox
      priceBox.add(price, BorderLayout.CENTER);
      //middle
      middle.add(nameBoxContainer);
      middle.add(dateBox);
      middle.add(endDateBox);
      middle.add(destinationBoxContainer);
      middle.add(durationBox);
      middle.add(mLimitBoxContainer);
      middle.add(priceBox);
      //buttons
      buttons.add(save);
      buttons.add(close);
      buttons.add(clear);
      buttons.add(finalize);
      //middleBox
      middleBox.add(middle);
      //main
      main.add(middleBox, BorderLayout.CENTER);
      main.add(buttons, BorderLayout.SOUTH);
      
      setContentPane(main);
   }
   private class ButtonHandler implements ActionListener{
      public void actionPerformed(ActionEvent event) {
         if(event.getSource() == close) {
            dispose();
         }
         if(event.getSource() == clear) {
            eventName.setText("");
            eventDateDay.setText("");
            eventDateMonth.setText("");
            eventDateYear.setText("");
            eventEndDateDay.setText("");
            eventEndDateMonth.setText("");
            eventEndDateYear.setText("");
            eventDestination.setText("");
            eventDurationHour.setText("");
            eventDurationMinute.setText("");
            memberLimit.setText("");
            eventPrice.setText("");
            
         }
      }
   }
}
