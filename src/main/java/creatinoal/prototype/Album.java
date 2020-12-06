package creatinoal.prototype;

public class Album implements PrototypeCapable {

    String name = null;

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        return (Album)super.clone();
    }
}
