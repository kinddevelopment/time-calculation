/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecalculation;

import java.util.ArrayList;

/**
 *
 * @author markus
 */
public class TimeCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TimeIntervalsParser parser = new TimeIntervalsParser(args);
        ArrayList<TimeInterval> intervals = parser.getIntervals();
        System.out.println("Number of intervals: " + intervals.size());
        
        TimeInterval totalTime = new TimeInterval();
        
        for (TimeInterval intervalToAdd : intervals) {
            totalTime = totalTime.add(intervalToAdd);
            System.out.print("Interval: ");
            intervalToAdd.print();
        }
        
        //System.out.println("Total time: " + totalTime.print());
        
        
        
    }
}
