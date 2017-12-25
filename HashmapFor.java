import java.util.HashMap;
import java.util.Map;

public class HashmapFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        //Adding elements to HashMap
        hmap.put(11, "AB");
        hmap.put(2, "CD");
        hmap.put(33, "EF");
        hmap.put(9, "GH");
        hmap.put(3, "IJ");

        //
        for (Integer i : hmap.keySet()){
        	System.out.println(i);
        }
        
        for (String s :hmap.values()){
        	System.out.println(s);
        }
        
        for (Map.Entry e: hmap.entrySet()){
        	System.out.println(e.getKey());
        	System.out.println(e.getValue());
        }
 }

}
