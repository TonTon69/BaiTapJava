package BaiTapATMTransaction;

import java.util.Scanner;

public class Customer {
    private int ID;
    private String Name;
    private String Address;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Customer() {
    }

    public Customer(int ID, String Name, String Address) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        ID = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập Name: ");
        Name = sc.nextLine();

        System.out.print("Nhập Address: ");
        Address = sc.nextLine();

    }

    public void Output() {
        System.out.println("Customer{" + "ID=" + ID + ", Name=" + Name + ", Address=" + Address + '}');
    }

    @Override
    public String toString() {
        return "Customer{" + "ID=" + ID + ", Name=" + Name + ", Address=" + Address + '}';
    }
}
