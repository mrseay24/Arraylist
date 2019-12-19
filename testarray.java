package testarray;

/*
  CSC3410 - Fall 2015
  Sidney Seay -  xxxx@student.gsu.edu

  Assignment: #3

  testarray class

  File(s):

  Purpose: Implement the Array List data structure that exist in the
           java library.
           Allow for function add, get, size, isEmpty, isIn, find, remove
           count the amount of punctuation 
    
*/

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import testarray.Arraylist;

public class testarray {

    private Arraylist arrayList;  // reference class Arraylist
    
	/*
	 * constructor
	 */
	testarray() {
    	arrayList = new Arraylist();	
	}
    
    /*
     * Main program logic
     * Get array list input data from console
     * call class ArrayList.java
     * 
     */
    public static void main(String args[]){
       Object objArray;
       
  	   Scanner input = new Scanner(System.in);
  	   // display on console enter file name
  	   System.out.println("Enter array list data separated by a comma - for example 1, 2, 3, 4 : ");

  	   input = new Scanner(System.in);
       Object arrayListInput = input.nextLine();
       
       // create instance of class ArrayList.java
   	   Arraylist arrayList = new Arraylist();

   	   // load input data into array list object
   	   arrayList.loadArrayList(arrayListInput);

   	   // determine if array list object is empty   	   
   	   boolean arrayListEmpty = arrayList.isEmpty();
   	   
   	   System.out.println("Is the array list empty " + arrayListEmpty);
       
       arrayList.add("10"); 
   	   System.out.println("Add object to array list");
   	   
       objArray = arrayList.get(5);
   	   System.out.println("Get object from array list ");
       
    }
}