package ASMMMM.java;

import java.util.ArrayList;
import java.util.Scanner;

	public class StudentManage {
	public static void main(String[] args) {
	// Create a collection object , Used to store student data
	ArrayList<Student> array = new ArrayList<Student>();
	
	while (true) {
	System.out.println("---- Welcome to the student management system ----");
	System.out.println("1 Add student ");
	System.out.println("2 Delete students ");
	System.out.println("3 Modify students ");
	System.out.println("4 Check out all the students ");
	System.out.println("5 Exit ");
	//System.out.print();
	System.out.println(" Please enter your choice (1-5)");
	Scanner sc = new Scanner(System.in);
	String line = sc.nextLine();
	switch (line) {
	case "1":
	// System.out.println(" Add student ");
	addStudent(array);
	break;
	case "2":
	// System.out.println(" Delete students ");
	deletStudent(array);
	break;
	case "3":
	// System.out.println(" Revise students ");
	updateStudent(array);
	break;
	case "4":
	// System.out.println(" Check out all the students ");
	findAllStudent(array);
	break;
	case "5":
	System.out.println(" Thank you for using. ");
	 
	System.exit(0);// JVM sign out
	break;
	
	default: 
	System.out.println("Try again 1-5");
	}
	
	}
	}
	
	// Define a method for adding student information
	public static void addStudent(ArrayList<Student> array) {
	Scanner sc = new Scanner(System.in);
	String sid;
	while (true) {
	System.out.println(" Please enter the student id number ：");
	sid = sc.nextLine();
	boolean flag = isUsed(array, sid);
	if (flag) {
	System.out.println(" The student number you entered has been used , Please re-enter ");
	} else {
	break;
	}
	}
	System.out.println(" Enter the student's name ：");
	String name = sc.nextLine();
	System.out.println(" Enter the age of the student ：");
	String age = sc.nextLine();
	System.out.println(" Enter the student's address ：");
	String address = sc.nextLine();
	Student s = new Student();
	s.setSid(sid);
	s.setName(name);
	s.setAge(age);
	s.setAddress(address);
	array.add(s);
	System.out.println(" Add student successfully ");
	}
	
	// Define a method , Used to view student information
	public static void findAllStudent(ArrayList<Student> array) {
	if (array.size() == 0) {
	System.out.println(" No information , Please add information first , The query again ");
	// In order not to let the program execute down
	return;
	}
	// \t It's equal a tab Location
	System.out.println(" Student number \t\t\t\tFull name \t\t\t Age \t\t\t\t Live ");
	for (int i = 0; i < array.size(); i++) {
	Student s = array.get(i);
	System.out.println("\t"+s.getSid() + "\t\t\t\t\t" + s.getName() + "\t\t\t\t" + s.getAge() + " old " + "\t\t" + s.getAddress());
	}
	}
	// Define a method , Used to delete student information
	public static void deletStudent(ArrayList<Student> array) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the student number you want to delete ");
	String sid = sc.nextLine();
	int index = -1;
	for (int i = 0; i < array.size(); i++) {
	//get element of i 
	Student s = array.get(i);
	if (s.getSid().equals(sid)) {
	index = i;
	break;
	}
	}
	if (index == -1) {
	System.out.println(" The information does not exist , Please re-enter ");
	} else {
	array.remove(index);
	System.out.println(" Delete student success ");
	}
	}
	
	// Define a method for modifying student information
	public static void updateStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the student number of the student you need to change the student information ");
		String sid = sc.nextLine();
		System.out.println(" Enter the name of the new student ");
		String name = sc.nextLine();
		System.out.println(" Enter the age of the new student ");
		String age = sc.nextLine();
		System.out.println(" Enter the new student's address ");
		String Address = sc.nextLine();
		int index = -1;
		Student s = new Student();
		s.setSid(sid);
		s.setName(name);
		s.setAge(age);
		s.setAddress(Address);
		for (int i = 0; i < array.size(); i++) {
		Student student = array.get(i);
		if (student.getSid().equals(sid)) {
		array.set(i, s);
		index = i;
		break;
		}
		}
		if(index == -1)
		{
		System.out.println(" Not success ");
		}else
		{
			
			System.out.println(" Modify Success");
		}
		}	
	public static boolean isUsed(ArrayList<Student> array, String sid) {
		boolean flag = false; //It returns false, if the Boolean flag represent different value
		for (int i = 0; i < array.size(); i++) {
		Student s = array.get(i);
		if (s.getSid().equals(sid)) {
		return true;
		}
		}
		return false;
		}
		}
	
	
