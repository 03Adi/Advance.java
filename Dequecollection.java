//Array Deque in collection framework
import java.util.*;
class dequecollection
{
public static void main(String arg[])
{
Deque<String> deque=new ArrayDeque<String>();
deque.add("Aditya");
deque.add("Prakash");
deque.add("Pandey");
for(String str:deque)
{
System.out.println(str);
}
}
}
