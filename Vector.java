//vector
import java.util.*;
class vectorcollection
{
public static void main(String arg[])
{
Vector<String>v=new Vector<String>();
v.add("aditya");
v.add("charu");
v.add("prakhar");
Iterator<String> itr=v.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
