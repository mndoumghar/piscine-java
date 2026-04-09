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

    public String toString() {
        return "Terre is positioned at (" + String.format("%.3f", this.x) + ", " + String.format("%.3f", this.y) + ", "
                + String.format("%.3f", this.z) + ")";
    }

    public boolean equals(CelestialObject obj) {
        if (obj == null) {
            return false;
        }
        return obj.x == x && obj.y == y && obj.z == z && obj.name == name;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getX(), getY(), getZ());
    }

}