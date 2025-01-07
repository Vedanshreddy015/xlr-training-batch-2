public class demo014 {
    public static void main(String[] args) {
        int a = 5;
        int b = -10;
        boolean flag = true;

        int positiveA = +a;
        System.out.println("Unary plus: +" + a + " = " + positiveA);

        int negativeA = -a;
        System.out.println("Unary minus: -" + a + " = " + negativeA);

        System.out.println("Original value of a: " + a);
        a++;
        System.out.println("After increment: a++ = " + a);

        System.out.println("Original value of b: " + b);
        b--;
        System.out.println("After decrement: b-- = " + b);

        System.out.println("Original value of flag: " + flag);
        boolean notFlag = !flag;
        System.out.println("Logical NOT: !flag = " + notFlag);}
}