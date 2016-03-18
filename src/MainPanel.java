import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.*;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.*;
import java.awt.event.*;



public class MainPanel extends JPanel {
	
    // static fields:
    private static final String VERSION = "Beta Version";
    private final static String newline = "\n";
    private final static String clear = "";
	
    private JFrame frame;
    private JLabel filenameLabel;
    private JLabel statusLabel;
    private JTextField textFirstName;
	private JTextField textOccupation;
	private JTextField textAdj1;
	private JTextField textAdv1;
	private JTextField textFood1;
	private JTextField textNoun1;
	private JTextField textFood2;
	private JTextField textNumber2;
	private JTextField textVerb1;
	private JTextField textVerb2;
	private JTextField textBuilding;
	private JTextField textNoun2;
	private JTextField textNoun3;
	private JTextField textAdj2;
	private JTextField textNoun4;
	private JTextField textNoun5;
	private JTextField textAdverb2;
	private JTextArea textAreaMain;
	
	/**
	 * Create the panel.
	 */
	public MainPanel() {
		
        frame = new JFrame("MadLibs");

       makeMenuBar(frame);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{185, 100, 116, 59, 0};
		gridBagLayout.rowHeights = new int[]{0, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 37, 37, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblFirstName = new JLabel("A First Name (Female)");
		lblFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.anchor = GridBagConstraints.WEST;
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.gridx = 1;
		gbc_lblFirstName.gridy = 1;
		frame.getContentPane().add(lblFirstName, gbc_lblFirstName);
		
		textFirstName = new JTextField();
		GridBagConstraints gbc_textFirstName = new GridBagConstraints();
		gbc_textFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_textFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFirstName.gridx = 2;
		gbc_textFirstName.gridy = 1;
		frame.getContentPane().add(textFirstName, gbc_textFirstName);
		textFirstName.setColumns(10);
		
		JLabel lblOccupation = new JLabel("Occupation");
		lblOccupation.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblOccupation = new GridBagConstraints();
		gbc_lblOccupation.anchor = GridBagConstraints.EAST;
		gbc_lblOccupation.insets = new Insets(0, 0, 5, 5);
		gbc_lblOccupation.gridx = 1;
		gbc_lblOccupation.gridy = 2;
		frame.getContentPane().add(lblOccupation, gbc_lblOccupation);
		
		textOccupation = new JTextField();
		GridBagConstraints gbc_textOccupation = new GridBagConstraints();
		gbc_textOccupation.insets = new Insets(0, 0, 5, 5);
		gbc_textOccupation.fill = GridBagConstraints.HORIZONTAL;
		gbc_textOccupation.gridx = 2;
		gbc_textOccupation.gridy = 2;
		frame.getContentPane().add(textOccupation, gbc_textOccupation);
		textOccupation.setColumns(10);
		
		JLabel lblAdjective1 = new JLabel("An adjective");
		GridBagConstraints gbc_lblAdjective1 = new GridBagConstraints();
		gbc_lblAdjective1.anchor = GridBagConstraints.EAST;
		gbc_lblAdjective1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdjective1.gridx = 1;
		gbc_lblAdjective1.gridy = 3;
		frame.getContentPane().add(lblAdjective1, gbc_lblAdjective1);
		
		textAdj1 = new JTextField();
		GridBagConstraints gbc_textAdj1 = new GridBagConstraints();
		gbc_textAdj1.insets = new Insets(0, 0, 5, 5);
		gbc_textAdj1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAdj1.gridx = 2;
		gbc_textAdj1.gridy = 3;
		frame.getContentPane().add(textAdj1, gbc_textAdj1);
		textAdj1.setColumns(10);
		
		JLabel lblAdverb1 = new JLabel("An adverb");
		GridBagConstraints gbc_lblAdverb1 = new GridBagConstraints();
		gbc_lblAdverb1.anchor = GridBagConstraints.EAST;
		gbc_lblAdverb1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdverb1.gridx = 1;
		gbc_lblAdverb1.gridy = 4;
		frame.getContentPane().add(lblAdverb1, gbc_lblAdverb1);
		
		textAdv1 = new JTextField();
		GridBagConstraints gbc_textAdv1 = new GridBagConstraints();
		gbc_textAdv1.insets = new Insets(0, 0, 5, 5);
		gbc_textAdv1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAdv1.gridx = 2;
		gbc_textAdv1.gridy = 4;
		frame.getContentPane().add(textAdv1, gbc_textAdv1);
		textAdv1.setColumns(10);
		
		
		JLabel lblFood1 = new JLabel("Type of food (plural)");
		GridBagConstraints gbc_lblFood1 = new GridBagConstraints();
		gbc_lblFood1.anchor = GridBagConstraints.EAST;
		gbc_lblFood1.insets = new Insets(0, 0, 5, 5);
		gbc_lblFood1.gridx = 1;
		gbc_lblFood1.gridy = 5;
		frame.getContentPane().add(lblFood1, gbc_lblFood1);
		
		textFood1 = new JTextField();
		GridBagConstraints gbc_textFood1 = new GridBagConstraints();
		gbc_textFood1.insets = new Insets(0, 0, 5, 5);
		gbc_textFood1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFood1.gridx = 2;
		gbc_textFood1.gridy = 5;
		frame.getContentPane().add(textFood1, gbc_textFood1);
		textFood1.setColumns(10);
		
		JLabel lblNoun1 = new JLabel("Noun");
		GridBagConstraints gbc_lblNoun1 = new GridBagConstraints();
		gbc_lblNoun1.anchor = GridBagConstraints.EAST;
		gbc_lblNoun1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNoun1.gridx = 1;
		gbc_lblNoun1.gridy = 6;
		frame.getContentPane().add(lblNoun1, gbc_lblNoun1);
		
		textNoun1 = new JTextField();
		textNoun1.setText("");
		GridBagConstraints gbc_textNoun1 = new GridBagConstraints();
		gbc_textNoun1.insets = new Insets(0, 0, 5, 5);
		gbc_textNoun1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNoun1.gridx = 2;
		gbc_textNoun1.gridy = 6;
		frame.getContentPane().add(textNoun1, gbc_textNoun1);
		textNoun1.setColumns(10);
		
		JLabel lblFood2 = new JLabel("Type of food");
		GridBagConstraints gbc_lblFood2 = new GridBagConstraints();
		gbc_lblFood2.anchor = GridBagConstraints.EAST;
		gbc_lblFood2.insets = new Insets(0, 0, 5, 5);
		gbc_lblFood2.gridx = 1;
		gbc_lblFood2.gridy = 7;
		frame.getContentPane().add(lblFood2, gbc_lblFood2);
		
		textFood2 = new JTextField();
		GridBagConstraints gbc_textFood2 = new GridBagConstraints();
		gbc_textFood2.insets = new Insets(0, 0, 5, 5);
		gbc_textFood2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFood2.gridx = 2;
		gbc_textFood2.gridy = 7;
		frame.getContentPane().add(textFood2, gbc_textFood2);
		textFood2.setColumns(10);
		
		JLabel lblNumber1 = new JLabel("Number");
		GridBagConstraints gbc_lblNumber1 = new GridBagConstraints();
		gbc_lblNumber1.anchor = GridBagConstraints.EAST;
		gbc_lblNumber1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumber1.gridx = 1;
		gbc_lblNumber1.gridy = 8;
		frame.getContentPane().add(lblNumber1, gbc_lblNumber1);
		
		textNumber2 = new JTextField();
		GridBagConstraints gbc_textNumber2 = new GridBagConstraints();
		gbc_textNumber2.insets = new Insets(0, 0, 5, 5);
		gbc_textNumber2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNumber2.gridx = 2;
		gbc_textNumber2.gridy = 8;
		frame.getContentPane().add(textNumber2, gbc_textNumber2);
		textNumber2.setColumns(10);
		
		JLabel lblVerb1 = new JLabel("Verb");
		GridBagConstraints gbc_lblVerb1 = new GridBagConstraints();
		gbc_lblVerb1.anchor = GridBagConstraints.EAST;
		gbc_lblVerb1.insets = new Insets(0, 0, 5, 5);
		gbc_lblVerb1.gridx = 1;
		gbc_lblVerb1.gridy = 9;
		frame.getContentPane().add(lblVerb1, gbc_lblVerb1);
		
		textVerb1 = new JTextField();
		GridBagConstraints gbc_textVerb1 = new GridBagConstraints();
		gbc_textVerb1.insets = new Insets(0, 0, 5, 5);
		gbc_textVerb1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textVerb1.gridx = 2;
		gbc_textVerb1.gridy = 9;
		frame.getContentPane().add(textVerb1, gbc_textVerb1);
		textVerb1.setColumns(10);
		
		JLabel lblVerb2 = new JLabel("Verb (past tense)");
		GridBagConstraints gbc_lblVerb2 = new GridBagConstraints();
		gbc_lblVerb2.anchor = GridBagConstraints.EAST;
		gbc_lblVerb2.insets = new Insets(0, 0, 5, 5);
		gbc_lblVerb2.gridx = 1;
		gbc_lblVerb2.gridy = 10;
		frame.getContentPane().add(lblVerb2, gbc_lblVerb2);
		
		textVerb2 = new JTextField();
		GridBagConstraints gbc_textVerb2 = new GridBagConstraints();
		gbc_textVerb2.insets = new Insets(0, 0, 5, 5);
		gbc_textVerb2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textVerb2.gridx = 2;
		gbc_textVerb2.gridy = 10;
		frame.getContentPane().add(textVerb2, gbc_textVerb2);
		textVerb2.setColumns(10);
		
		JLabel lblBuilding = new JLabel("Type of Building");
		GridBagConstraints gbc_lblBuilding = new GridBagConstraints();
		gbc_lblBuilding.anchor = GridBagConstraints.EAST;
		gbc_lblBuilding.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuilding.gridx = 1;
		gbc_lblBuilding.gridy = 11;
		frame.getContentPane().add(lblBuilding, gbc_lblBuilding);
		
		textBuilding = new JTextField();
		GridBagConstraints gbc_textBuilding = new GridBagConstraints();
		gbc_textBuilding.insets = new Insets(0, 0, 5, 5);
		gbc_textBuilding.fill = GridBagConstraints.HORIZONTAL;
		gbc_textBuilding.gridx = 2;
		gbc_textBuilding.gridy = 11;
		frame.getContentPane().add(textBuilding, gbc_textBuilding);
		textBuilding.setColumns(10);
		
		JLabel lblNoun2 = new JLabel("Plural noun");
		GridBagConstraints gbc_lblNoun2 = new GridBagConstraints();
		gbc_lblNoun2.anchor = GridBagConstraints.EAST;
		gbc_lblNoun2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNoun2.gridx = 1;
		gbc_lblNoun2.gridy = 12;
		frame.getContentPane().add(lblNoun2, gbc_lblNoun2);
		
		textNoun2 = new JTextField();
		GridBagConstraints gbc_textNoun2 = new GridBagConstraints();
		gbc_textNoun2.insets = new Insets(0, 0, 5, 5);
		gbc_textNoun2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNoun2.gridx = 2;
		gbc_textNoun2.gridy = 12;
		frame.getContentPane().add(textNoun2, gbc_textNoun2);
		textNoun2.setColumns(10);
		
		JLabel lblNoun3 = new JLabel("Plural noun");
		GridBagConstraints gbc_lblNoun3 = new GridBagConstraints();
		gbc_lblNoun3.anchor = GridBagConstraints.EAST;
		gbc_lblNoun3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNoun3.gridx = 1;
		gbc_lblNoun3.gridy = 13;
		frame.getContentPane().add(lblNoun3, gbc_lblNoun3);
		
		textNoun3 = new JTextField();
		GridBagConstraints gbc_textNoun3 = new GridBagConstraints();
		gbc_textNoun3.insets = new Insets(0, 0, 5, 5);
		gbc_textNoun3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNoun3.gridx = 2;
		gbc_textNoun3.gridy = 13;
		frame.getContentPane().add(textNoun3, gbc_textNoun3);
		textNoun3.setColumns(10);
		
		JLabel lblAdjective2 = new JLabel("Adjective");
		GridBagConstraints gbc_lblAdjective2 = new GridBagConstraints();
		gbc_lblAdjective2.anchor = GridBagConstraints.EAST;
		gbc_lblAdjective2.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdjective2.gridx = 1;
		gbc_lblAdjective2.gridy = 14;
		frame.getContentPane().add(lblAdjective2, gbc_lblAdjective2);
		
		textAdj2 = new JTextField();
		GridBagConstraints gbc_textAdj2 = new GridBagConstraints();
		gbc_textAdj2.insets = new Insets(0, 0, 5, 5);
		gbc_textAdj2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAdj2.gridx = 2;
		gbc_textAdj2.gridy = 14;
		frame.getContentPane().add(textAdj2, gbc_textAdj2);
		textAdj2.setColumns(10);
		
		JLabel lblNoun4 = new JLabel("Plural noun");
		GridBagConstraints gbc_lblNoun4 = new GridBagConstraints();
		gbc_lblNoun4.anchor = GridBagConstraints.EAST;
		gbc_lblNoun4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNoun4.gridx = 1;
		gbc_lblNoun4.gridy = 15;
		frame.getContentPane().add(lblNoun4, gbc_lblNoun4);
		
		textNoun4 = new JTextField();
		GridBagConstraints gbc_textNoun4 = new GridBagConstraints();
		gbc_textNoun4.insets = new Insets(0, 0, 5, 5);
		gbc_textNoun4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNoun4.gridx = 2;
		gbc_textNoun4.gridy = 15;
		frame.getContentPane().add(textNoun4, gbc_textNoun4);
		textNoun4.setColumns(10);
		
		JLabel lblNoun5 = new JLabel("Noun");
		GridBagConstraints gbc_lblNoun5 = new GridBagConstraints();
		gbc_lblNoun5.anchor = GridBagConstraints.EAST;
		gbc_lblNoun5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNoun5.gridx = 1;
		gbc_lblNoun5.gridy = 16;
		frame.getContentPane().add(lblNoun5, gbc_lblNoun5);
		
		textNoun5 = new JTextField();
		GridBagConstraints gbc_textNoun5 = new GridBagConstraints();
		gbc_textNoun5.insets = new Insets(0, 0, 5, 5);
		gbc_textNoun5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNoun5.gridx = 2;
		gbc_textNoun5.gridy = 16;
		frame.getContentPane().add(textNoun5, gbc_textNoun5);
		textNoun5.setColumns(10);
		
		JLabel lblAdverb2 = new JLabel("Adverb");
		GridBagConstraints gbc_lblAdverb2 = new GridBagConstraints();
		gbc_lblAdverb2.anchor = GridBagConstraints.EAST;
		gbc_lblAdverb2.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdverb2.gridx = 1;
		gbc_lblAdverb2.gridy = 17;
		frame.getContentPane().add(lblAdverb2, gbc_lblAdverb2);
		
		textAdverb2 = new JTextField();
		GridBagConstraints gbc_textAdverb2 = new GridBagConstraints();
		gbc_textAdverb2.insets = new Insets(0, 0, 5, 5);
		gbc_textAdverb2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAdverb2.gridx = 2;
		gbc_textAdverb2.gridy = 17;
		frame.getContentPane().add(textAdverb2, gbc_textAdverb2);
		textAdverb2.setColumns(10);
		
	    textAreaMain = new JTextArea(15, 30);
	    textAreaMain.setEditable(false);
	    JScrollPane scrollPane = new JScrollPane(textAreaMain);
	    GridBagConstraints gbc_scrollPane = new GridBagConstraints();
	    gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
	    gbc_scrollPane.fill = GridBagConstraints.HORIZONTAL;
	    gbc_scrollPane.gridx = 2;
	    gbc_scrollPane.gridy = 19;
	    frame.getContentPane().add(scrollPane, gbc_scrollPane);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { newLib();
			}
		});
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.insets = new Insets(0, 0, 5, 5);
		gbc_btnClear.gridx = 0;
		gbc_btnClear.gridy = 18;
		frame.getContentPane().add(btnClear, gbc_btnClear);
		
