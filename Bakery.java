import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 * @author: Nathiélle Nascimento
 * @date: 07/04/2021
 * Bakery.java
 * Continuous Assessment - Software Development
 * National College of Ireland - Higher Diploma in Computing Science 
 */


public class Bakery {
	
			//Declare private variables
			private int MAX_NUM_RATINGS,  MAX_NUM_ITEMS, option, index;
			private String  items[], ratingItem;
			private int ratingItem0[], ratingItem1[], ratingItem2[], ratingItem3[], ratingItem4[];
			private double avg[], sum[], max;
		
			

			//Constructor
			public Bakery(){
				option = 0;
				ratingItem = "";
				MAX_NUM_RATINGS = 3;
				MAX_NUM_ITEMS = 5;
				items = new String[MAX_NUM_ITEMS];
				ratingItem0 = new int[MAX_NUM_RATINGS];
				ratingItem1 = new int[MAX_NUM_RATINGS];
				ratingItem2 = new int[MAX_NUM_RATINGS];
				ratingItem3 = new int[MAX_NUM_RATINGS];
				ratingItem4 = new int[MAX_NUM_RATINGS];
				sum = new double [MAX_NUM_ITEMS];
				avg = new double [MAX_NUM_ITEMS];
				max = 0.0;
				
			}

			//Compute method
			public void computeInputItems(){
				//Search all the items array
        		for(int i = 0; i< items.length; i++ ){
        			//Add new items into the arrays
        			items[i] = JOptionPane.showInputDialog(null, "Please insert item name:");
        			//Validate if the value is not empty
        			while (items[i].isEmpty()) {
        				JOptionPane.showMessageDialog(null, "Cannot accept empty strings.");
        				items[i] = JOptionPane.showInputDialog(null, "Please insert item name:");
        			}
        			//Message to the user to know when he added the maximum number of items 
        			if (i == items.length - 1){
        				JOptionPane.showMessageDialog(null, "You alredy added the maximum of "+ MAX_NUM_ITEMS + " items.");
        				
        			}
        			
        		}
			}
				
