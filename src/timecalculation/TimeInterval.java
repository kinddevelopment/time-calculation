/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecalculation;

/**
 *
 * @author markus
 */
public class TimeInterval {
    private TimeStamp startTime;
    private TimeStamp endTime;
    
    public TimeInterval(TimeStamp start, TimeStamp end) {
        startTime = start;
        endTime = end;
    }
    
    public TimeInterval() {
        startTime = new TimeStamp(0, 0);
        endTime = new TimeStamp(0, 0);
    }
    
    public void print() {
        TimeStamp totalTime = TimeStamp.createFromNumberOfMinutesSinceMidnight(getTotalNumberOfMinutes());
        totalTime.print();
    }
    
    public static TimeInterval add(TimeInterval first, TimeInterval second) {
        int sumOfMinutes = first.getTotalNumberOfMinutes() + second.getTotalNumberOfMinutes();
        return new TimeInterval(new TimeStamp(0, 0), TimeStamp.createFromNumberOfMinutesSinceMidnight(sumOfMinutes));
    }
    
    public TimeInterval add(TimeInterval second) {
        return TimeInterval.add(this, second);
    }
    
    private int getTotalNumberOfMinutes() {
        return endTime.getTotalNumberOfMinutesSinceMidnight() - startTime.getTotalNumberOfMinutesSinceMidnight();
    }
}
