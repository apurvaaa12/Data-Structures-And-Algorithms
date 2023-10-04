public class SingletonClass {

    public static void main(String[] args){
        Abc object1 = Abc.getObject();//everytime we'll be getting the same instance.

    }
}
class Abc{
    static Abc object = new Abc();

    public Abc() {

    }

    public static Abc getObject() {
        return object;
    }
}

