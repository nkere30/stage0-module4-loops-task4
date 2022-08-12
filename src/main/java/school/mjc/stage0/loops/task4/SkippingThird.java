package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public static void printUntilButThird(int lastPrinted) {
        for(int i = 1; i <= lastPrinted; i++) {
            if(i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printUntilButThird(10);

    }
}
