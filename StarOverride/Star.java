import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Star star = (Star) o;

        return Double.compare(star.magnitude, magnitude) == 0
                && Objects.equals(getName(), star.getName())
                && Double.compare(getX(), star.getX()) == 0
                && Double.compare(getY(), star.getY()) == 0
                && Double.compare(getZ(), star.getZ()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getX(), getY(), getZ(),magnitude);
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", getName(), getMagnitude());
    }

}