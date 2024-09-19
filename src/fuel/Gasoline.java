package fuel;

public class Gasoline extends Fuel implements IFuel {
    public int MinOctan = 95;
    public int MaxOctan = 105;

    @Override
    public String PrintFuelData() {
        return "MinOctan: " + MinOctan + " " + "MaxOctan: " + MaxOctan;
    }
}
