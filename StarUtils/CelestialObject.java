import java.util.Objects;

public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;

    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public CelestialObject() {
    }

    public String toString() {
        return "Terre is positioned at (" + String.format("%.3f", this.x) + ", " + String.format("%.3f", this.y) + ", "
                + String.format("%.3f", this.z) + ")";
    }

    public boolean equals(CelestialObject obj) {
        return obj.x == x && obj.y == y && obj.z == z;

    }
    @Override
    public  int hashCode() {
        
        return Objects.hash(name, x,y,z);
    }
   
}