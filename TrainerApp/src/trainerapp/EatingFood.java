
package trainerapp;

public class EatingFood extends Food {
    private String foodTime = "Dinner";

    public EatingFood() {

    }
            
    @Override
    public int getEnergy(){
        return 400;
    }
    
    public int getEnergyMore(){
        return 7000;
    }
}
