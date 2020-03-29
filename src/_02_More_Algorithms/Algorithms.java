package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i<eggs.size()-1;i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	public static int countPearls(List<Boolean> oysters) {
		for(int i = 0; i<oysters.size()-1;i++) {
			if(oysters.get(i)) {
				return i;
			}
		}
		return -1;
	}
		public static double findTallest(List<Double> peeps) {
			int tallest = 0;
			for(int i = 0; i<peeps.size()-1;i++) {
				if(peeps.get(i+1)>peeps.get(tallest)) {
					tallest = i+1;
				}
				
			}
			System.out.println(tallest);
			return peeps.get(tallest);
}
		public static String findLongestWord(List<String> words) {
			int longest = 0;
			for(int i = 0; i<words.size()-1;i++) {
				if(words.get(i+1).length()>words.get(longest).length()) {
					longest = i+1;
				}
			}
			return words.get(longest);
		}
		public static boolean containsSOS(List<String> message) {
			for(int i = 0;i< message.size(); i++) {
				if(message.get(i).equals(" ... --- ... ")) {					
					return true;
				}
			}	
			return false;
		}
		public static List<Double> sortScores(List<Double> results) {
			for(int j = 0;  j<results.size();j++) {
			for(int i = 0; i<results.size();i++) {
				if(results.get(i)>results.get(j)) {
					Double x = results.get(i);
					results.set(i, results.get(j)) ;
					results.set(j, x);
				}
			}
			}
			return results;
		}
		public static List<String> sortDNA(List<String> dna) {
			for(int j =0;j<dna.size();j++) {
				for(int i =0;i<dna.size();i++) {
					if(dna.get(i).length()>dna.get(j).length()) {
						String x = dna.get(i);
						dna.set(i, dna.get(j));
						dna.set(j, x);
						
					}
				}
			}
			
			return dna;
		}
		public static List<String> sortWords(List<String> words){
			for(int j = 0; j<words.size();j++) {
				for(int i = 0; i<words.size();i++) {
					if(words.get(i).compareTo(words.get(j))>0) {//first is greater
						String x = words.get(i);
						words.set(i, words.get(j));
						words.set(j, x);					
						}
					
				}
			}
			
			return words;
		}
		public static String multiply(int factor1, int factor2) {
			int j = factor1*factor2;
			String end = factor1+" x "+factor2+" = "+j;
			return end;
		}
		public static boolean isPrime(int number) {
			for(int i = 2;i<=number/2;i++) {
				if(number%i==0) {
					return false;
				}
			}
			return true;
		}
		public static boolean isSquare(int number) {
			if(number == 1) {
				return true;
			}
			for(int i = 1; i<=number/2;i++) {
				if(i*i == number) {
					return true;
				}
			}
			return false;
		}
		public static boolean isCube(int number) {
			if(number == 1) {
				return true;
			}
			for(int i = 1; i<=number/3;i++) {
				if(i*i*i == number) {
					return true;
				}
			}
			return false;
		}
}