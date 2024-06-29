package Giris;

import java.util.Arrays;

public class DizilerdeFrekans {

        


	public static void main(String[] args) {
		 int[] arr = {10, 20, 20, 10, 10, 20, 5,20};
		 int sayac=1;
		 System.out.println("----------------------------------");
		 System.out.println("Dizi:"+Arrays.toString(arr));
		 System.out.println("Tekrar eden sayılar:");
		 
	       Arrays.sort(arr);
	      
	       
	       for(int i=0; i<arr.length; i++) {
	    	   if(i==0 ) {
	    		   for(int j=0; j<arr.length; j++) {
	    			   if(i!=j && arr[i]==arr[j]) {
	    				   sayac++;
	    			   }
	    			   
	    		   } 
	    		   System.out.println(arr[i]+" sayısı " + sayac+" kere tekrar etmiştir.");
	    	   }
	    	   else if(arr[i]!=arr[i-1]) {
	    		   for(int j=0; j<arr.length; j++) {
	    			   if(i!=j && arr[i]==arr[j]) {
	    				   sayac++;
	    			   }
	    		   }
	    		   System.out.println(arr[i]+" sayısı " + sayac+" kere tekrar etmiştir.");
	    	   }
	    	   sayac=1;
	       }
		 
		 
		 
		 
		 
		 
	}

}
