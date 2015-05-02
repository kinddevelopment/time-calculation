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
public class TimeStamp {
    private int hour = 0;
    private int minute = 0;
    
    public TimeStamp(int h, int m) {
        hour = h;
        minute = m;
    }
    
    public TimeStamp(String timeString) {
        
    }
    
    public int getTotalNumberOfMinutesSinceMidnight() {
        return hour * 60 + minute;
    }
    
    public void print()
    {
        String hourString = String.format("%02d", hour);
        String minuteString = String.format("%02d", minute);
        String hourDecimalString = String.format("%.2f", getTotalNumberOfMinutesSinceMidnight() / 60.0);
        
        System.out.println(hourString + ":" + minuteString + " (" + hourDecimalString + ")");
    }
    
    public static TimeStamp createFromNumberOfMinutesSinceMidnight(int minutesSinceMidnight) {
        return new TimeStamp(minutesSinceMidnight / 60, minutesSinceMidnight % 60);
    }
}
