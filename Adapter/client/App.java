package problem.client;

import java.util.ArrayList;
import java.util.Enumeration;

import problem.lib.LinearTransformer;

public class App {
	public static void main(String[] args) throws Exception {

		System.out.println("\nTest 1: Normal ArrayList");

		ArrayList<String> vect = new ArrayList<String>();
		for(int i = 1; i <= 3; ++i) {
			vect.add("Noor Mai " + i);
		}

		Enumeration<String> etion = new EnumerationAdapter<String>(vect.iterator());
		LinearTransformer<String> lT = new LinearTransformer<String>(etion);
		lT.transform(System.out);


		System.out.println("\nTest 2: Edge case - empty ArrayList");
		ArrayList<String> emptyList = new ArrayList<>();
		Enumeration<String> emptyEnumAdapter = new EnumerationAdapter<>(emptyList.iterator());
		LinearTransformer<String> emptyTransformer = new LinearTransformer<>(emptyEnumAdapter);
		emptyTransformer.transform(System.out);

		System.out.println("\nTest 3: Large ArrayList");
		ArrayList<String> largeList = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			largeList.add("Noor Mai " + i);
		}
		Enumeration<String> largeEnumAdapter = new EnumerationAdapter<>(largeList.iterator());
		LinearTransformer<String> largeTransformer = new LinearTransformer<>(largeEnumAdapter);
		largeTransformer.transform(System.out);

	}
}