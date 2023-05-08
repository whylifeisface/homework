import java.util.Scanner;

public class TestParseException {

    public static void main(String[] args) {
        int[] a = new int[5];
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        while (index <5){
            String s = scanner.next();
            try {
                a[index] = Integer.parseInt(s);
                index++;
            }catch (Exception e){
                System.out.println("enter int");
            }
        }
        scanner.close();
        try {
            for (int j : a) {
                System.out.println(j);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" only read a.4 ");
        }finally {
            System.out.println("end");
        }
    }

}
