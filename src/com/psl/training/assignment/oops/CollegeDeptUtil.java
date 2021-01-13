package com.psl.training.assignment.oops;

/**
 * Assignment Date 12.1.21 Develop a hierarchy of the department of a college.
 * 
 * Use Interfaces, Abstract classes and Concrete classes wherever applicable.
 * 
 * Person is the superclass for all the people , while Student and Faculty are
 * the subclasses of Person. Person can implement an IPerson interface .
 * 
 * A Faculty is a Salaried type (Interface) .
 * 
 * A Student class will be extended by Undergrad or Graduate subclass. Similarly
 * Faculty can be of UnderGrad or GradType . Faculty may also be of Temporary
 * type (Interface).
 * 
 * @author Somraj Mukherjee
 *
 */
interface IPerson {

}

interface Salaried {

}

interface Temporary {

}

class Person implements IPerson {
	String name;
}

class Student extends Person {

}

class Faculty extends Person implements Salaried, Temporary {

}

class Undergrad extends Student {

}

class Grad extends Student {

}

class UndergradFaculty extends Faculty {

}

class GradFaculty extends Faculty {

}

public class CollegeDeptUtil {

	public static void main(String[] args) {

	}

}
