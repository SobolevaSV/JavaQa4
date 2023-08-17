public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(98.00, 1.87); // должно получиться 28
        System.out.println(index);
    }
}