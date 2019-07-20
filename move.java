package move;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*; //color
class myframe extends JFrame  {
int x=0,y=150;
myframe()  {
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public void paint(Graphics g) {
super.paint(g);
g.drawString("Not a Hello, World program", x,y);
x=x+10;
try{
Thread.sleep(100);} catch(InterruptedException e){}
if(x<=500)
repaint();
}
} // class myframe
class Sample
{
public static void main(String[] a)
{
myframe f=new myframe();
}
}