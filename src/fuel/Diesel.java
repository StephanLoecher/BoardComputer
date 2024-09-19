package fuel;

public class Diesel extends Fuel implements IFuel {
    public boolean NeedAddBlue = false;

    public Diesel(boolean needAddBlue) {
        NeedAddBlue = needAddBlue;
    }

    @Override
    public String PrintFuelData() {
        return "Need AddBlue: " + NeedAddBlue;
    }
}
