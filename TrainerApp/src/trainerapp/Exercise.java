
package trainerapp;

public class Exercise {
    private Treadmill treadmill;
    private Elliptical eliptical;

    public Exercise() {
    }

        
    public Exercise(Treadmill treadmill, Elliptical eliptical) {
        this.treadmill = treadmill;
        this.eliptical = eliptical;
    }
    
    public int courseA(){
        return playTreadmill(60)+playElliptical(30);
    }
    
    public int courseB(){
        return playTreadmill(90)+sitUp(30);
    }
    
    public int sitUp(int amount){
        return (int) (amount*0.5);
    }
    
    public int playTreadmill(int time) {
        return (int)((time/60.0)*350.0);
    }
    
    public int playElliptical(int time){
        return (int)((time/60.0)*400.0);
    }
    
}
