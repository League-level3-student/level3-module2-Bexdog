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
}