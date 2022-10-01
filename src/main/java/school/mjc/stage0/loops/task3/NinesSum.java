package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for(int i = 1; i<=lengthOfLastNumber; i++)
        {
            int numberToBeAdded = 0;
            for(int n = 1; n<=i; n++)
            {
                numberToBeAdded += 9 * Math.pow(10, n);
            }
            sum += numberToBeAdded;
        }
        System.out.println(sum);
    }
}
