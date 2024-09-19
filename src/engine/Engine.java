package engine;

public class Engine {
    public int HorsePower;
    public float ConsumptionAt100Km;
    public int Cylinder;

    public Engine(int HP, float consumptionAt100Km, int cylinder) {
        HorsePower = HP;
        ConsumptionAt100Km = consumptionAt100Km;
        Cylinder = cylinder;
    }

    public String PrintEngineData() {
        return "HorsePower: " + HorsePower + " " + "ConsumptionAt100Km: " + ConsumptionAt100Km + " " + "Cylinder: " + Cylinder;
    }
}
