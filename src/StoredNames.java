import java.util.Random;
import java.util.ArrayList;
public class StoredNames {
	public static ArrayList<String> names = new ArrayList<>();

	public StoredNames(){
		names.add("Mike Flowers");
		names.add("Arun Kumar");
		names.add("Jeff Ryan");
	}

	public static String showNames(){
		Random r = new Random();
		int listSize = names.size();
		System.out.println("listSize: " + listSize);
		System.out.println("Contents is: ");
		System.out.println(names);
		return names.get(r.nextInt(listSize));
	}

	public static void addNames(String str){
		names.add(str);
		System.out.println("size after add: " + names.size());
	}

}
