package entity;

public class Trung extends CondimentDecorator{
    ThucAn thucan;
    public Trung(ThucAn thucAn) {
        this.thucan = thucAn;
    }
    public String getDescription() {
        return thucan.getDescription() + ", Trung";
    }
    public double cost() {
        return .30 + thucan.cost();
    }
}
