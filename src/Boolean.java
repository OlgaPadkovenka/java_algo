public class Boolean {

    static void boolean1(int a) {
        System.out.println(a > 0);
    }

    static void boolean2(int a) {
        System.out.println(a % 2 == 0);
    }

    static void boolean3(int a) {
        System.out.println(a % 2 != 0);
    }

    static void boolean4(int a) {
        System.out.println(a % 10 == 4 || a % 10 == 7);
    }

    static void boolean5(int a) {
        System.out.println(a % 2 == 0 && a % 10 != 4);
    }

    static void boolean6(int a, int b) {
        System.out.println( a > 0 && b > 0);
    }


    static void boolean7(int a, int b) {
        System.out.println( a > 0 || b > 0);
    }



    static void boolean8(int a, int b) {
        //System.out.println( (a > 0 && b < 0) || (a < 0 && b > 0) );
        System.out.println(a * b < 0);
    }

    public static void main(String[] args) {
        boolean8(5, -6);
        boolean8(-5, 6);
        boolean8(5, 6);
        boolean8(-5, -6);
        boolean8(5, 0);

        //boolean7(5, 6);
        //boolean7(0, 3);
        //boolean7(-1, -2);

        //boolean6(5, 6);
        //boolean6(0, 3);
        //boolean6(-1, -2);

        //boolean5(14);
        //boolean5(57);
        //boolean5(42);

        //boolean4(4);
        //boolean4(57);
        //boolean4(75);

        //boolean3(5);
        //boolean3(0);
        //boolean3(6);

        //boolean2(5);
        //boolean2(0);
        //boolean2(6);

        //boolean1(5);
        //boolean1(0);
        //boolean1(-4);
    }
}
