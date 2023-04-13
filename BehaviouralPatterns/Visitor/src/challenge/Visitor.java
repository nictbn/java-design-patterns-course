package challenge;

public interface Visitor {
    void visit(Book book);
    void visit(CD cd);
    void visit(DVD dvd);

    double getTotalPostage();
}
