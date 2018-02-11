
/**
 * โปรแกรมตรวจสอบค่าจำนวนเฉพาะ
 */

import javax.swing.JOptionPane;

public class PrimeNumber
{
    // instance variables

    public static void main(String[] args){
        PrimeNumber program = new PrimeNumber();

        program.start();
    }

    /**
     * Constructor for objects of class PrimeNumber
     */
    public PrimeNumber()
    {

    }

    private void start(){
        String inputStr;
        int num;
        int choice;
        do {
            do {
                inputStr = JOptionPane.showInputDialog(
                    null, "ป้อนเลขจำนวนเต็ม"); 
                num = Integer.parseInt(inputStr);
                if (num <= 0){
                    JOptionPane.showMessageDialog(null, "ให้ป้อนจำนวนเต็มที่มากกว่า 0 เท่านั้น"); 
                }

            } while(num <= 0);

            // เรียกใข้ isPrime ตัดสินใจแสดงผล
            if (isPrime(num)){
                JOptionPane.showMessageDialog(null, num + " เป็นจำนวนเฉพาะ");
            } else {
                JOptionPane.showMessageDialog(null, num + " ไม่ใช่จำนวนเฉพาะ");
            } // end if
            choice = JOptionPane.showConfirmDialog(
                null, "ต้องการทำงานต่อหรือไม่?"
            , "Confirmation"
            , JOptionPane.YES_NO_OPTION);

        } while(choice == JOptionPane.YES_OPTION);

    } // end start

    private boolean isPrime(int value){
        if (value == 1)
            return false;
        //if (value == 2 || value == 3)
        if (value <= 3)
            return true;

        for (int i = 2; i < value; i++){
            if ((value % i) == 0)
            return false;
        }
        return true;
    } // end is prime
}
