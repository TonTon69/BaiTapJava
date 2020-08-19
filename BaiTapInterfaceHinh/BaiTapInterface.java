package BaiTapInterfaceHinh;

import java.util.Scanner;

public class BaiTapInterface {
    public static void main(String[] args) {
        ListHinh DS=new ListHinh();
        
        Scanner sc = new Scanner(System.in);
        int choice;       
       
        do {
            System.out.println("1: Nhập 1 Hình vuông - Nhập 1 Hình chữ nhật - Nhập 1 Hình tròn");
            System.out.println("2: Xuất thông tin danh sách Hình vuông");
            System.out.println("3: Xuất thông tin danh sách Hình chữ nhật");
            System.out.println("4: Xuất thông tin danh sách Hình tròn");
            System.out.println("0: Thoát");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    DS.InputList();
                    break;
                case 2:
                    DS.OutputHV();
                    break;
                case 3:
                    DS.OutputHCN();
                    break;
                case 4:
                    DS.OutputHT();
                    break;
                default:
                    choice = 0;
                    break;
            }
        } while (choice != 0);      
    }
    
}
