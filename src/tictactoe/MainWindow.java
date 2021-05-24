/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author damien
 */

public class MainWindow extends JFrame implements ActionListener {
    
   public static final int WIDTH = 500;
   public static final int HEIGHT = 400;
   public JLabel label = new JLabel("Player 1");
   private JButton addButton = new JButton(" ");
   private JButton addButton2 = new JButton(" ");
   private JButton addButton3 = new JButton(" ");
   private JButton addButton4 = new JButton(" ");
   private JButton addButton5 = new JButton(" ");
   private JButton addButton6 = new JButton(" ");
   private JButton addButton7 = new JButton(" ");
   private JButton addButton8 = new JButton(" ");
   private JButton addButton9 = new JButton(" ");
       
    public MainWindow()
    {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);       
        setLayout(new BorderLayout());
        
        JPanel boardLayout = new JPanel();
        boardLayout.setLayout(new GridLayout(3,3));
        
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new FlowLayout());
       
        textPanel.add(label);        
        add(textPanel,BorderLayout.NORTH);
        add(boardLayout,BorderLayout.CENTER);
 
        
        addButton.addActionListener(this);
        boardLayout.add(addButton);
           
        boardLayout.add(addButton2);
        addButton2.addActionListener(this);
              
        boardLayout.add(addButton3);
        addButton3.addActionListener(this);
                
        boardLayout.add(addButton4);
        addButton4.addActionListener(this);
                 
         boardLayout.add(addButton5);
        addButton5.addActionListener(this);
                  
       
        boardLayout.add(addButton6);
        addButton6.addActionListener(this);
                 
      
        boardLayout.add(addButton7);
        addButton7.addActionListener(this);
                 
       
        boardLayout.add(addButton8); 
        addButton8.addActionListener(this);
            
      
        boardLayout.add(addButton9); 
        addButton9.addActionListener(this);
        
                
    }
    
    public void actionPerformed(ActionEvent e)
    {
     
        String actionCommand = e.getActionCommand();
      
        if(actionCommand.equals(" ") && (label.getText() == "Player 1") && e.getSource() == addButton)
         {          
            label.setText("Player 2");
            addButton.setText("X");
         }
        else if(actionCommand.equals(" ") && label.getText() == "Player 2" && e.getSource() == addButton)
            {          
        label.setText("Player 1");
          addButton.setText("O");      
            }
        else if(actionCommand.equals(" ") && (label.getText() == "Player 1") && e.getSource() == addButton2)
         {          
            label.setText("Player 2");
            addButton2.setText("X");
         }
        else if(actionCommand.equals(" ") && label.getText() == "Player 2" && e.getSource() == addButton2)
            {          
        label.setText("Player 1");
          addButton2.setText("O");      
            }
        else if(actionCommand.equals(" ") && (label.getText() == "Player 1") && e.getSource() == addButton3)
         {          
            label.setText("Player 2");
            addButton3.setText("X");
         }
        else if(actionCommand.equals(" ") && label.getText() == "Player 2" && e.getSource() == addButton3)
            {          
        label.setText("Player 1");
          addButton3.setText("O");      
            }
        else if(actionCommand.equals(" ") && (label.getText() == "Player 1") && e.getSource() == addButton4)
         {          
            label.setText("Player 2");
            addButton4.setText("X");
         }
        else if(actionCommand.equals(" ") && label.getText() == "Player 2" && e.getSource() == addButton4)
            {          
        label.setText("Player 1");
          addButton4.setText("O");      
            }
       else if(actionCommand.equals(" ") && (label.getText() == "Player 1") && e.getSource() == addButton5)
         {          
            label.setText("Player 2");
            addButton5.setText("X");
         }
        else if(actionCommand.equals(" ") && label.getText() == "Player 2" && e.getSource() == addButton5)
            {          
        label.setText("Player 1");
          addButton5.setText("O");      
            }
        else if(actionCommand.equals(" ") && (label.getText() == "Player 1") && e.getSource() == addButton6)
         {          
            label.setText("Player 2");
            addButton6.setText("X");
         }
        else if(actionCommand.equals(" ") && label.getText() == "Player 2" && e.getSource() == addButton6)
            {          
        label.setText("Player 1");
          addButton6.setText("O");      
            }
        else if(actionCommand.equals(" ") && (label.getText() == "Player 1") && e.getSource() == addButton7)
         {          
            label.setText("Player 2");
            addButton7.setText("X");
         }
        else if(actionCommand.equals(" ") && label.getText() == "Player 2" && e.getSource() == addButton7)
            {          
        label.setText("Player 1");
          addButton7.setText("O");      
            }
        else if(actionCommand.equals(" ") && (label.getText() == "Player 1") && e.getSource() == addButton8)
         {          
            label.setText("Player 2");
            addButton8.setText("X");
         }
        else if(actionCommand.equals(" ") && label.getText() == "Player 2" && e.getSource() == addButton8)
            {          
        label.setText("Player 1");
          addButton8.setText("O");      
            }
        else if(actionCommand.equals(" ") && (label.getText() == "Player 1") && e.getSource() == addButton9)
         {          
            label.setText("Player 2");
            addButton9.setText("X");
         }
        else if(actionCommand.equals(" ") && label.getText() == "Player 2" && e.getSource() == addButton9)
            {          
        label.setText("Player 1");
          addButton9.setText("O");      
            }
    }
    
}
