package screenmatch.runningtimecalculator;

import screenmatch.models.Entertainment;

public class Calculator {
    private int totalRunnigTime;

    public int getTotalRunningTime(){
        return totalRunnigTime;
    }

    public void add(Entertainment e){
        totalRunnigTime =+ e.getRunningTimeInMinutes();
    }
}
