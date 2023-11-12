import java.util.Scanner;

public class Order {
    private int num;
    private Laptop laptop;
    private StatusType status;
    private static int numOfOrders = 1; //количество заказов

    public Order() {
        this.num = numOfOrders++;
        this.laptop = new Laptop();
        this.status = StatusType.ONHOLD;
    }
    public Order(Laptop laptop) {
        this();
        this.laptop = laptop;
    }
    public Order(Laptop laptop, StatusType status) {
        this(laptop);
        this.status = status;
    }

    public int getNum() { return num; }
    public static int getLastNumOfOrder() { return numOfOrders; }
    public Laptop getLaptop() { return laptop; }
    public StatusType getStatus() { return status; }
    public void setLaptop(Laptop laptop) { this.laptop = laptop; }
    public void setStatus(StatusType status) { this.status = status; }

    public void input() {
        Laptop laptop = new Laptop();
        StatusType status;

        Scanner scan = new Scanner(System.in);

        System.out.println("\tВвод параметров ноутбука");
        laptop.input();
        System.out.print("\nВведите статус заказа (0 - в ожидании, 1 - в ремонте, 2 - отремонтирован): ");
        status = StatusType.intToStatusType(scan.nextInt());

        this.laptop = laptop;
        this.status = status;
    }

    @Override public String toString() {
        return (this.getNum() + ". " + laptop.getName() + "\t" + this.getStatus());
    }
}
