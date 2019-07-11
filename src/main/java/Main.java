public class Main {

    public static void main(String[] args) {
        Mobile mobile = new Mobile("huawei mate20","blue","huawei");
        mobile.call();
        Mobile iPhone = new iPhone("iPhone 8","white","iPhone");
        iPhone.call();
        Mobile andriod = new Andriod("vivo 11","pink","vivo");
        andriod.call();
        System.out.println("----------------------------------");
        Person person = new Person("Demi");
        person.use(mobile);
        person.use(iPhone);
        person.use(andriod);
    }
}
