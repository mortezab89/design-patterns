package creatinoal.prototype;

public class Movie implements PrototypeCapable {

    String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        return (Movie) super.clone();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }
}
