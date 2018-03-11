package trainerapp;

public class TrainerApp {

    private String name;
    private int kcal;
    private int weight;
    private Exercise exercise;
    private EatingFood eating;
    private int oldKcal = kcal;

    public TrainerApp() {
    }
    

    public TrainerApp(String name, int kcal, int weight) {
        this.name = name;
        this.kcal = kcal;
        this.weight = weight;
        this.eating = new EatingFood();
        this.exercise = new Exercise();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public EatingFood getEating() {
        return eating;
    }

    public void setEating(EatingFood eating) {
        this.eating = eating;
    }
    
    

    public int exerciseCourse(char type) {
        int newKcal = 0;
        if (type == 'A') {
            int leftCal = this.kcal - exercise.courseA();
            if (leftCal < 1200) {
                newKcal = -1;
            }
            else {
                this.kcal = leftCal;
                newKcal = leftCal;
            }
        } else if (type == 'B') {
            int leftCal = this.kcal - exercise.courseB();
            if (leftCal < 1200) {
                newKcal = -1;
            }
            else {
                this.kcal = leftCal;
                newKcal = leftCal;
            }
        }
        return newKcal;
    }
    
    public int exerciseSpecific(String type, int amount){
        int newKcal = 0;
        if (type.equalsIgnoreCase("Treadmill")) {
            int leftCal = this.kcal - exercise.playTreadmill(amount);
            if (leftCal < 1200) {
                newKcal = -1;
            }
            else {
                this.kcal = leftCal;
                newKcal = leftCal;
            }
        }
        else if (type.equalsIgnoreCase("Elliptical")) {
            int leftCal = this.kcal - exercise.playElliptical(amount);
            if (leftCal < 1200) {
                newKcal = -1;
            }
            else {
                this.kcal = leftCal;
                newKcal = leftCal;
            }
        }
        else if (type.equalsIgnoreCase("sitUp")) {
            int leftCal = this.kcal - exercise.sitUp(amount);
            if (leftCal < 1200) {
                newKcal = -1;
            }
            else {
                this.kcal = leftCal;
                newKcal = leftCal;
            }
        }
        return newKcal;
    }
    
    public int eatingFood(String type){

        if (type.equalsIgnoreCase("NormalFood")) {
            this.kcal += eating.getEnergy();
        }
        else if(type.equalsIgnoreCase("ShabuBuffet")){
            this.kcal += eating.getEnergyMore();
        }
        return this.kcal;
    } 
    
    public int guessYourWeight(){
        int increaseKcal = this.kcal - this.oldKcal;
        return (increaseKcal/7000)+this.weight;
    }
}
