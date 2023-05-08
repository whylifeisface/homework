public class TestArray {


    public static void main(String[] args) {
        int[] b = {1,2,3,4};
        int result = 0;
        for (int a : b) {
            result += a;
            System.out.println("foreach "+a);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("for "+b[i]);
        }
        System.out.println("result " + result);
    }
}
