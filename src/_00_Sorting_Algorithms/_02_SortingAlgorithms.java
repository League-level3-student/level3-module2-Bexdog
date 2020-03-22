package _00_Sorting_Algorithms;

import javax.swing.JOptionPane;

/*
 * INSTRUCTIONS
 * Run the demo VisualSorter.jar to see the finished product. 
 * Then complete the steps in the classes in the following order:
 * 
 * BubbleSorter
 * SelectionSorter
 * InsertionSorter
 * QuickSorter
 * MergeSorter
 * HeapSorter
 * BogoSorter
 */

public class _02_SortingAlgorithms {
	public static void main(String[] args) {
		String[] options = new String[] {"Bogo", "Heap", "Merge", "Quick","Insertion","Selection", "Bubble"};
		int input = JOptionPane.showOptionDialog(null, "Choose a sorting algorithm to visualize", "Sorting Algorithms", 0, 
				-1, null, options, 0);
		
		String choice = options[input];
		
		switch(choice) {
		case "Bubble":{
			//done
			new SortingVisualizer(new BubbleSorter());
			break;
		}
		case "Selection":{
			//done
			new SortingVisualizer(new SelectionSorter());
			break;
		}
		case "Insertion":{
			//done
			new SortingVisualizer(new InsertionSorter());
			break;
		}
		case "Quick":{
			//done
			new SortingVisualizer(new QuickSorter());
			break;
		}
		case "Merge":{
			//there is an error I can't figure out why 
			new SortingVisualizer(new MergeSorter());
			break;
		}
		case "Heap":{
			//done
			new SortingVisualizer(new HeapSorter());
			break;
		}
		case "Bogo":{
			//done
			new SortingVisualizer(new BogoSorter());
			break;
		}
		}
	}
}
