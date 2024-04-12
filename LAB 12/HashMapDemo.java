import java.util.*;
import java.io.*;
class HashMapDemo {
public static void main(String args[]) {
    

HashMap<String, Integer> hm = new HashMap<String, Integer>();
Scanner sc  = new Scanner(System.in);

hm.put("Viraj", new Integer(18));
hm.put("Meet", new Integer(12));
hm.put("Pruthvi", new Integer(22));
hm.put("Zeel", new Integer(99));
hm.put("Manmender ", new Integer(-19));

Set<Map.Entry<String, Integer>> set = hm.entrySet();

for(Map.Entry<String, Integer> me : set) {
	System.out.print(me.getKey() + ": ");
	System.out.println(me.getValue());
}
System.out.println();
hm.put("Viraj",18);
System.out.println("Viraj's Age : " +
hm.get("Viraj"));
}
}
