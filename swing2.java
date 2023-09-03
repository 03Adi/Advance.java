//swing frame remove method setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

import javax.swing.*;
class myframe extends JFrame
{
public static void main(String[] args)
{
myframe f=new myframe();
f.setSize(500,500);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//(JFrame ka method hai and EXIT ON CLOSE are keyword and this is static keyword and this is advantage of swing)
}
}
