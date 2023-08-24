package com.java15.feature1;

//class extendes class
// intially
//class Person{}
//
//class Empolyee extends Person{}
//
//class Student extends Person{}
//
//class Animal extends Person{}

// Here Animal class will not be person as we know so by code it's correct
// but by OOPS concept is wrong so here we want Animal should extend Person class
// To acheive this we can use sealed keyword with Permit

// After chnage
sealed class Person permits Empolyee,Student{}

// if you make parent class as sealed then sub class can be sealed or non-sealed 

non-sealed class Empolyee extends Person{}

non-sealed class Student extends Person{}

// Animal class is not allowed to extend Person class

//final class Animal extends Person{}


// interface to class

sealed interface Course permits Students{};

non-sealed class Students implements Course{};


// interface to interface

sealed interface Department permits Employees {};

non-sealed interface Employees extends Department{} ;

public class SealedUse {

	// this is used when you want to make class or abstract class or interface as sealed means 
	// you want that class or interface should not be used by other class or interface

}
