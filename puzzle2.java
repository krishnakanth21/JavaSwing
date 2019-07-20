package puzzle2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

import javax.swing.JComboBox;

public class puzzle2 {

    private JFrame frame;
    private final Action action = new SwingAction();

    /**
     * Launch the application.
     */
    static Instant start;
 // ...
   static Instant finish;
  Long timeElapsed;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    String fn = JOptionPane.showInputDialog("Do you want to start the puzzle?!(YES/NO)");
                     start=  Instant.now();        
                                     
            //JOptionPane.showMessageDialog(null, "The answer is " + sum, "the title", JOptionPane.PLAIN_MESSAGE);
                    if(fn.equals("YES"))
                    {
                    puzzle2 window = new puzzle2();
                    window.frame.setVisible(true);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public puzzle2() {
        initialize();
    }
  

public class win extends JFrame{
  
    JLabel item1,item2;
  
    public win() throws Throwable{
        super("WINNER!");
        setLayout(new FlowLayout());
        finish=Instant.now();
        timeElapsed=Duration.between(start, finish).toMillis();
        int time=(int)(timeElapsed/1000);
        item1 = new JLabel("Won : "+time+" s");
        add(item1);
        item1.setToolTipText("congrats!");
        /*FileOutputStream fos = new FileOutputStream("Data.txt");
        DataOutputStream dos = new DataOutputStream(fos);

      
        dos.writeLong(timeElapsed);*/
        FileOutputStream fw = null;
        fw = new FileOutputStream("Data.txt");
        FileInputStream fin=new FileInputStream("Data.txt");
        fw.write(time);
        fw.write(5);
        int i=fin.read();
        item2=new JLabel("Highscore ="+i);
        add(item2);
        fw.close();   
    }
  
}

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        JButton b1= new JButton("1");
        JButton b2= new JButton(" ");
        JButton b3= new JButton("3");
        JButton b4= new JButton("4");
        JButton b5= new JButton("5");
        JButton b6= new JButton("6");
        JButton b7= new JButton("7");
        JButton b8= new JButton("8");
        JButton b9= new JButton("2");
        JButton Next= new JButton("Shuffle");
     
     
        b2.setBounds(164, 83, 48, 48);
        frame.getContentPane().add(b2);
     
     
        b1.setBounds(104, 83, 48, 48);
        frame.getContentPane().add(b1);
     
        b3.setBounds(224, 83, 48, 48);
        frame.getContentPane().add(b3);
     
        b4.setBounds(104, 132, 48, 48);
        frame.getContentPane().add(b4);
     
        b5.setBounds(164, 132, 48, 48);
        frame.getContentPane().add(b5);
     
        b6.setBounds(224, 132, 48, 48);
        frame.getContentPane().add(b6);
     
        b7.setBounds(104, 183, 48, 48);
        frame.getContentPane().add(b7);
     
        b8.setBounds(164, 183, 48, 48);
        frame.getContentPane().add(b8);
     
        b9.setBounds(224, 183, 48, 48);
        frame.getContentPane().add(b9);
     
        Next.setBounds(306, 144, 117, 25);
        frame.getContentPane().add(Next);
     
     
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s=b1.getLabel();
                if(b2.getLabel().equals(" ")){ b2.setLabel(s); b1.setLabel(" ");}
                else if(b4.getLabel().equals(" ")){ b4.setLabel(s); b1.setLabel(" ");}
            }
        });
     
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s=b2.getLabel();
                if(b1.getLabel().equals(" ")){ b1.setLabel(s); b2.setLabel(" ");}
                else if(b3.getLabel().equals(" ")){ b3.setLabel(s); b2.setLabel(" ");}
                else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b2.setLabel(" ");}
            }
        });
     
     
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s=b3.getLabel();
                if(b2.getLabel().equals(" ")){ b2.setLabel(s); b3.setLabel(" ");}
                else if(b6.getLabel().equals(" ")){ b6.setLabel(s); b3.setLabel(" ");}
            }
        });
 

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s=b4.getLabel();
                if(b1.getLabel().equals(" ")){ b1.setLabel(s); b4.setLabel(" ");}
                else if(b7.getLabel().equals(" ")){ b7.setLabel(s); b4.setLabel(" ");}
                else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b4.setLabel(" ");}
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s=b5.getLabel();
                if(b2.getLabel().equals(" ")){ b2.setLabel(s); b5.setLabel(" ");}
                else if(b4.getLabel().equals(" ")){ b4.setLabel(s); b5.setLabel(" ");}
                else if(b6.getLabel().equals(" ")){ b6.setLabel(s); b5.setLabel(" ");}
                else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b5.setLabel(" ");}
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s=b6.getLabel();
                if(b9.getLabel().equals(" ")){ b9.setLabel(s); b6.setLabel(" ");}
                else if(b3.getLabel().equals(" ")){ b3.setLabel(s); b6.setLabel(" ");}
                else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b6.setLabel(" ");}
            }
        });

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s=b7.getLabel();
                if(b4.getLabel().equals(" ")){ b4.setLabel(s); b7.setLabel(" ");}
                else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b7.setLabel(" ");}
            }
        });

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s=b8.getLabel();
                if(b7.getLabel().equals(" ")){ b7.setLabel(s); b8.setLabel(" ");}
                else if(b9.getLabel().equals(" ")){ b9.setLabel(s); b8.setLabel(" ");}
                else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b8.setLabel(" ");}
            }
        });
     
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s=b9.getLabel();
                if(b6.getLabel().equals(" ")){ b6.setLabel(s); b9.setLabel(" ");}
                else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b9.setLabel(" ");}
                if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel().equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")&&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel().equals("8")&&b9.getLabel().equals(" ")){
                    {
                        //JOptionPane.showMessageDialog(null, "YOU HAVE WON!!!");
                        win kk;
                        try {
                            kk = new win();
                            kk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
                            kk.setSize(275,180);
                            kk.setVisible(true);
                        } catch (Throwable e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                       
                      
                    }
                  
                }
             
            }
        }); 
     
     
     
        Next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s=b4.getLabel();
                b4.setLabel(b9.getLabel());
                b9.setLabel(s);
                s=b1.getLabel();
                b1.setLabel(b5.getLabel());
                b5.setLabel(s);
                s=b2.getLabel();
                b2.setLabel(b7.getLabel());
                b7.setLabel(s);
            }
        });
 
     

    }
 
 
 
    private class SwingAction extends AbstractAction {
        public SwingAction() {
            putValue(NAME, "SwingAction");
            putValue(SHORT_DESCRIPTION, "Some short description");
        }
        public void actionPerformed(ActionEvent e) {
        }
    }
}

