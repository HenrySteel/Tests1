public class Tests1 {
    public static void main(String args[]) {
        System.out.println(tests7(2, 4));
    }

    public static int tests(int a, int b) {
        int sum = a;

        for (int i = a; i <= b; i++) {
            sum += i;
            sum++;
        }
        return sum;
    }

    public static int tests2(int a, int b) {
        int result = a + b;
        if (result % 2 == 0) {
            result = a + b;
        } else {
            result = 0;
        }
        return result;
    }

    public static int tests3(int a, int b) {
        int result = a + b;
        if (result > 10 && result < 40) {
            result = a + b;
        } else {
            result = 0;
        }
        return result;
    }

    public static int tests4(int a, int b) {
        int result = a + b;
        if (result != 13) {
            result = 0;
        }
        return result;
    }

    public static int tests5(int a, int b) {
        int result = a + b;
        if (b % 2 != 0) {
            result = (a + b) * 2;
        } else {
            result = a + b;
        }
        return result;
    }

    public static int tests6(int a, int b) {
        int sum = 0; // есть вопрос
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int tests7(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            System.out.println(i);
            sum +=i;
        }
        return sum;
    }
}





