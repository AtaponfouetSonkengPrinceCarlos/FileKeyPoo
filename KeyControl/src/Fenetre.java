import java.awt.event.KeyAdapter;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField ;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import java.text.ParseException;
import java.util.regex.Pattern;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Fenetre extends JFrame {
	private JPanel container = new JPanel();
	private JTextField jtf;
	private JLabel label = new JLabel("Téléphone FR ");
	private JButton b = new JButton ("OK");
	private Pattern regex;
	  public Fenetre(){
		this.regex = Pattern.compile("^237-6[\\d]{2}(-[\\d]{3}){2}$");
	    this.setTitle("KeyControl");
	    this.setSize(300, 150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    jtf = new JTextField();
	    JPanel top = new JPanel();
	    Font police = new Font("Arial", Font.BOLD, 14);
	    jtf.setFont(police);
	    jtf.setPreferredSize(new Dimension(150, 30));
	    jtf.setForeground(Color.BLUE);
	    jtf.addKeyListener(new KeyAdapter(){
	    	public void keyReleased(KeyEvent event) {
	    		if(isNumeric(event.getKeyChar())){}else {
	                  if(event.getKeyChar()=='-'){}else {
	                	  jtf.setText(jtf.getText().replace(String.valueOf(event.getKeyChar()),""));
	                  }
	                  if(event.getKeyCode()==10)
	                  {
	                	  okMessage(true);
	                  }
				  }
	    	}
	    	});
	    b.addActionListener(new BoutonListener());
	    top.add(label);
	    top.add(jtf);
	    top.add(b);
	    this.setContentPane(top);
	    this.setVisible(true);
	  } 
	  class BoutonListener implements ActionListener{
		  public void actionPerformed (ActionEvent e) {
		  okMessage(true);
		  }
		  }
	  class ClavierListener implements KeyListener{
		  public void keyPressed(KeyEvent event) {
		  System.out.println("Code touche pressée : " + event.getKeyCode()+" - caractère touche pressée : " + event.getKeyChar());
		  }
		  public void keyReleased(KeyEvent event) {
			  if(isNumeric(event.getKeyChar())){}else {
                  if(event.getKeyChar()=='-'){}else {
                	  jtf.setText(jtf.getText().replace(String.valueOf(event.getKeyChar()),""));
                  }
                  if(event.getKeyCode()==10)
                  {
                	  okMessage(true);
                  }
			  }
		  }
		  public void keyTyped(KeyEvent event) {
		  System.out.println("Code touche tapée : " + event.getKeyCode() +" - caractère touche tapée : " + event.getKeyChar());
		  }
		  }
	  private void pause(){
		  try {
		  Thread.sleep(1000);
		  } catch (InterruptedException e) {
		  // TODO Auto-generated catch block
		  e.printStackTrace();
		  }
		  }
	  private boolean isNumeric(char carac){
		  try {
		  Integer.parseInt(String.valueOf(carac));
		  } catch (NumberFormatException e) {
		  return false;
		  }
		  return true;
		  }
	  
	  public void okMessage(boolean bool)
	  {

			  if(bool)
			  {
				  System.out.println("Téléphone FR : " +jtf.getText());
				  if(regex.matcher(jtf.getText()).matches()){
				  System.out.println("Numéro de téléphone OK ! !");
				  String str = jtf.getText().replaceAll("\\d", "X");
				  System.out.println("Après remplacement : " + str);
				  }
				  else{
				  System.out.println("Numéro de téléphone PAS OK !");
				  String str = jtf.getText().replaceAll("\\w", "0");jtf.setText(str);
				  System.out.println("Après remplacement : " + str);
				  }
			  }
		  
	  }
	  
		  }

