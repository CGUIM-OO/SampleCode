import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> m = new HashMap<>();
		while (sc.hasNext()) {
			String w = sc.next();
			if(w.equals("Esc")){
				break;
			}
			Integer n;
//			if ((m.get(w)) != null) {
//				n=m.get(w);
//				m.put(w, m.get(w) + 1);
//			}
			if ((n = m.get(w)) != null) {
				m.put(w, n + 1);
			}
			else {
				m.put(w, 1);
			}
		}
		//String[] keys= (String[]) m.keySet().toArray();

		System.out.println( m.toString());
		for (String w : m.keySet()) {
			System.out.println(w + ": " + m.get(w));
		}
	}
}
