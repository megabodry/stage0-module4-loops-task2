package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 3;
        if (printToInclusive >= 2) {
            System.out.println(2);
            while (i <= printToInclusive) {
                int temp = 2;
                boolean result = true;
                while (temp < i) {
                    if (i % temp == 0) {
                        result = false;
                        break;
                    }
                    temp++;
                }
                if (result) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
