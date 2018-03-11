
package trainerapp;

public class Elliptical implements ExerciseMachine{
    private String name = "elliptical";
    private int price = 17500;

    public Elliptical() {
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
    public int helpMetabolism(){
       return 400; 
    }
}
