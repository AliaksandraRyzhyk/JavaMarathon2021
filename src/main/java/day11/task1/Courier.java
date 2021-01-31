package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setIsPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Courier {" +
                "salary = " + salary +
                ", isPayed = " + isPayed +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.incrementCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (isPayed == false) {
            if (warehouse.getCountDeliveredOrders() >= 10000) {
                salary += 50000;
                isPayed = true;
            } else
                System.out.println("Бонус пока не доступен");
        } else
            System.out.println("Бонус уже был выплачен");
    }
}