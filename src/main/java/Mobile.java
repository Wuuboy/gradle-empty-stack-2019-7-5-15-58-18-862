public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void printMobileInfo(){
        System.out.println("Message : please call me! I am "+name +" I am "+color +" and I am"+brand);
    }

    public void call(){
        System.out.println("Message : please call me! ");
    }
}
