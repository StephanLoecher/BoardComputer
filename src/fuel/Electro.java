package fuel;

public class Electro extends Fuel implements IFuel {
    public int maxKwH;

    @Override
    public String PrintFuelData() {
        return "MaxKwH " + maxKwH;
    }
}
