public class Andriod extends Mobile{

    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call() {
//        super.call();
        System.out.println("Andriod Message : please call me! ");
    }

    @Override
    public void printMobileInfo() {
        super.printMobileInfo();
    }
}
