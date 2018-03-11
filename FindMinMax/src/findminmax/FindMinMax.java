package findminmax;

public class FindMinMax {

    public static int[] findMinMax(int[] score) {
        int[] minMax = {score[0], score[0]}; //MIN,MAX
        for (int i = 0; i < score.length; i++) {
            
            if (score[i] < minMax[0]) { //MIN
                minMax[0] = score[i];
            } else if (score[i] > minMax[1]) { //MAX
                minMax[1] = score[i];
            }
            if (score[i] < 0 || score[i] > 100) {
                minMax = null;
                break;
            }
        }
        return minMax;
    }

}
