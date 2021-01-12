package com.psl.training.assignment.oops;

interface IPerson {

}

interface Salaried {

}

interface Temporary {

}

class Person implements IPerson {

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
