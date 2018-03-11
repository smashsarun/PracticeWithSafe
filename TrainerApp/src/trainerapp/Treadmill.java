package trainerapp;

public class Treadmill implements ExerciseMachine {

    private String name = "treadmill";
    private int price = 25000;

    public Treadmill() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int helpMetabolism() {
        return 350;
    }
}
