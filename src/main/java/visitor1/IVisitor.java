package visitor1;

public interface IVisitor {

    void visit(Book book);
    void visit(CD cd);
    void visit(DVD dvd);
}
