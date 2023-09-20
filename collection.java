import java.util.ArrayList;
import java.util.ListIterator;

class ArrayListIterator
{
public static void main(String arg[])
{
ArrayList<String>arrlist=new ArrayList<String>();
arrlist.add("a");
arrlist.add("aa");
arrlist.add("aaa");
arrlist.add("aaaa");
arrlist.add("aaaaa");
System.out.println(arrlist);

ListIterator<String>iterartor=arrlist.listIterator(2);
while(iterator.hasNext())
{
String i=iterator.next();
System.out.println(i);
}
}
}
