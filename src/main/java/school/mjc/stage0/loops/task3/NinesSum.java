package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int num = 9;
        int i = 1;
        while (i <= lengthOfLastNumber) {
            sum += num;
            num = num * 10 + 9;
            i++;
        }
        System.out.println(sum);
    }
}
