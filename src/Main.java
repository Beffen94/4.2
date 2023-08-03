public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.87; //Рост человека в метрах, сантиметрах.
        int weight = 98; //Вес человека в кг.

        double index = (int) (service.calculate(height, weight));

        System.out.println("Индекс массы тела = " + (index));
    }
}
