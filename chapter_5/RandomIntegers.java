public class RandomIntegers {

    public static void main(String[] args) {

        int normal = (int)(Math.random() * ((2 - 1) + 1) + 1);
        int num1 = (int)(Math.random() * ((100 - 1) + 1) + 1);
        int num2 = (int)(Math.random() * ((9 - 0) + 1) + 0);
        int num3 = (int)(Math.random() * ((1112 - 1000) + 1) + 1000);
        int num4 = (int)(Math.random() * ((1 - (-1)) + 1) + (-1));
        int num5 = (int)(Math.random() * ((11 - (-3)) + 1) + (-3));

        System.out.println(normal);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
    }
}
