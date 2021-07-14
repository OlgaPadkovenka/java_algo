public class Begin {

    static void begin1(int a) {
        System.out.println(4 * a);
    }

    static void begin2(int a) {
        System.out.println(a * a);
    }

    static void begin3(int a, int b) {
        System.out.println(a * b + " " + 2 * (a + b));
    }

    static void begin4(int a) {
        System.out.println(a * a * a + " " + 6 * (a * a));
    }

    static void begin5(int a, int b) {
        System.out.println((a + b) / 2.0);
        //System.out.println((double)(a + b) / 2.0);
        // 2 - int
        // 2L - long
        // 2.0 - double
        // 2.0f - float
    }

    static void begin6(int a, int b) {
        System.out.println(Math.sqrt(a * b));

    }

    static void begin7(int a, int b) {
        double c = Math.sqrt((a * a) + (b * b));
        System.out.println(c + " " + (a + b + c));
    }

    static void begin8(int x1, int x2) {

        System.out.println(Math.abs(x2 - x1));
    }

    static void begin9(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }

    static void begin10(int a, int b, int c) {
        int d = a;
        a = b;
        b = c;
        c = d;
        System.out.println(a + " " + b + " " + c);
    }

    static void begin11(int a) {
        a *= a;
        System.out.println(a);
        a *= a;
        System.out.println(a);
        a *= a;
        System.out.println(a);
        // Math.pow(a, 4);
        // Math.pow(a, 8);
    }

    static void begin12(double w1, double p1, double w2) {

        System.out.println(p1 / w1 + " " + w2 * (p1 / w1));
    }

    static void begin13(int r) {
        int prix = 10;
        System.out.println(r % prix);
    }

    static void begin14(int m) {
        int hour = m % 60;
        System.out.println(hour);
    }

    static void begin15(int d) {
        int days = d % 7; //7/7=0; 29/7=4, 1 - остаток
        System.out.println(days);
    }

    static void begin16(int d) {
        int daysFromTuesday = (d + 1) % 7;
        System.out.println(daysFromTuesday);
    }

    static void begin17(int d) {
        int daysFromSunday = d % 7;
        System.out.println(daysFromSunday);
    }

    static void begin18(int d) {
        int today = d % 7 + 1;
        System.out.println(today);
    }

    static void begin19(int a) {
        int a1 = a / 10;
        int a2 = a % 10;
        System.out.println(a1 + " " + a2);
    }

    static void begin20(int a) {
        int a1 = a / 10;
        int a2 = a % 10;
        System.out.println(a1 + a2 + " " + a1 * a2);
    }

    static void begin21(int a) {
        System.out.println(a % 2);
    }

    static void begin22(int a) {
        System.out.println(a % 2 + 1);
    }

    static void begin23(int a) {
        System.out.println(1 - a % 2);
    }

    static void begin24(int a) {
        System.out.println(2 - a % 2);
    }

    static void begin25(int n) {
        System.out.println((n - 1) % 3);
    }

    public static void main(String[] args) {

        begin25(1);
        begin25(3);
        begin25(5);
        begin25(10);

        //begin24(0);
        //begin24(1);
        //begin24(5);
        //begin24(10);

        //begin23(0);
        //begin23(1);
        //begin23(5);
        //begin23(10);

        //begin22(0);
        //begin22(1);
        //begin22(5);
        //begin22(10);

        //begin21(0);
        //begin21(1);
        //begin21(5);
        //begin21(10);

        //begin20(27);
        //begin20(55);

        //begin19(10);
        //begin19(91);

        //begin18(0);
        //begin18(6);
        //begin18(7);
        //begin18(29);

        //begin17(0);
        //begin17(3);
        //begin17(7);
        //begin17(29);

        //begin16(0);
        //begin16(3);
        //begin16(6);
        //begin16(29);

        //begin15(0);
        //begin15(6);
        //begin15(7);
        //begin15(29);

        //begin14(5);
        //begin14(59);
        //begin14(70);
        //begin14(180);

        //begin13(5);
        //begin13(27);
        //begin13(150);
        //begin13(199);

        //begin12(3, 300, 2);
        //begin12(1.5, 450, 0.5);

        //begin11(1);
        //begin11(2);
        //begin11(10);

        //begin10(1, 4, 7);
        //begin10(10, 15, 20);

        //begin9(1, 4);
        //begin9(10, 15);

        //begin8(1, 4);
        //begin8(1, -4);

        //begin7(3, 4);
        //begin7(5, 7);

        //begin6(2, 8);
        //begin6(0, 5);
        //begin6(7, 9);

        //begin5(5, 7);
        //begin5(2, -3);

        //begin4(5);
        //begin4(10);

        //begin3(5, 4);
        //begin3(10, 10);

        //begin2(1);
        //begin2(12);

//        begin1(1);
//        begin1(12);
    }
}
