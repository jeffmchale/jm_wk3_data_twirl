//HEADER 
//Program Name: jm_wk3_data_twirl
//Author: Jeff McHale
//Class: CS260 Fall 2019
//Date: 10/14/2019
//Description: The problem was to take an existing program (that output a pattern using asterisks) and to make the output
//'twirl' in 90º,180º, and 270º increments. 

package edu.cgcc.cs260;


public class MainEntry {

	public static void main(String[] args) {
		//create and fill 2D array to print image
		TwoDArray arr = new TwoDArray();
		arr.printArray();
		System.out.println();
		arr.printArray90();
		System.out.println();
		arr.printArray180();
		System.out.println();
		arr.printArray270();

	}

}

/*
Expected output:
*       ********
**       ****** 
***       ****  
****       **   
*****      **   
******     **   
*******    **   
********  ****  
********
******* 
******  
*****   
****    
***     
**      
*       
       *
      **
*    ***
********
********
*    ***
      **
       *
  ****  ********
   **    *******
   **     ******
   **      *****
   **       ****
  ****       ***
 ******       **
********       *
*       
**      
***    *
********
********
***    *
**      
*       
       *
      **
     ***
    ****
   *****
  ******
 *******
********
*/
