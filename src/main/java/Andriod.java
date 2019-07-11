public class Andriod extends Mobile{

    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String  call() {
//        System.out.println("Andriod Message : please call me! ");
        return super.call();
    }

}
