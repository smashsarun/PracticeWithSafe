package bmi;

public class BMI {

    public static String[] bmiStudents(Student std[]) {
        String[] bmiStd = new String[std.length];
        for (int i = 0; i < std.length; i++) {
            bmiStd[i] = bmiCategory(std[i]);
        }
        return bmiStd;
    }

    public static String bmiCategory(Student std) {

        String bmiDetail;
        if (std.getHeight() < 0 || std.getWeight() < 0) {
            bmiDetail = "none";
        } else if (std.getHeight() == 0 || std.getWeight() == 0) {
            bmiDetail = "none";
        } else {
            double bmi = std.getWeight() / (Math.pow(std.getHeight(), 2));
            if (bmi < 18.5) {
                bmiDetail = "under weight";
            } else if (bmi < 25) {
                bmiDetail = "normal weight";
            } else if (bmi < 30) {
                bmiDetail = "over weight";
            } else {
                bmiDetail = "obesity";
            }
        }
        return bmiDetail;
    }
    
}
