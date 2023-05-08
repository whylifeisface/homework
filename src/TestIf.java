import java.util.Scanner;

public class TestIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        System.out.println(s);
        if (s.contains("dog")){
            System.out.println("you are forbidden!");
        }else{
            System.out.println("PASS");
        }
    }



}
