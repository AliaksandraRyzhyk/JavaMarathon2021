package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setIsPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }

    @Override
    public String toString() {
        return "Picker {" +
                "salary = " + salary +
                ", isPayed = " + isPayed +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.incrementCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (isPayed == false) {
            if (warehouse.getCountPickedOrders() >= 10000) {
                salary += 70000;
                isPayed = true;
            } else
                System.out.println("Бонус пока не доступен");
        } else
            System.out.println("Бонус уже был выплачен");
    }
}

