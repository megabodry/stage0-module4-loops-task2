package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive == 0) {
            System.out.println(1);
        } else {
            System.out.println(1);
            int i = 1;
            while (i <= printToInclusive) {
                int temp = i;
                int result = 1;
                while (temp != 0) {
                    result *= temp;
                    temp--;
                }
                System.out.println(result);
                i++;
            }
        }
    }
}
