package GreedyAlgorithm;
// Given N activities with their start and finish day given in array start[] and end[]. 
// Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a given day.
// Note : Duration of the activity includes both starting and ending day.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activityselection {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // Sorting
        int activities[][] = new int[start.length][3];
        for (int i=0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Lambda Function (Comparators)
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); // This will sort the 2d array according to the end time array


        // end time basis sorted activities

        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i=1;i<end.length;i++){
            if (start[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max Activities ="+ maxAct);
        for (int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+"\t");
        }
        System.out.println();
        System.out.println(ans);
    }

}
