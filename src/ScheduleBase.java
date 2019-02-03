public class ScheduleBase {

    private State curState = new State();


    public class State{
        private float turnaroundTime;
        private float waitingTime;
        private float responseTime;
        private int processCount;
        private int quanta;  // what's this quanta for?

        public double getAvgTurnaroundTime(){
            return turnaroundTime / (double)processCount;
        }

        public double getAvgWaitingTime(){
            return waitingTime / (double) processCount;
        }

        public double getAvgResponseTime(){
            return responseTime / (double) processCount;
        }

        public double getAvgThoughput(){
            return 100 * processCount / (double)quanta;
        }


        public void addWaitTime(float time){
            waitingTime += time;
        }

        public void addResponseTime(float time){
            responseTime += time;
        }

        public void addTurnaroundTime(float time){
            turnaroundTime += time;
        }


    }
}