		JButton btnGo = new JButton("Go");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { goButton(); 
			}
		});
		GridBagConstraints gbc_btnGo = new GridBagConstraints();
		gbc_btnGo.insets = new Insets(0, 0, 5, 5);
		gbc_btnGo.gridx = 1;
		gbc_btnGo.gridy = 18;
		frame.getContentPane().add(btnGo, gbc_btnGo);
		
		// building is done - arrange the components     
        frame.pack();
        
        // place the frame at the center of the screen and show
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(d.width/2 - frame.getWidth()/2, d.height/2 - frame.getHeight()/2);
        frame.setVisible(true);
        
        // Closes the program when the "Red X" is activated
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
}
		
	
	 private void makeMenuBar(JFrame frame)
	    {
	        final int SHORTCUT_MASK =
	            Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();

	        JMenuBar menubar = new JMenuBar();
	        frame.setJMenuBar(menubar);
	        
	        JMenu menu;
	        JMenuItem item;
	        
	        // create the File menu
	        menu = new JMenu("File");
	        menubar.add(menu);

	        item = new JMenuItem("New");
	            item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, SHORTCUT_MASK));
	            item.addActionListener(new ActionListener() {
	                               public void actionPerformed(ActionEvent e) { newLib(); }
	                           });
	        menu.add(item);
	        menu.addSeparator();
	        
	        item = new JMenuItem("Quit");
	            item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
	            item.addActionListener(new ActionListener() {
	                               public void actionPerformed(ActionEvent e) { quit(); }
	                           });
	        menu.add(item);

	        // create the Help menu
	        menu = new JMenu("Help");
	        menubar.add(menu);
	        
	        item = new JMenuItem("About MadLibs...");
	            item.addActionListener(new ActionListener() {
	                               public void actionPerformed(ActionEvent e) { showAbout(); }
	                           });
	        menu.add(item);
	    }
	 
	    private void quit()
	    {
	        System.exit(0);
	    }

	    private void showAbout()
	    {
	        JOptionPane.showMessageDialog(frame, 
	                    "MadLibs\n" + VERSION,
	                    "About MadLibs", 
	                    JOptionPane.INFORMATION_MESSAGE);
	    }
	    
	    private void showStatus(String text)
	    {
	        statusLabel.setText(text);
	    }
	    
	    private void newLib(){
	    
	    	textFirstName.setText(clear);
	    	textOccupation.setText(clear);
	    	textAdj1.setText(clear);
	    	textAdv1.setText(clear);
	    	textFood1.setText(clear);
	    	textNoun1.setText(clear);
	    	textFood2.setText(clear);
	    	textNumber2.setText(clear);
	    	textVerb1.setText(clear);
	    	textVerb2.setText(clear);
	    	textBuilding.setText(clear);
	    	textNoun2.setText(clear);
	    	textNoun3.setText(clear);
	    	textAdj2.setText(clear);
	    	textNoun4.setText(clear);
	    	textNoun5.setText(clear);
	    	textAdverb2.setText(clear);
	    	textAreaMain.setText(clear);
	    }
	    
	    private void goButton(){

	        String text = "How to survive when lost in the Mountains" + newline + newline +
	        		"Everyone has heard the story of Hansel and " + textFirstName.getText() + newline +
	        		"who are left in the woods by their father, " + newline +
	        		"a very poor " + textOccupation.getText() + " who can no longer care for them. " + newline +
	        		" The two " + textAdj1.getText() + " children " + textAdv1.getText() + " find their way " + newline +
	        		" home by leaving a trail of " + textFood1.getText() + "." + newline +
	        		" Well, even though that's just a/an " + textNoun1.getText() + " tale, " + newline +
	        		" and you probably won't encounter a witch  or a house made " + newline +
	        		" of " + textFood2.getText() + ", keeping your wits about you " + newline + 
	        		" is crucial if lost in the wild. In fact, " + newline +
	        		" your chances of being found are " + textNumber2.getText() + "% greater if you " + newline +
	        		"follow these steps: " + newline + newline +
	        		"1) Do not " + textVerb1.getText() + "! This will only use up energy and " + newline +
	        		"decrease your chances of ever being " + textVerb2.getText() + "." + newline +
	        		"2) Find or build a/an " + textBuilding.getText() + ". If this is not possible, " + newline +
	        		" dig a hole for yourself in some " + textNoun2.getText() + ";" + newline +
	        		"you can use " + textNoun3.getText() + " to insulate it." + newline +
	        		"3) Signal for help by building three " + textAdj2.getText() + newline +
	        		textNoun4.getText() + " in a/an " + textNoun5.getText() + " shape." + newline +
	        		"Hopefully your story will end " + newline +
	        		textAdverb2.getText() + " ever after, too!";
	        textAreaMain.append(text + newline);
	        textAreaMain.selectAll();
	    	
	    }
	    
	}



