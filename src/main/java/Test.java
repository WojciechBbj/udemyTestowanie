public class Test {

    public static void main(String[] args) {
        testCalcAdd();
    }

    private static void testCalcAdd() {
        Calc calc = new Calc();
        int result = calc.sum(3,2);

        if (result != 5) {
            throw new IllegalStateException("Wrong result, 3+2 in not 5");
        } else {
            System.out.println("Ok");
        }
    }
 }
