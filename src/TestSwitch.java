import java.util.Scanner;

public class TestSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
//        原批s
        switch (s) {
            case "January" -> System.out.println("1 month");
            case "February" -> System.out.println("2 month");
            case "March" -> System.out.println("3 month");
            case "April" -> System.out.println("4 month");
            case "May" -> System.out.println("5 month ");
            case "June" -> System.out.println("6 month ");
            case "July" -> System.out.println("7 month ");
            case "August" -> System.out.println("8 month ");
            case "September" -> System.out.println("9  month");
            case "October" -> System.out.println("10 month ");
            case "November" -> System.out.println("11 month ");
            case "December" -> System.out.println("12 month ");
        }
    }
}
