import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<String> catIDs = new ArrayList<>();

		catIDs.add("600000/30000001/2840670868/1004740008/1007790002");
		catIDs.add("600000/30000001/2845660840/1007680004");
		catIDs.add("600000/30000001/20000017/100260091");
		catIDs.add("600000/30000001/2840670868/1007450013");
		catIDs.add("600000/30000001/2841340857/1004020028");
		catIDs.add("600000/30000001/2845660841/1007680002");
		catIDs.add("600000/30000001/2845660839/1007680003");
		catIDs.add("600000/30000001/2840670868/1005970044");
		catIDs.add("600000/30000001/2840670868/1004830008");
		catIDs.add("600000/30000001/2841340857/1006450003");
		catIDs.add("600000/30000001/20000017/100260091/1008330001");

		List<String> filteredCatIDs = new ArrayList<>(catIDs);

		long start = System.nanoTime();

		for (String catIdToBeSearched : catIDs) {
			for (String restAllCatIds : catIDs) {
				if (restAllCatIds.contains(catIdToBeSearched) && !restAllCatIds.equals(catIdToBeSearched)) {
					filteredCatIDs.remove(catIdToBeSearched);
				}
			}
		}
		System.out.println("Time Taken FOR FOR LOOP " + (System.nanoTime() - start));

		List<String> filteredCatIDsForSteram = new ArrayList<>(catIDs);

		
		start = System.nanoTime();
		
		catIDs.stream().forEach(catIdToBeSearched -> {
			catIDs.stream().forEach(restAllCatIds -> {
				if (restAllCatIds.contains(catIdToBeSearched) && !restAllCatIds.equals(catIdToBeSearched)) {
					filteredCatIDsForSteram.remove(catIdToBeSearched);
				}
			});
		});
		
		
		System.out.println("Time Taken FOR FOR STREEAM " + (System.nanoTime() - start));

		for (String str : filteredCatIDs) {
			System.out.println(str);
		}
		System.out.println("STREAM OUTPUT");
		for (String str : filteredCatIDsForSteram) {
			System.out.println(str);
		}
	}
}
