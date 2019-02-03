import java.util.PriorityQueue;
import java.util.Random;

public class ProcessGenerator {
    public static PriorityQueue<Process> generateProcess(int seed, int processNum){

        PriorityQueue<Process> pq = new PriorityQueue<>();
        String str= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        Random rand = new Random(seed);
        int arrivalRange = 99;
        int serviceRange = 10;
        int priorityRange = 5;

        for(int i = 0; i < processNum; i++){
            Float arrivalTime = rand.nextFloat() * arrivalRange;  // nextFloat() [0,1)
            Float serviceTime = rand.nextFloat() * serviceRange;
            int priority = rand.nextInt(priorityRange);           //nextInt() [0,n)
            char name = str.charAt(i);

            if(serviceTime == 0) serviceTime +=1;

            pq.offer(new Process(name, arrivalTime, serviceTime, priority));

        }

        return pq;

    }

}
