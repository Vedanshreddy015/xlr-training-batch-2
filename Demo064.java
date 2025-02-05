public class Demo064{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("first element is:" + arr[0]);
        System.out.println("second element is:" + arr[1]);
        String a = null;
        var temp = a;
        String b = null;
        a = b;
        b = temp;
        method(a);
    }

    private static void method(String a) {
        String[] arr = null;
        String b = null;
        System.out.println("After swapping first element is:" + b);
        System.out.println("After swapping last element is:" + a);
    }
    
}