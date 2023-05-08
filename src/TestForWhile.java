public class TestForWhile {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i <= 100; i++) {
            //偶数
            if ((i & 1) == 1){
                result += i;
            }
        }
        System.out.println(result);
        int index = 0;
        int s = 0;

        while (index<=100){
            if ((index & 1) == 1){
                s += index;
            }
            index++;
        }
        System.out.println(s);
    }

}
