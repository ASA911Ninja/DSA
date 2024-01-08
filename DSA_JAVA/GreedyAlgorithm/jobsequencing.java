package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
public class jobsequencing {
    public static void main(String[] args) {
        int Jobsinfo [][] = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i=0;i<Jobsinfo.length;i++){
            jobs.add(new Job(i,Jobsinfo[i][0],Jobsinfo[i][1]));
        }
        
        Collections.sort(jobs, (a,b) -> (b.profit-a.profit)); // descending order, for ascending order do a-b

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i=0;i<Jobsinfo.length;i++){
            Job curr = jobs.get(i);
            if (curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Max Jobs are "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }

}
class Job {
    int id;
    int deadline;
    int profit;
    Job(int id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
