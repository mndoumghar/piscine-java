
public class Star extends CelestialObject {
    private double magnitude;

    public Star() {
        super();
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z);
        this.magnitude = magnitude;

    }
    
    


    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
    @Override
     public String toString() {
        return String.format("%s shines at the %.3f magnitude",getName(), getMagnitude());
    }
    
   
}