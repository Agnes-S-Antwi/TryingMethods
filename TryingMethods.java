/**
 * TryingMethods
 */
public class TryingMethods {

    public static void main(String[] args) {

        TryingMethods dayObject = new TryingMethods();
        String myDay = dayObject.daysOfTheWeek(4);
        System.out.println(dayObject.daysOfTheWeek(1) + myDay);

        TryingMethods weatherFinder = new TryingMethods();
        weatherFinder.season("winter");
    }

    public String daysOfTheWeek(int day) {
        String nameOfDay = "";
        switch (day) {
            case 1:
                nameOfDay = "Sunday";
                break;
            case 2:
                nameOfDay = "Monday";
                break;
            case 3:
                nameOfDay = "Tuesday";
                break;
            case 4:
                nameOfDay = "Wednesday";
                break;
            case 5:
                nameOfDay = "Thursday";
                break;
            case 6:
                nameOfDay = "Friday";
                break;
            case 7:
                nameOfDay = "Saturday";
                break;
            default:
                break;
        }
        return nameOfDay;
    }

    public void season(String weather) {
        if (weather == "winter") {
            System.out.println("Snowy");
        } else if (weather == "autumn") {
            System.out.println("Windy");
        } else if (weather == "harmattan") {
            System.out.println("Dry");
        } else {
            System.out.println("Enter a different weather condition");
        }
    }
}