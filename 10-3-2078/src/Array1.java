
public class Array1 {
    public static void main(String[] args) {
        //1.
        int[] num1 = new int[4];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = i+1;
            System.out.print(num1[i]+" ");
        }
        
        System.out.println("");
        //2.        
        int num2[]=num1;
        for (int i = 0; i < num1.length; i++) {
            int sum[] = new int[4];
            sum[i] = num1[i]+num2[i];
            System.out.print(sum[i]+" ");
        }
        
        System.out.println("");
        //3.
        int[] num3={10,20,30,40};
        int[] num4={2,4};
        
        int sum2;
        for (int i = 0; i < num4.length; i++) {
            sum2 = num3[i] + num4[i];
            System.out.print(sum2+" ");
        }
        for (int i = num4.length; i < num3.length; i++) {
            sum2 = num3[i];
            System.out.print(sum2+" ");
        }
    }
}
