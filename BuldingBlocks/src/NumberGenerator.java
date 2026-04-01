//import java.util.Random;
import java.util.*;

public class NumberGenerator {
    public static void main(String[] args){
        Random randomNumber = new Random();
        System.out.println(randomNumber.nextInt(100));
    }
}

//option without using import is to a fully qualified name of the class

//java.util.Random randomNumber = new java.util.Random();

//using wildcards
//import java.util.Random // imports class Random
//import java.util.*      // imports all classes in java.util package
                          // but not in subpackages (subfolders) !!
//import java.util.*.*.   // Does not compile


// conflicts
//import java.util.Date;
//import java.sql.Date; //DOES NOT COMPILE

// solution
//import java.util.Date;
//import java.sql.*;     //Java will use java.util.Date

// using custom packages

// package com.udemy.oca // corresponds to a folder (must be in the first line!)
// public class Oca {}

//package com.udemy.ocp // another folder

// import com.udemy.oca;
// public class Ocp{
//  Oca myOcaInstance = new Oca();
// }