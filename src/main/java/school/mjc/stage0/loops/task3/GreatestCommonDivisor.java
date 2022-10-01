package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if(first>second)
        {
            for(int i = second; i<=1; i--)
                if(first%i==0&&second%i==0)
                {
                    System.out.println(i);
                    break;
                }
        }
        if(first<second)
        {
            for(int i = first; i<=1; i--)
                if(first%i==0&&second%i==0)
                {
                    System.out.println(i);
                    break;
                }
        }
    }
}
