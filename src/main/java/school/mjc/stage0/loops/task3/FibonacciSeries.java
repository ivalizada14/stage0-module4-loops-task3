package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int previous = 1, current = 1;
        for(int i = 1; i <= lastFibonacci; i++)
        {
            System.out.println(current);
            current+=previous;
            previous = current;
        }
    }
}
