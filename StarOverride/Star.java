
public class Star extends CelestialObject {
    private double magnitude;

    public Star() {
        super();
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z);
        this.magnitude = magnitude;

    }
    @Override
     public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Star other = (Star) obj;

        return other.getMagnitude() ==  getMagnitude() ;
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