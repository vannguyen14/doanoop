/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhakho;

/**
 *
 * @author nguyen
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DanhSachHangHoa lhh =new DanhSachHangHoa();
        Scanner in = new Scanner(System.in);
        int x;
        do{
            System.out.println("\n\t\t ---------------------------------");
            System.out.println("\t\t|0. Thoat ung dung."); 
            System.out.println("\t\t|1. Tao phieu nhap hang."); 
            System.out.println("\t\t|2. Tao phieu xuat hang."); 
            System.out.println("\t\t|3. Cap nhat tinh trang hang hoa."); 
            System.out.println("\t\t|4. Chi tiet nhap, xuat hang hoa.");
            System.out.println("\t\t|5. Hien thi tat ca danh sach nhap, xuat hang.");
            System.out.println("\t\t -------------------------------------");
        x=in.nextInt();
        switch(x){
            case 1:
                lhh.add(1);
            break;
            case 2:
                lhh.add(2);
            break;
            case 3:
                lhh.add(3);
            break;
            case 4:
                lhh.bctk();
            case 5:
                lhh.HienThiDS();
            break;
        }
        }while(x!=0);
        System.out.println("");
    }
}