        		public void computeInputRatings(){
        			//Show all the items from the array and ask to choose one to add a rating
	        		ratingItem = JOptionPane.showInputDialog(null, "Please enter the name of the item that you want to rate:" +
	        																	"\n- " + items[0] + 
	        																	"\n- " + items[1] +
	        																	"\n- " + items[2] +
	        																	"\n- " + items[3] +
	        																	"\n- " + items[4]);
	        		
	        			//Check if the item select is in the position 0 of the items array
	    				if(ratingItem.equalsIgnoreCase(items[0])) {
	    					//If yes, then will input the rating in the position 0 of the ratings array
	    					for(int j = 0; j < ratingItem0.length; j++) {
	    					ratingItem0[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a rate between 1 and 5 (1 for lowest rating and 5 for highest) for the item: "));
	    						//Validate if the value entered was between 1 and 5 and if was 0
		    					while (ratingItem0[j] > 5 || ratingItem0[j] == 0) {
			        				JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 5.");
			        				ratingItem0[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a rate between 1 and 5 (1 for lowest rating and 5 for highest) for the item: "));
			        			}
		    					//Message to the user to know when they added the maximum number of rating for an item
		    					if (j == ratingItem0.length - 1){
	    	        				JOptionPane.showMessageDialog(null, "You alredy added the maximum of "+ MAX_NUM_RATINGS + " ratings.");
	    	        				
	    	        			}
	    			
	    					}
	    				//Check if the item select is in the position 1 of the items array
	    				} else if(ratingItem.equalsIgnoreCase(items[1])) {
	    					//If yes, then will input the rating in the position 1 of the ratings array
	    					for(int j = 0; j < ratingItem1.length; j++) {
	    					ratingItem1[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a rate between 1 and 5 (1 for lowest rating and 5 for highest) for the item: "));
	    						//Validate if the value entered was between 1 and 5 and if was 0
		    					while (ratingItem1[j] > 5 || ratingItem1[j] == 0) {
			        				JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 5.");
			        				ratingItem1[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a rate between 1 and 5 (1 for lowest rating and 5 for highest) for the item: "));
			        			}
		    					//Message to the user to know when they added the maximum number of rating for an item
	        					if (j == ratingItem1.length - 1){
	    	        				JOptionPane.showMessageDialog(null, "You alredy added the maximum of "+ MAX_NUM_RATINGS + " ratings.");
	    	        				
	    	        			}
	    					}
	    				//Check if the item select is in the position 2 of the items array
	    				}else if(ratingItem.equalsIgnoreCase(items[2])) {
	    					//If yes, then will input the rating in the position 2 of the ratings array
	    					for(int j = 0; j < ratingItem2.length; j++) {
	    					ratingItem2[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a rate between 1 and 5 (1 for lowest rating and 5 for highest) for the item: "));
	    						//Validate if the value entered was between 1 and 5 and if was 0
		    					while (ratingItem2[j] > 5 || ratingItem2[j] == 0) {
			        				JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 5.");
			        				ratingItem2[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a rate between 1 and 5 (1 for lowest rating and 5 for highest) for the item: "));
			        			}
		    					//Message to the user to know when they added the maximum number of rating for an item
	        					if (j == ratingItem2.length - 1){
	    	        				JOptionPane.showMessageDialog(null, "You alredy added the maximum of "+ MAX_NUM_RATINGS + " ratings.");
	    	        				
	    	        			}
	    					}
	    				//Check if the item select is in the position 3 of the items array
	    				}else if(ratingItem.equalsIgnoreCase(items[3])) {
	    					//If yes, then will input the rating in the position 3 of the ratings array
	    					for(int j = 0; j < ratingItem3.length; j++) {
	    					ratingItem3[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a rate between 1 and 5 (1 for lowest rating and 5 for highest) for the item: "));
	    						//Validate if the value entered was between 1 and 5 and if was 0
		    					while (ratingItem3[j] > 5 || ratingItem3[j] == 0) {
			        				JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 5.");
			        				ratingItem3[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a rate between 1 and 5 (1 for lowest rating and 5 for highest) for the item: "));
			        			}
		    					//Message to the user to know when they added the maximum number of rating for an item
	        					if (j == ratingItem3.length - 1){
	    	        				JOptionPane.showMessageDialog(null, "You alredy added the maximum of "+ MAX_NUM_RATINGS + " ratings.");
	    	        				
	    	        			}
	    					}
	    				//Check if the item select is in the position 4 of the items array
	    				}else if(ratingItem.equalsIgnoreCase(items[4])) {
	    					//If yes, then will input the rating in the position 4 of the ratings array
	    					for(int j = 0; j < ratingItem4.length; j++) {
	    					ratingItem4[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a rate between 1 and 5 (1 for lowest rating and 5 for highest) for the item: "));
	    					//Validate if the value entered was between 1 and 5 and if was 0
		    					while (ratingItem4[j] > 5 || ratingItem4[j] == 0) {
			        				JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 5.");
			        				ratingItem4[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a rate between 1 and 5 (1 for lowest rating and 5 for highest) for the item: "));
			        			}
		    					//Message to the user to know when they added the maximum number of rating for an item
	        					if (j == ratingItem4.length - 1){
	    	        				JOptionPane.showMessageDialog(null, "You alredy added the maximum of "+ MAX_NUM_RATINGS + " ratings.");
	    	        				
	    	        			}
	    					}
	    				//Validate if the value entered was valid.	
	    				}else {
	    					JOptionPane.showMessageDialog(null, "Please enter a valid item.");
	    				}
	    		
        		
        		}
        		
        		
        		public void computeAvg(){
        			for(int i = 0; i< ratingItem0.length; i++ ){
		        			sum[0] = sum[0]+ratingItem0[i];
		        	}
		        		avg[0] = (Math.round((sum[0] /ratingItem0.length) * 100.0)) /100.0;
		        		
		        		
	        		for(int i = 0; i< ratingItem1.length; i++ ){
	        			sum[1] = sum[1]+ratingItem1[i];
	        		}
		        		avg[1] = (Math.round((sum[1] /ratingItem1.length) * 100.0)) /100.0;	
        		
	        		for(int i = 0; i< ratingItem2.length; i++ ){
	        			sum[2] = sum[2]+ratingItem2[i];
	        		}
		        		avg[2] = (Math.round((sum[2] /ratingItem2.length) * 100.0)) /100.0;	
		        		
		        		
	        		for(int i = 0; i< ratingItem3.length; i++ ){
	        			sum[3] = sum[3]+ratingItem3[i];
	        		}
		        		avg[3] = (Math.round((sum[3] /ratingItem3.length) * 100.0)) /100.0;
		        		
	        		for(int i = 0; i< ratingItem4.length; i++ ){
	        			sum[4] = sum[4]+ratingItem4[i];
	        		}
		        		avg[4] = (Math.round((sum[4] /ratingItem4.length) * 100.0)) /100.0;	
					
	        	}
				
        		public void computeMax(){
        			//Search the array of average for the highest average
	        		max = avg[0];
	        		for(int i=0; i < avg.length; i++) {
	        			if(max < avg[i]) {
	    					max = avg[i];
	        			
        				}
	        		}	
        		}	
	        		
	        	
			

			//Getters and Setters
			public void setOption(int option){
				this.option = option;
			}

			public String [] getItems(){
				return items;
			}
			
			public int [] getRatingItem0(){
				return ratingItem0;
			}
			
			public int [] getRatingItem1(){
				return ratingItem1;
			}
			
			public int [] getRatingItem2(){
				return ratingItem2;
			}
			
			public int [] getRatingItem3(){
				return ratingItem3;
			}
			
			public int [] getRatingItem4(){
				return ratingItem4;
			}
			
			public double [] getAvg(){
				return avg;
			}
			
			public double [] getSum(){
				return sum;
			}
			
			public double getMax(){
				return max;
			}
}
