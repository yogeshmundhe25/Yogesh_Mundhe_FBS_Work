class Time {

    int hr;
    int min;
    int sec;

    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    // Add two Time objects
    Time add(Time t) {

        int totalSec = this.sec + t.sec;
        int carryMin = totalSec / 60;
        int seconds = totalSec % 60;

        int totalMin = this.min + t.min + carryMin;
        int carryHour = totalMin / 60;
        int minutes = totalMin % 60;

        int hours = (this.hr + t.hr + carryHour) % 24;

        return new Time(hours, minutes, seconds);
    }

    // Add integer as Hours
    Time add(int hours) {

        int newHours = (this.hr + hours) % 24;

        return new Time(newHours, this.min, this.sec);
    }

    // Add integer as Minutes
    Time add(double minutes) {

        int totalMinutes = this.min + (int) minutes;

        int carryHour = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        int newHours = (this.hr + carryHour) % 24;

        return new Time(newHours, newMinutes, this.sec);
    }

    // Add integer as Seconds
    Time add(long seconds) {

        int totalSeconds = this.sec + (int) seconds;

        int carryMin = totalSeconds / 60;
        int newSeconds = totalSeconds % 60;

        int totalMinutes = this.min + carryMin;

        int carryHour = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        int newHours = (this.hr + carryHour) % 24;

        return new Time(newHours, newMinutes, newSeconds);
    }

    void display() {
        System.out.printf("%02d:%02d:%02d%n", hr, min, sec);
    }
}

public class TimeDemo {
    public static void main(String[] args) {

        Time t1 = new Time(10, 30, 40);
        Time t2 = new Time(5, 40, 30);

        // Add two Time objects
        Time result1 = t1.add(t2);

        System.out.print("Time + Time: ");
        result1.display();

        // Add hours
        Time result2 = t1.add(3);

        System.out.print("Time + Hours: ");
        result2.display();

        // Add minutes
        Time result3 = t1.add(45.0);

        System.out.print("Time + Minutes: ");
        result3.display();

        // Add seconds
        Time result4 = t1.add(90L);

        System.out.print("Time + Seconds: ");
        result4.display();
    }
}