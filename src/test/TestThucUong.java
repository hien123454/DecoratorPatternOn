package test;


import entity.*;

public class TestThucUong {
    public static void main(String args[]) {
        ThucAn thucan1 = new Trung(new Bi(new Com()));
        System.out.println(thucan1.getDescription() + " $ " + thucan1.cost());
        ThucAn thucan2 = new Trung(new BanhMi());
        System.out.println(thucan2.getDescription() + " $ " + thucan2.cost());
    }
}
