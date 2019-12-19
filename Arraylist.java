package testarray;


/*
CSC3410 - Fall 2015
Sidney Seay -  xxxx@student.gsu.edu

Assignment: #3

card class

File(s):

Purpose: Gain experience with vectors and generic algorithms
  
*/


import java.awt.*;
import java.io.*;
import java.util.*;

public class Arraylist  {

	/*
	 *  define variable
	 */
    Object arrayListObj[];
    int arrayListSize = 0;

	/*
	 *  constructor Arraylist()
	 */    
    public void Arraylist(){
    	arrayListObj = new Object[10];
    	
   	   System.out.println("Constructor method Arrarlist() was called by the driver program");    	
    }

	/*
	 *  constructor Arraylist(int n)
	 */        
    public void Arraylist(int n){
    	arrayListObj = new Object[n];
    	
    	System.out.println("Constructor method Arrarlist(int n) was called by the driver program");    	
    }

    /*
     *  increase size of array list    
     */
    private void arrayListSizeIncrease() {
    	
    	arrayListObj = Arrays.copyOf(arrayListObj, (int)arrayListObj.length * 2);
    }

    /*
     * 
     */
    public void loadArrayList(Object obj) {
    	int len = (int)(obj.toString().length());
    	
    	if (len > 10) {
    		arrayListSizeIncrease();    		
    	}
        arrayListObj = obj.toString().split(",");

    }
    
    /*
     *  determine if array list is empty
     */
    public boolean isEmpty() {
    	
    	if ((int)(arrayListObj).length > 0) {
    		return true;
    	}
    	return false;
    }
    
    /*
     *  get size of array list
     */
    public int size() {
    	
    	return (int)arrayListObj.length;
    }
    
    /*
     * add object to array list 
     * 
     */
    public void add(Object x)
    {
       if ((int)(arrayListObj).length <= 10) {
    	   
       }
       else {
       	arrayListSize++;    	   
       }
    }
    
    /*
     * get object from array list 
     * 
     */
    public Object get(int index)
    {
    	Object obj;
    	
        obj = arrayListObj[index];

        return obj;
    }
}