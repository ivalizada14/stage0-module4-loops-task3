package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if(first==0)
        {
            System.out.println(second);
            return;
        }
        if(second==0)
        {
            System.out.println(first);
            return;
        }
        if(first>second)
        {
            for(int i = second; i>=1; i--)
                if(first%i==0&&second%i==0)
                {
                    System.out.println(i);
                    break;
                }
        }
        else
        {
            for(int i = first; i>=1; i--)
                if(first%i==0&&second%i==0)
                {
                    System.out.println(i);
                    break;
                }
        }
    }
}
