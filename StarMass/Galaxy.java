import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galaxy extends CelestialObject {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        super();
        this.celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject obj) {
        celestialObjects.add(obj);
    }

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> massMap = new HashMap<>();
         massMap.put("Star", 0);
          massMap.put("Planet", 0);
           massMap.put("Other", 0);
        for (CelestialObject obj : celestialObjects) {
            String typeName = obj.getName();
            if (obj instanceof Star) {
                massMap.put("Star", obj.getMass() + ( massMap.get("Star")));
            }else if (obj instanceof Planet) {
                massMap.put("Planet", obj.getMass() + ( massMap.get("Planet")));
            } else {
                massMap.put("Other", obj.getMass() + ( massMap.get("Other")));
            }  
    
        }
    
        return massMap;
    }
}