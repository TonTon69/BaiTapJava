package BaiTapATMTransaction;

import java.util.Scanner;

public class BaiTapATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc1 = new Account();
        DanhSachATMTransaction ds = new DanhSachATMTransaction();
        ATMTransaction atm = new ATMTransaction();
        WithdrawTransaction wt = new WithdrawTransaction();
        TransactionTransfer tt = new TransactionTransfer();
        ChangePin cp = new ChangePin();

        int choice;
        do {

            System.out.println("1: Nhập 1 đối tượng Acconut");
            System.out.println("2: Nhập DS Transaction theo từng loại");
            System.out.println("3: Xuất DS TransactionTransfer");
            System.out.println("4: Xuất DS ChangePin");
            System.out.println("5: Xuất DS WithdrawTransaction");
            System.out.println("6: Thoát");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    acc1.Input();
                    break;
                case 2:
                    ds.InputDS();
                    break;
                case 3:
                    ds.OutputDSTT();
                    tt.Transfer();
                    break;
                case 4:
                    ds.OutputDSCP();
                    cp.Change(acc1);
                    break;
                case 5:
                    ds.OutputDSWT();
                    wt.WithDraw();
                    break;
                default:
                    choice = 6;
                    break;
            }
        } while (choice != 0);

    }

}
