public class iPhone extends Mobile {

    public iPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call() {
//        super.call();
        System.out.println("iphone Message : please call me! ");
    }
}
