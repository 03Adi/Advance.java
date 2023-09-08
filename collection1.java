//By Array
import java.util.*;
class TestJavaCollection
{
public static void main(String arg[])
{
ArrayList<String>list=new ArrayList<String>();//creating a array list
list.add("Aditya");
list.add("Prakhar");
list.add("charu");

Iterator itr=list.iterator();//treversing list by Iterator
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
