
import java.util.Scanner;


public class AvgEx {
    public static double Avg (double[] nums) throws ArrayIndexOutOfBoundsException{
        double totalAvg = 0;
        for (int i = 0; i < nums.length; i++) {
            totalAvg += nums[i];
        }
        totalAvg /= nums.length;
        
        return totalAvg;
    }
    
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("How many nums that you want to input?");
        //int numOfArray = input.nextInt();
        
//        double nums[] = new double[numOfArray];
//        for (int i = 0; i < numOfArray; i++) {
//            nums[i] = input.nextDouble();
//        }
        
        double nums[] = new double[]{1,2,4};

        try {
            System.out.println(Avg(nums));
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
        finally {
            System.out.println("---End of Program---");
        }
        System.out.println("Last...");
    }
}
