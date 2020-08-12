package BaiTapATMTransaction;

import java.util.Scanner;

public class DanhSachATMTransaction {

    private int sl;
    private ATMTransaction ATM[];

    public DanhSachATMTransaction() {
    }

    public DanhSachATMTransaction(int sl, ATMTransaction[] ATM) {
        this.sl = sl;
        this.ATM = ATM;
    }

    public void InputDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng: ");
        sl = sc.nextInt();
        ATM = new ATMTransaction[sl];
        for (int i = 0; i < sl; i++) {
            System.out.println(
                    "--Input 1: Nhập TransactionTransfer -- Input 2: Nhập ChangePin -- Inuput 3: Nhập TransactionWithdraw--");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    ATM[i] = new TransactionTransfer();
                    ATM[i].Input();
                    break;
                case 2:
                    ATM[i] = new ChangePin();
                    ATM[i].Input();
                    break;
                case 3:
                    ATM[i] = new WithdrawTransaction();
                    ATM[i].Input();
                    break;
                default:
                    break;
            }
        }
    }

    public void OutputDS() {
        for (int i = 0; i < sl; i++) {
            if (ATM[i].getClass().toString().contains("TransactionTransfer")) {
                ATM[i].Output();
            }
            if (ATM[i].getClass().toString().contains("ChangePin")) {
                ATM[i].Output();
            }
            if (ATM[i].getClass().toString().contains("WithdrawTransaction")) {
                ATM[i].Output();
            }
        }
    }

    public void OutputDSTT() {
        for (int i = 0; i < sl; i++) {
            if (ATM[i].getClass().toString().contains("TransactionTransfer")) {
                ATM[i].Output();
            }

        }
    }

    public void OutputDSCP() {
        for (int i = 0; i < sl; i++) {
            if (ATM[i].getClass().toString().contains("ChangePin")) {
                ATM[i].Output();
            }

        }
    }

    public void OutputDSWT() {
        for (int i = 0; i < sl; i++) {
            if (ATM[i].getClass().toString().contains("WithdrawTransaction")) {
                ATM[i].Output();
            }
        }
    }

}
