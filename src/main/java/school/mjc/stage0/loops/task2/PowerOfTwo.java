package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            System.out.println(1);
            int i = 1;
            while (i <= power) {
                int temp = i;
                int result = 2;
                while (temp > 1) {
                    result *=2;
                    temp--;
                }
                System.out.println(result);
                i++;
            }
        }
    }
}
