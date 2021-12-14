package lesson4;


public class Tester {


    public static void main(String[] args) {


        Month month = Month.JANUARY;
        switch (month) {
            case JANUARY:
            case FEBRUARY:
            case DECEMBER:
                System.out.println("it's month " + Season.WINTER);
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("this is month " + Season.SPRING);
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("this is month " + Season.SUMMER);
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("this is month" + Season.AUTUMN);
                break;
            default:
                System.out.println("input is not correct");
        }
        User user1 = new User("Vadim", "Savelev", 30, Gender.MAN, "Moscow", "RF");

        Cat cat1 = new Cat("barsik", 10);

    }
}


