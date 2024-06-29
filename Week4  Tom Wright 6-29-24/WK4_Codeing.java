package Week4;
import java.util.*;
import java.io.*;
import java.security.PublicKey;

public class WK4_Codeing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//question 1 
		int [] ages = {3,9,23,64,2,8,28,93};
		System.out.println (ages[(ages.length-1)] - ages[0]);
		
		
		int [] ages2 = {4,8,12,16,20,24,28,32,36};
		System.out.println (ages2[(ages2.length-1)] - ages2[0]);
		
		int avgage = 0;
		int sum = 0;
		for (int j = 0; j < ages.length; j++)
		{
			sum += ages[j];
		}
		avgage = sum/ages.length+1;
		System.out.println (avgage);
		//question 2
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		int sum2 = 0;
		for (int i = 0; i <= names.length-1; i++) {
			names[i].length();
			sum2 += names[i].length();
		}
        int averageCount = sum2/names.length;
        
		System.out.println (averageCount);
		
		
		String names2 = "";
		
        for (int k = 0; k < names.length; k++)
        {
         if (k == 0) 
         {
        	 names2 += names[k];
        
         }else {
        		names2 += (" " + names[k]);
        	   }
         }
         System.out.println(names2);
         int sum3 = 0;
         
         for (int m = 0; m <= names.length-1; m++) {
 			names[m].length();
 			sum3 += names[m].length();
 		}
 		System.out.println (sum3);
        
 		//question 7
 		System.out.println (selfConcat("WhiskeyTangoFoxtrot",5));
 		System.out.println (fullName("Tom","Wright"));
 		int[] numbers = {5,150,23,24};
 		System.out.println (sumNums(numbers));
 		double [] numbers1 = {1000,2000,3000};
 		System.out.println (averageDouble(numbers1));
 		double [] numbers3 = {100,200,300};
 		double [] numbers2 = {1000,2000,3000};
 		System.out.println (doublesum(numbers2,numbers3));
 		System.out.println (willBuyDrink (true, 9.50));
 		System.out.println (afterSixOclock (true, 45.14));
 		
 		//end main
 		}



//methods
	
	public static String selfConcat(String word, int num){
		String userword = word;
		for (int n = 1; n < num; n++) {
			userword += word;
		}
		return userword;
}
	public static String fullName(String firstName, String lastName){
		String full;
		full = firstName + " " + lastName;
		return full;
	}
	
	public static boolean sumNums(int numbers[]){
    int sum = 0;
    for (int o = 0; o < numbers.length; o++) sum += numbers[o];
	if (sum > 100) {
    return true;
	}else {
		return false;
	}
	}
	
	public static double averageDouble(double numbers1[]){
	    double sum = 0;
	    for (int i = 0; i < numbers1.length; i++) {
	    	sum += numbers1[i];
	}
		return sum/numbers1.length;
		}
	
	public static boolean doublesum(double numbers2[], double numbers3[]){
	    double sum2 = 0;
	    double sum3 = 0;
	    for (int i = 0; i < numbers2.length; i++) sum2 += numbers2[i];
	    for (int j = 0; j < numbers3.length; j++) sum3 += numbers3[j];
	    double avg2, avg3;
	    avg2 = sum2/numbers3.length;
	    avg3 = sum3/numbers3.length;
	    if (sum2 > avg3) {
	    return true;
		}else {
			return false;
		}
		}
	public static boolean willBuyDrink (boolean isItHotOutside, double moneyInPocket)
	{
		if (isItHotOutside && moneyInPocket >= 10.50) {	
			return true;
	}
	else 
	{
		return false;
	}
	}
	
		public static boolean afterSixOclock (boolean Aftersix, double cash)
		//This method is seeing if its after 6 Oclock and I have cash for a drink
		{
			if (Aftersix && cash >= 30.25) {	
				return true;
		}
		else 
		{
			return false;
		}
	
//end class
}
}
// video https://youtu.be/uezaGAXwvoI 
	
	