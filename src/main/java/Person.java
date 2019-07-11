public class Person {
    private String name;

    private Mobile mobile;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void use(Mobile mobile){
        mobile.call();
    }
}
