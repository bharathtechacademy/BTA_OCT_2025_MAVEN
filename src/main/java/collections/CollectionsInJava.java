package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsInJava {

	public static void main(String[] args) {
		
		//An array is a data structure that is going to allow us to store multiple values with similar data types together in the same memory location.

		String [] empNames = new String[3]; // This can hold 3 employee names.
		empNames[0] = "Bharath";
		empNames[1] = "ABC";
		empNames[2] = "Bharath";
		
		System.out.println(empNames.length);
		
		/****Challenges with Array****/
		//1. Arrays are fixed in size.
		//2. Memory will be allocated at the beginning of creating the array. That means it is a static memory allocation.
		//3. Array allows similar data types only.
		//4. Arrays won't allow modifications.
		
		/****** Collections Framework ******/
		
		// Advantages
		
		//1. Collections are dynamic in size, meaning no need to declare the size at the beginning.
		//2. Memory will be allocated dynamically based on the data that we are going to store.
		//3. Collections allow different data types within the same data structure.
		//4. Collections allow modifications.
		
		//Major categories of collections that we are going to use in our day-to-day automation roles. ==> List, Set, Map
		
		//List ==> ArrayList, LinkedList
		//1. List can store multiple values with similar data types together at one place by allocating the memory dynamically.
		//2. List follows dynamic memory allocation.
		//3. List allows Duplicate values.
		//4. List allows modifications.		
		
		//Set ==> HashSet, LinkedHashSet, TreeSet
		//1. Set can store multiple values with similar data types together at one place by allocating the memory dynamically.
		//2. Set follows dynamic memory allocation.
		//3. Set won't allow duplicate values.
		//4. Set allows modifications.
		
		//Map ==> HashMap, LinkedHashMap, TreeMap, Hashtable
		
		//1. Map can store multiple values with different data types together (like Key, Value) at one place by allocating memory dynamically.
		//2. Map follows dynamic memory allocation.
		//3. Map won't allow duplicate Keys, But allows duplicate values.
		//4. Set allows modifications.

		// Difference between each sub-category of List, Set, and Map.
		
		// Order of storing values : Insertion order, Sorted/Ascending Order , Random order
		// Allowing the Null values : Allowed / Not-Allowed
		// Memory Allocation Technique : Contiguous Memory Allocation/Non-Contiguous Memory Allocation
		
		/*************Wrapper Classes************/
		//Wrapper classes are used to convert primitive data types into class data types.
		
		//byte --> Byte
		//short --> Short
		//int --> Integer
		//long --> Long
		//float --> Float
		//double --> Double
		//boolean --> Boolean
		//char --> Character
		
		
		/************Key-Words************/
		//1. Hash  --> Random order
		//2. Linked --> Insertion order
		//3. Tree --> Sorted/Ascending order
		
		/************  ArrayList *****************/
		
		System.out.println("************  ArrayList *****************");
		// Syntax to Initialize: List<DataType> variable = new ArrayList<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to get the value: variable.get(index);
		// Syntax to remove the value: variable.remove(index/value);
		// Syntax to get the size: variable.size();
		
		//ArrayList follows insertion order.
		//ArrayList allows Null values.
		//ArrayList follows contiguous memory allocation.
		
		//Store employee names using ArrayList.
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add("Anusha");
		empNamesArrayList.add("Soumya");
		empNamesArrayList.add("Anusha"); // Duplicate value
		empNamesArrayList.add("Binoy");
		empNamesArrayList.add("Bhagwat");
		empNamesArrayList.add(0,"Dhinesh");
		empNamesArrayList.add(null); // Null value
		empNamesArrayList.remove(3);
		System.out.println("Number of employees: " + empNamesArrayList.size());
		System.out.println("Employee at index 3: " + empNamesArrayList.get(3));
		System.out.println("Employee Names: " + empNamesArrayList);
		
		/************  LinkedList *****************/
		
		System.out.println("************  LinkedList *****************");
		// Syntax to Initialize: List<DataType> variable = new LinkedList<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to get the value: variable.get(index);
		// Syntax to remove the value: variable.remove(index/value);
		// Syntax to get the size: variable.size();
		
		//LinkedList follows insertion order.
		//LinkedList allows Null values.
		//LinkedList follows Non-contiguous memory allocation.
		
		//Store employee names using LinkedList.
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add("Anusha");
		empNamesLinkedList.add("Soumya");
		empNamesLinkedList.add("Anusha"); // Duplicate value
		empNamesLinkedList.add("Binoy");
		empNamesLinkedList.add("Bhagwat");
		empNamesLinkedList.add(null); // Null value
		empNamesLinkedList.remove("Bharath");
		System.out.println("Number of employees: " + empNamesLinkedList.size());
		System.out.println("Employee at index 3: " + empNamesLinkedList.get(3));
		System.out.println("Employee Names: " + empNamesLinkedList);
		
		/************  HashSet *****************/
		
		System.out.println("************  HashSet *****************");
		// Syntax to Initialize: List<DataType> variable = new HashSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to get the value: variable.get(index);
		// Syntax to remove the value: variable.remove(index/value);
		// Syntax to get the size: variable.size();
		
		//HashSet follows Random order.
		//HashSet allows Null values.
		//HashSet follows Non-contiguous memory allocation.
		
		//Store employee names using HashSet.
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add("Anusha");
		empNamesHashSet.add("Soumya");
		empNamesHashSet.add("Anusha"); // Duplicate value
		empNamesHashSet.add("Binoy");
		empNamesHashSet.add("Bhagwat");
		empNamesHashSet.add(null); // Null value
		empNamesHashSet.remove("Bharath");
		System.out.println("Number of employees: " + empNamesHashSet.size());
		//System.out.println("Employee at index 3: " + empNamesHashSet.get(3));
		System.out.println("Employee Names: " + empNamesHashSet);
		
		/************  LinkedHashSet *****************/
		
		System.out.println("************  LinkedHashSet *****************");
		// Syntax to Initialize: List<DataType> variable = new LinkedHashSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to get the value: variable.get(index);
		// Syntax to remove the value: variable.remove(index/value);
		// Syntax to get the size: variable.size();
		
		//LinkedHashSet follows Insertion order.
		//LinkedHashSet allows Null values.
		//LinkedHashSet follows Non-contiguous memory allocation.
		
		//Store employee names using LinkedHashSet.
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add("Anusha");
		empNamesLinkedHashSet.add("Soumya");
		empNamesLinkedHashSet.add("Anusha"); // Duplicate value
		empNamesLinkedHashSet.add("Binoy");
		empNamesLinkedHashSet.add("Bhagwat");
		empNamesLinkedHashSet.add(null); // Null value
		empNamesLinkedHashSet.remove("Bharath");
		System.out.println("Number of employees: " + empNamesLinkedHashSet.size());
		//System.out.println("Employee at index 3: " + empNamesLinkedHashSet.get(3));
		System.out.println("Employee Names: " + empNamesLinkedHashSet);
		
		/************  TreeSet *****************/
		
		System.out.println("************  TreeSet *****************");
		// Syntax to Initialize: List<DataType> variable = new TreeSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to get the value: variable.get(index);
		// Syntax to remove the value: variable.remove(index/value);
		// Syntax to get the size: variable.size();
		
		//TreeSet follows Sorted/Ascending order.
		//TreeSet not allows Null values.
		//TreeSet follows Non-contiguous memory allocation.
		
		//Store employee names using TreeSet.
		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("Bharath");
		empNamesTreeSet.add("Anusha");
		empNamesTreeSet.add("Soumya");
		empNamesTreeSet.add("Anusha"); // Duplicate value
		empNamesTreeSet.add("Binoy");
		empNamesTreeSet.add("Bhagwat");
		//empNamesTreeSet.add(null); // Null value
		empNamesTreeSet.remove("Bharath");
		System.out.println("Number of employees: " + empNamesTreeSet.size());
		//System.out.println("Employee at index 3: " + empNamesTreeSet.get(3));
		System.out.println("Employee Names: " + empNamesTreeSet);
		
		
		/************  HashMap *****************/
		
		System.out.println("************  HashMap *****************");
		// Syntax to Initialize: Map<Key, Value> variable = new HashMap<Key, Value>();
		// Syntax to add data: variable.put(key, value);
		// Syntax to get the value: variable.get(key);
		// Syntax to remove the value: variable.remove(key);
		// Syntax to get the size: variable.size();
		
		//HashMap follows random order of Keys
		//HashMap allows Null Keys and Null values.
		
		//Store employee names using HashMap.
		Map<String,Integer> empNamesHashMap = new HashMap<String,Integer>();
		empNamesHashMap.put("Bharath",1234);
		empNamesHashMap.put("Anusha",1235);
		empNamesHashMap.put("Soumya",1236);
		empNamesHashMap.put("Anusha",1237); // Duplicate value
		empNamesHashMap.put("Binoy",1236);
		empNamesHashMap.put("Bhagwat",1238);
		empNamesHashMap.put("Archana",null); // Null value
		empNamesHashMap.put(null,1239); // Null key
		empNamesHashMap.remove("Bharath");
		System.out.println("Number of employees: " + empNamesHashMap.size());
		System.out.println("Employee at index 3: " + empNamesHashMap.get("Anusha"));
		System.out.println("Employee Names: " + empNamesHashMap);
		
		/************  LinkedHashMap *****************/
		
		System.out.println("************  LinkedHashMap *****************");
		// Syntax to Initialize: Map<Key, Value> variable = new LinkedHashMap<Key, Value>();
		// Syntax to add data: variable.put(key, value);
		// Syntax to get the value: variable.get(key);
		// Syntax to remove the value: variable.remove(key);
		// Syntax to get the size: variable.size();
		
		//LinkedHashMap follows Insertion order of Keys
		//LinkedHashMap allows Null Keys and Null values.
		
		//Store employee names using LinkedHashMap.
		Map<String,Integer> empNamesLinkedHashMap = new LinkedHashMap<String,Integer>();
		empNamesLinkedHashMap.put("Bharath",1234);
		empNamesLinkedHashMap.put("Anusha",1235);
		empNamesLinkedHashMap.put("Soumya",1236);
		empNamesLinkedHashMap.put("Anusha",1237); // Duplicate value
		empNamesLinkedHashMap.put("Binoy",1236);
		empNamesLinkedHashMap.put("Bhagwat",1238);
		empNamesLinkedHashMap.put("Archana",null); // Null value
		empNamesLinkedHashMap.put(null,1239); // Null key
		empNamesLinkedHashMap.remove("Bharath");
		System.out.println("Number of employees: " + empNamesLinkedHashMap.size());
		System.out.println("Employee at index 3: " + empNamesLinkedHashMap.get("Anusha"));
		System.out.println("Employee Names: " + empNamesLinkedHashMap);
		
		/************  TreeMap *****************/
		
		System.out.println("************  TreeMap *****************");
		// Syntax to Initialize: Map<Key, Value> variable = new TreeMap<Key, Value>();
		// Syntax to add data: variable.put(key, value);
		// Syntax to get the value: variable.get(key);
		// Syntax to remove the value: variable.remove(key);
		// Syntax to get the size: variable.size();
		
		//TreeMap follows Insertion order of Keys
		//TreeMap allows Null Values ,But It won't allow Null Keys.
		
		//Store employee names using TreeMap.
		Map<String,Integer> empNamesTreeMap = new TreeMap<String,Integer>();
		empNamesTreeMap.put("Bharath",1234);
		empNamesTreeMap.put("Anusha",1235);
		empNamesTreeMap.put("Soumya",1236);
		empNamesTreeMap.put("Anusha",1237); // Duplicate value
		empNamesTreeMap.put("Binoy",1236);
		empNamesTreeMap.put("Bhagwat",1238);
		empNamesTreeMap.put("Archana",null); // Null value
		//empNamesTreeMap.put(null,1239); // Null key
		empNamesTreeMap.remove("Bharath");
		System.out.println("Number of employees: " + empNamesTreeMap.size());
		System.out.println("Employee at index 3: " + empNamesTreeMap.get("Anusha"));
		System.out.println("Employee Names: " + empNamesTreeMap);
		
		
		/************  Hashtable *****************/
		
		System.out.println("************  Hashtable *****************");
		// Syntax to Initialize: Map<Key, Value> variable = new Hashtable<Key, Value>();
		// Syntax to add data: variable.put(key, value);
		// Syntax to get the value: variable.get(key);
		// Syntax to remove the value: variable.remove(key);
		// Syntax to get the size: variable.size();
		
		//Hashtable follows Random order of Keys
		//Hashtable Won't allow both Null Values and Null Keys.
		
		//Store employee names using Hashtable.
		Map<String,Integer> empNamesHashtable = new Hashtable<String,Integer>();
		empNamesHashtable.put("Bharath",1234);
		empNamesHashtable.put("Anusha",1235);
		empNamesHashtable.put("Soumya",1236);
		empNamesHashtable.put("Anusha",1237); // Duplicate value
		empNamesHashtable.put("Binoy",1236);
		empNamesHashtable.put("Bhagwat",1238);
		//empNamesHashtable.put("Archana",null); // Null value
		//empNamesHashtable.put(null,1239); // Null key
		empNamesHashtable.remove("Bharath");
		System.out.println("Number of employees: " + empNamesHashtable.size());
		System.out.println("Employee at index 3: " + empNamesHashtable.get("Anusha"));
		System.out.println("Employee Names: " + empNamesHashtable);


		
		
		
		
		
	}

}
