package chat.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chat.controller.ChatController;
import chat.domain.model.ChatMessage;

public class ChatGui extends JFrame implements ChatView, ActionListener
{
   private JTextField textFieldInput;
   private JTextArea textAreaOutput;
   private JButton buttonSend;
   private JButton buttonQuit;
   private ChatController controller;

   public ChatGui()
   {
      super("View");

      initialize();
      addComponentsToFrame();
   }

   @Override
   public void start(ChatController controller)
   {
      this.controller = controller;
      buttonSend.addActionListener(this);
      buttonQuit.addActionListener(this);
      textFieldInput.addActionListener(this);
      setVisible(true);
   }

   @Override
   public String getInput()
   {
      String txt = textFieldInput.getText().trim();
      textFieldInput.setText("");
      return txt;
   }

   @Override
   public void showOutput(String text)
   {
      if (text == null || text.length() < 1)
      {
         return;
      }
      String old = textAreaOutput.getText();
      if (old.length() > 1)
         old = "\n" + old;
      textAreaOutput.setText(text + old);
   }

   private void initialize()
   {
      textFieldInput = new JTextField();
      textAreaOutput = new JTextArea();
      textAreaOutput.setEditable(false);
      Font font = textAreaOutput.getFont();
      font = new Font(font.getName(), font.getStyle(), 16);
      textAreaOutput.setFont(font);
      textFieldInput.setFont(font);
      textAreaOutput.setBackground(Color.LIGHT_GRAY);
      buttonSend = new JButton("Send");
      buttonQuit = new JButton("Quit");
      setSize(600, 500); // set frame size
      setLocationRelativeTo(null); // center of the screen
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   private void addComponentsToFrame()
   {
      JPanel panelButtons = new JPanel();
      panelButtons.add(buttonSend);
      panelButtons.add(buttonQuit);

      JPanel panel1 = new JPanel(new BorderLayout());
      panel1.add(textFieldInput, BorderLayout.CENTER);
      panel1.add(panelButtons, BorderLayout.EAST);

      JScrollPane scrollPane = new JScrollPane(textAreaOutput);

      JPanel contentPane = new JPanel(new BorderLayout());
      contentPane.add(panel1, BorderLayout.NORTH);
      contentPane.add(scrollPane, BorderLayout.CENTER);

      setContentPane(contentPane);
   }

   @Override
   // ActionListener
   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() instanceof JTextField)
      {
         controller.execute("Send");
      }
      else
      {
         controller.execute(e.getActionCommand());
      }
   }

   @Override
   public void update(Observable o, Object arg)
   {
     showOutput(arg.toString());
      
   }
}
