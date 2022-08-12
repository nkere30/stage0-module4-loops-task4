package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public static void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int counter = 0;
        int skippedSum = 0;
        int countedSum = 0;
        do {
            if(counter != numberToSkip) {
                countedSum +=counter;
            } else {
                skippedSum = countedSum + numberToSkip;
                countedSum = 0;
            }
            counter++;
        } while(counter <= lastInRow);

        if(lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if(numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else {
            System.out.println("skipped sum is number " + skippedSum);
            System.out.println("counted sum is number " + countedSum);
        }
    }

    public static void main(String[] args) {
        printSumOfTwoRanges(5, 10);
        printSumOfTwoRanges(15, 10);
        printSumOfTwoRanges(10, 10);
        printSumOfTwoRanges(-10, -1);
    }
}
