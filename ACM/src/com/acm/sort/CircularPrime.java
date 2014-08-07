package com.acm.sort;


public class CircularPrime {

static int number = 1000000;
//static int number = 100;
	
static boolean[] notPrimes = new boolean[number + 1];
	
	
	
	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		//Using Sieve of Eratosthenes to find all prime numbers 
		//but saving n operations by not initializing the array of primes with true
		//Instead used the default values of boolean.
	        for (int i = 2; i*i <= number; i++) {
	        	if (!notPrimes[i]) {
	                for (int j = i; i*j <= number; j++) {
	                    notPrimes[i*j] = true;
	                }
	            }
	        }
	        
	        
	        
 
	        
	        int circularPrimes = 1; // consider one and only even prime number "2" by default
	        System.out.println(2);
	        for (int i = 2; i <= number; i++) {
	            if (!notPrimes[i] ){
	            		if((i+"").matches("[1379]+") && isCircularPrime(i) || i==5 /*spl case*/)
	            			circularPrimes++;
	            }
	        }
	        System.out.println("The number of Circular primes below " + number + " are " + circularPrimes);
	        long end = System.currentTimeMillis();
	        System.out.println("total time -->"+(end-start)+" milli sec");
	}
	
	private static boolean isCircularPrime(int num) {
		
		String str = num+"";
		int len = str.length();
		for(int i=0;i<len;i++){
			if(notPrimes[Integer.parseInt(str.substring(i)+str.substring(0,i))]){
				return false;
			}
		}
		System.out.println(str);
		return true;
	}
	
	
}
