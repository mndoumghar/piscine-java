
public class Star extends CelestialObject {
    private double magnitude;

    public Star() {
        super();
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z);
        this.magnitude = magnitude;

    }
    
     public boolean equals(Star obj) {
        if (obj == null) {
            return false;
        }
        return obj.getMagnitude() == magnitude;
    }


    public double getMagnitude() {
        return this.magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
     public String toString() {
        return String.format("%s shines at the %.3f magnitude",getName(), getMagnitude());
    }
    
   
}