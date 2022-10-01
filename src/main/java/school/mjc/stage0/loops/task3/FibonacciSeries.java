package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int previous = 0, current = 1;
        System.out.println(0);
        for(int i =1; i < lastFibonacci; i++)
        {
            System.out.println(current);
            int x = current;
            current+=previous;
            previous = x;
        }
    }
}
