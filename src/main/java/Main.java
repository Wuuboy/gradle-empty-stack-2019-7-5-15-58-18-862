public class Main {

    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());
        Mobile mobile = new Mobile("huawei mate20","blue","huawei");
        mobile.call();
        Mobile iPhone = new iPhone("iPhone 8","white","iPhone");
        iPhone.call();
        Mobile andriod = new Andriod("vivo 11","pink","vivo");
        andriod.call();
    }
}
