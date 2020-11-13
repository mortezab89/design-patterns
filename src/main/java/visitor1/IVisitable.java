package visitor1;

@FunctionalInterface
public interface IVisitable {

    void accept(IVisitor visitor);
}
