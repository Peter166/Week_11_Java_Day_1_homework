public class Runner {
    public static void main(String[] args) {
        Calculator  calculate = new Calculator();
        WaterBottle bottle = new WaterBottle(100);
    Printer printer = new Printer(10, 3);

//        System.out.println(calculate.add(6, 2));
//        System.out.println(calculate.subtract(6, 2));
//        System.out.println(calculate.multiply(6, 2));
//        System.out.println(calculate.devide(6, 2));
//
//        System.out.println(bottle.drink());


        System.out.println(printer.print(3, 2));
        System.out.println(printer.reduceToner());;
        System.out.println(printer.getToner());




    }

}
