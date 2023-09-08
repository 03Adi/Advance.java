//Linked List

import java.util.*;
class linkedlistcollection
{
public static void main(String arg[])
{
LinkedList<String>al=new LinkedList<String>();
al.add("Aditya");
al.add("charu");
al.add("prakhar");
Iterator<String> itr=al.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
