import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * @author: Nathiélle Nascimento
 * @date: 07/04/2021
 * BakeryApp.java
 * Continuous Assessment - Software Development
 * National College of Ireland - Higher Diploma in Computing Science 
 */


public class BakeryApp {
	public static void main (String args[]) {
		
		//Declare variables
		int MAX_NUM_RATINGS = 3,  MAX_NUM_ITEMS = 5, option;
		String ratingItem;
		String items[] = new String[MAX_NUM_ITEMS];
		int ratingItem0[] = new int[MAX_NUM_RATINGS];
		int ratingItem1[] = new int[MAX_NUM_RATINGS];
		int ratingItem2[] = new int[MAX_NUM_RATINGS];
		int ratingItem3[] = new int[MAX_NUM_RATINGS];
		int ratingItem4[] = new int[MAX_NUM_RATINGS];
		double max = 0.0;
		double avg[] = new double[MAX_NUM_ITEMS];
		double sum[] =  new double[MAX_NUM_ITEMS];
        
        
        //Create object
        Bakery myItem = new Bakery();
        
        //show a message to explain what the application do.
        JOptionPane.showMessageDialog(null, "Hello," +
        							 "\n" +
        							 "\nYou will be asked to add items into a Bakery and then rating " +
        							 "\nthose items." +
        							 "\n" +
        							 "\n You can add a maximo of "+ MAX_NUM_ITEMS + " items." +
        							 "\n You can provide a maxino of " + MAX_NUM_RATINGS + " ratings per items.");
        
        //Input
       /* Keep the menu open unless is pressed 7 to exit the application*/
        do {
		option = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter number: " + 
															"\n1 - Add an intem" +
															"\n2 - Display all the items " +
															"\n3 - Add a rating for a given item" +
															"\n4 - Display all the ratings for a given item" +
															"\n5 - Calculate and display the average rating for each item" +
															"\n6 - Display the best item based on the average rating" +
															"\n7 - Exit application" +
															"\nEnter your choice: "));
		//Process
		myItem.setOption(option);
 
		//Output
        items = myItem.getItems();
        ratingItem0 = myItem.getRatingItem0();
        ratingItem1 = myItem.getRatingItem1();
        ratingItem2 = myItem.getRatingItem2();
        ratingItem3 = myItem.getRatingItem3();
        ratingItem4 = myItem.getRatingItem4();
        avg = myItem.getAvg();
        sum = myItem.getSum();
        max = myItem.getMax();
        
        switch(option) {
    	case 1: 
    	{	//Process
    		myItem.computeInputItems();
    		
    		break;
    	}
    	case 2:
    	{
    		//Display all items from the array and show a message if the array is empty
			if (items[0]!= null) {
				JOptionPane.showMessageDialog(null, items);
				
				}else {
					JOptionPane.showMessageDialog(null, "The list is empty. Please add a new item.");
    				
    			}
    		
    		break;
    	}
    			
    	case 3:
    	{	//Process
    		myItem.computeInputRatings();
    	break;
    	}
    	
    	case 4:{
    		
    		ratingItem = JOptionPane.showInputDialog(null, "Please enter the name of the item that you want to display the rating:" +
															"\n- " + items[0] + 
															"\n- " + items[1] +
															"\n- " + items[2] +
															"\n- " + items[3] +
															"\n- " + items[4]);

					//Checks in the arrays which position the item entered was and show the rating for the given item.
					if(ratingItem.equalsIgnoreCase(items[0])) {
					if(ratingItem0[0] == 0) {
					JOptionPane.showMessageDialog(null, "The Item does not have a rate.");
					}else {
					JOptionPane.showMessageDialog(null, "Item: " + items[0] + "\nRate: " + Arrays.toString(ratingItem0));
					}
					}else if(ratingItem.equalsIgnoreCase(items[1])) {
					if(ratingItem1[0] == 0) {
					JOptionPane.showMessageDialog(null, "The Item does not have a rate.");
					}else {
					JOptionPane.showMessageDialog(null, "Item: " + items[1] + "\nRate: " + Arrays.toString(ratingItem1));
					}	
					}else if(ratingItem.equalsIgnoreCase(items[2])) {
					if(ratingItem2[0] == 0) {
					JOptionPane.showMessageDialog(null, "The Item does not have a rate.");
					}else {
					JOptionPane.showMessageDialog(null, "Item: " + items[2] + "\nRate: " + Arrays.toString(ratingItem2));
					}	
					}else if(ratingItem.equalsIgnoreCase(items[3])) {
					if(ratingItem3[0] == 0) {
					JOptionPane.showMessageDialog(null, "The Item does not have a rate.");
					}else {
					JOptionPane.showMessageDialog(null, "Item: " + items[3] + "\nRate: " + Arrays.toString(ratingItem3));
					}	
					}else if(ratingItem.equalsIgnoreCase(items[4])) {
					if(ratingItem4[0] == 0) {
					JOptionPane.showMessageDialog(null, "The Item does not have a rate.");
					}else {
					JOptionPane.showMessageDialog(null, "Item: " + items[4] + "\nRate: " + Arrays.toString(ratingItem4));
					}	
					}else {
					JOptionPane.showMessageDialog(null, "Please enter a valid item.");
					}
    		
    		break;
    	}
    		
    	
    	case 5:
    		
    	{	
    		//Process
    		myItem.computeAvg();
    		
    		
    		
    		//Display all average for all items
    		JOptionPane.showMessageDialog(null, "Item: " + items[0] + "\nAverage: " + avg[0] +
    											"\n" +
    											"\nItem: " + items[1] + "\nAverage: " + avg[1] +
    											"\n" +
    											"\nItem: " + items[2] + "\nAverage: " + avg[2] +
    											"\n" +
    											"\nItem: " + items[3] + "\nAverage: " + avg[3] +
    											"\n" +
    											"\nItem: " + items[4] + "\nAverage: " + avg[4]);
    		
    		break;
    	}
    	
    	case 6:
    	{	
    		//Process
    		myItem.computeMax();
    		
    		//Output
    		max = myItem.getMax();
    		
    		//Checks in which position of the average array the max average is and the display the item for this average
    		if(max == avg[0]) {
				JOptionPane.showMessageDialog(null, "The highest average rating: " + max + "\nItem: " + items[0]);
				}else if(max == avg[1]) {
					JOptionPane.showMessageDialog(null, "The highest average rating: " + max + "\nItem: " + items[1]);
				}else if(max == avg[2]) {
					JOptionPane.showMessageDialog(null, "The highest average rating: " + max + "\nItem: " + items[2]);
				}else if(max == avg[3]) {
					JOptionPane.showMessageDialog(null, "The highest average rating: " + max + "\nItem: " + items[3]);
				}else if (max == avg[4]) {
					JOptionPane.showMessageDialog(null, "The highest average rating: " + max + "\nItem: " + items[4]);
				}else {
					
				}
    			
    		break;
    	}
    	
    	case 7:
    	{
    		
    		break;
    	}
    	
    	default:
    	{
    		//Validate if the number entered weren't between 1 and 7
    		JOptionPane.showMessageDialog(null, "Incorrect number entered.");
    	}
		}
	
       }while(option != 7);  
		
	}//main
}//class
