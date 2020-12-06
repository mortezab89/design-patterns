package creatinoal.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeCapable instance = PrototypeFactory.getInstance(PrototypeFactory.ALBUM);
        if(instance instanceof Album)
            System.out.println(true);
    }
}
