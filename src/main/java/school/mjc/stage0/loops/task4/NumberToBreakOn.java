package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public static void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        int counter = 1;
        if(numberToGoUntil < toBreakWith) {
            System.out.println("iterating till the end");
            do {
                System.out.println(counter);
                counter++;
            } while(counter <= numberToGoUntil);
        } else {
            do {
                System.out.println(counter);
                counter++;
            } while(counter <= toBreakWith);
        }
    }

    public static void main(String[] args) {
        printNumbersUntilWithBreakOn(6, 5);
    }
}
