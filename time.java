
class Time

{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public int getSecond()
    {
        return second;
    }

    public void setHour(int hour)
    {
        this.hour = hour;
    }

    public void setMinute(int minute)
    {
        this.minute = minute;
    }

    public void setSecond(int second)
    {
        this.second = second;
    }

}

public class TimeTest
{
    public static void main(String[] args)
    {
        Time time = new Time(12, 34, 56);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
    }
}

