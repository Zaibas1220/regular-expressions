
public class Main {
    public static void main(String[] args) {
        System.out.println(clockTime("17:23:05"));
        System.out.println(clockTime("33:33:33"));
        System.out.println(clockTime("a:b:c"));
        System.out.println(clockTime("1:23:33"));
    }

    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public static boolean allVowels(String string) {
        return string.matches("(a|e|i|o|u|y)");
    }

    public static boolean clockTime(String string) {
        boolean formatCheck = string.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}");
        if (!formatCheck) {
            return false;
        }
        String[] clockTimes = string.split(":");
        int hours = Integer.parseInt(clockTimes[0]);
        int minutes = Integer.parseInt(clockTimes[1]);
        int seconds = Integer.parseInt(clockTimes[2]);

        return (hours < 24 && hours >= 0) &&
                (minutes <= 60 && minutes >= 0) &&
                (seconds <= 60 && seconds >= 0);
    }
}
