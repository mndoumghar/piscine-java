import java.util.Objects;

public class CelestialObject  {
    public double x;
    public double y;
    public double z;
    public String name;
    public static double KM_IN_ONE_AU = 1.5E8;

    public  CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public CelestialObject() {
        this.name = "Soleil";

    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

     public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String getName() {
        return name;
    }
    public static double getDistanceBetween(CelestialObject obj1 ,CelestialObject  obj2) {
            return Math.sqrt(Math.pow((obj2.x - obj1.x), 2) + Math.pow((obj2.y - obj1.y), 2) + Math.pow((obj2.z - obj1.z), 2));
    }
    public static double getDistanceBetweenInKm(CelestialObject obj1 ,CelestialObject  obj2) {
            return Math.sqrt(Math.pow((obj2.x - obj1.x), 2) + Math.pow((obj2.y - obj1.y), 2) + Math.pow((obj2.z - obj1.z), 2)) * CelestialObject.KM_IN_ONE_AU;
    }


    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)",getName(), getX(),getY(),getZ());
    }
   
   @Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof CelestialObject)) return false;
    CelestialObject obj = (CelestialObject) o;

    return Double.compare(obj.x, x) == 0 &&
           Double.compare(obj.y, y) == 0 &&
           Double.compare(obj.z, z) == 0 &&
           Objects.equals(obj.name, name);
}

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getX(), getY(), getZ());
    }


}