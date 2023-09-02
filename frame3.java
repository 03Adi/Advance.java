//Association event closing in GUI

import java.awt.*;
import java.awt.event.*;
class myframe extends Frame
{
public static void main(String arg[])
{
myframe f=new myframe();
f.setTitle("My AWT frame");
f.setSize(250,200);
f.setVisible(true);
f.addwindowListener(new myclass1());
}
}
class myclass1 extends WindowAdapter
{
public void Windowclosing(WindowEvent e)
{
System.exit(0);
}
}
