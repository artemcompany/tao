public class BonusMilesService {
    public int calculate(int price) {
        int rubles = 20; // количество рублей за одну милю
        int miles = price / rubles;
        return miles;
    }
}
