
import java.util.ArrayList;
import java.util.List;

public class Galaxy extends CelestialObject {
    private List<CelestialObject> celestialObjects;
    public Galaxy() {
        super();
        this.celestialObjects = new ArrayList<>();
    }
    public  List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }
    
    public void addCelestialObject(CelestialObject obj) {
            this.celestialObjects.add(obj);
    }

}

// celestialObjects = new ArrayList<>();

// // Usage
// celestialObjects.add(new CelestialObject("Mars"));