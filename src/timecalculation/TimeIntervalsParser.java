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
public class TimeIntervalsParser {
    ArrayList<TimeInterval> intervals;
    
    public TimeIntervalsParser(String[] times) {
        intervals = new ArrayList<>();
        parseIntervals(times);
    }
    
    public TimeIntervalsParser() {
        intervals = new ArrayList<>();
    }
    
    public ArrayList<TimeInterval> getIntervals() {
        return intervals;
    }
    
    private void parseIntervals(String[] times) {
        intervals.add(new TimeInterval(new TimeStamp(13, 0), new TimeStamp(14, 15)));
        intervals.add(new TimeInterval(new TimeStamp(8, 14), new TimeStamp(12, 20)));
    }
}
