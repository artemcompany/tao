public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(10_000);
        // int price = 10_000; // цена билета
        //  int rubles = 20; // количество рублей за одну милю
        System.out.println(("Количество начисленных миль: ") + miles);
    }
}
