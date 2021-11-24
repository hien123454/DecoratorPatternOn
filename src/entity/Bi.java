package entity;

public class Bi extends CondimentDecorator {
    ThucAn thucAn;
    public Bi(ThucAn thucAn) {
        this.thucAn = thucAn;
    }
    public String getDescription() {
        return thucAn.getDescription() + ", Bi";
    }
    public double cost() {
        return .20 + thucAn.cost();
    }
}
