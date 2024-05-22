public enum Day {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    Day(int level) {
        excitement = level;
    }

    private int excitement;

    public int getExcitement() {
        return excitement;
    }
}

public class EnumTest2 {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + " excitement level: " + day.getExcitement());
        }
    }
}