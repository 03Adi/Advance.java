//Stack method in collection framework
import java.util.*;
class stackcollection
{
public static void main(String arg[])
{
Stack<String> stack=new Stack<String>();
stack.push("Aditya");
stack.push("Charu");
stack.push("Prakhar");
stack.push("Dosti");
stack.pop();
Iterator<String> itr=stack.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
