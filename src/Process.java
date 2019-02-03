public class Process implements Comparable<Process>{
    private float arrivalTime;
    private int startQuanta;
    private float serviceTime;
    private int finishQuanta;
    private int priority;
    private char name;

    public float getArrivalTime(){
        return arrivalTime;
    }
    public int getStartQuanta(){
        return startQuanta;
    }
    public float getServiceTime(){
        return serviceTime;
    }
    public int getFinishQuanta(){
        return finishQuanta;
    }
    public int getPriority(){
        return priority;
    }
    public char getName(){
        return name;
    }

    public void setStartQuanta(int newStartQuanta){
        startQuanta = newStartQuanta;
    }
    public void setServiceTime(float newServeiceTime){
        serviceTime = newServeiceTime;
    }


    @Override
    public int compareTo(Process other){
        return Float.compare(arrivalTime, other.arrivalTime);

    }
}
