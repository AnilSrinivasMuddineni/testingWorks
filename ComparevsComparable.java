package testing1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparevsComparable {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("anil","1123445",25));
		personList.add(new Person("anilsri","11234411",26));
		personList.add(new Person("anil1","11234415",21));
		personList.add(new Person("anil211","11234433",23));
		personList.add(new Person("anil12","11234422",22));
		
		
		Collections.sort(personList);
		System.out.println(personList.toString());
		
		/*SingletonExample singletonExample = SingletonExample.SingletonExampleMethod();
		System.out.println(singletonExample.getS());
		System.out.println((singletonExample.s).toUpperCase());
		SingletonExample singletonExample1 = SingletonExample.SingletonExampleMethod();
		System.out.println((singletonExample.getS()));*/
	}
}
