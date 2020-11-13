package visitor1;

public class PostageVisitor implements IVisitor {


    private double total;

    public double getTotal() {
        return total;
    }

    @Override
    public void visit(Book book) {
        total += book.getWeight() * 10l;
    }

    @Override
    public void visit(CD cd) {
        total += cd.getWeight() * 10l;
    }

    @Override
    public void visit(DVD dvd) {
        total += dvd.getWeight() * 10l;
    }
}
