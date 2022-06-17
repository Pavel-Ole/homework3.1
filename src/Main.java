public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
        System.out.println(service.calculate(300));
        System.out.println(service.calculate(500));
        System.out.println(service.calculate(7500));
        System.out.println(service.calculate(634));
        System.out.println(service.calculate(280));
        System.out.println(service.calculate(231));
    }
}
