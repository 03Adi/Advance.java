//swing by inheritence

import javax.swing.*;
class Simple2 extends JFrame
{
JFrame f;
Simple2(){
JButton b=new JButton("click");
b.setBounds(130,100,100,40);
add(b);
setSize(400,500);
setLayout(null);
setVisible(true);
}
public static void main(String[] args)
{
new Simple2();
}
}
