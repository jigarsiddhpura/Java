public class MethodOverloadDemo {
    void sum(int a, int b) {
        int sums = a + b;
        System.out.println("sum of 2 integers: " + sums);
    }

    void sum(float a, float b) {
        float sums = a + b;
        System.out.printf("sum of 2 integers:  " + sums);
    }

    public static void main(String args[]) {
        MethodOverloadDemo obj = new MethodOverloadDemo();
        obj.sum(20, 25);
        obj.sum(15.1111111111f, 20.11111111111111f);
    }
}
