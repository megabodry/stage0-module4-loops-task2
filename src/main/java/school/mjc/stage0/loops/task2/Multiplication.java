package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int temp = multiplyByAndToInclusive;
        if (multiplyByAndToInclusive != 0) {
            int i = 0;
            while (i != multiplyByAndToInclusive + 1 && i != (multiplyByAndToInclusive - 1) * -1) {
                System.out.println(temp * i);
                i++;
            }
        }
    }
}
