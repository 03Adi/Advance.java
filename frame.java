import java.awt.*;

class myframe extends Frame
  {
    public static void main(String arg[])
    {
    myframe f = new myframe();
      f.setTitle("My AWT Frame");
      f.setSize(300,300);
      f.setVisible(true);
      f.addWindowListener(new myclass());

    }
  }
class myclass extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
    {
      System.exit(0);
    }
  }
