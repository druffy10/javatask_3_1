public class BonusMilesService {

    public int calculate(int price) {
        int milesPerRub = 20;
        return price / milesPerRub;
    }
}