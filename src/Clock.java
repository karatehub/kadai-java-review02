
public class Clock {

    public static void main(String[] args) {
        System.out.println(getSeconds(1,43,34));
    }    
    public static int getSeconds(int hours, int minutes, int seconds) {
        int hours_seconds = 3600 * hours;
        int minutes_seconds = 60 * minutes;
        int sum_seconds = hours_seconds + minutes_seconds + seconds;
        return sum_seconds;
    

    }

}
