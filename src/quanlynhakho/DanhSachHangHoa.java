/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhakho;

/**
 *
 * @author nguyen
 */

public class DanhSachHangHoa {
    QuanLyHangHoa hh[] = new QuanLyHangHoa[10000];
    private int place;
    public DanhSachHangHoa(){
        place=0;
        for(int i=0; i<10000; i++) 
        hh[i] = new QuanLyHangHoa();
    }
    
    
    public void add(int choose){
        if(place>10000){
            System.out.println("Day kho roi!");
        }
        else{
            if(choose==1){
                qln();
            }
            else if(choose==2){
                qlx();
            }
            else{
                qllt();
            }
        place++;
        }
    }
    public void qln(){
        hh[place] = new QuanLyNhap();
        QuanLyNhap qln = new QuanLyNhap();
        qln.nhapNhap();
        qln.ThanhTien=qln.TTien();
        qln.SoLuong = qln.TKho();
        System.out.println("");
        System.out.println("Bien lai nhap hang: ");
        System.out.println(qln.toString());
        hh[place] = qln;
    }
    
    public void qlx(){
        hh[place] = new QuanLyXuat(); 
        QuanLyXuat qlx = new QuanLyXuat();
        qlx.nhapXuat();
        qlx.ThanhTien=qlx.TTien();
        qlx.SoLuong = qlx.TKho();
        System.out.println("");
        System.out.println("Bien lai xuat hang: ");
        System.out.println(qlx.toString()); 
        hh[place] = qlx;
    }
    
    public void qllt(){
        hh[place] = new QuanLyLuuTru(); 
        QuanLyLuuTru qllt = new QuanLyLuuTru();
        qllt.nhapTinhTrang();
        System.out.println("");
        System.out.println("Tinh trang hang hoa: ");
        System.out.println(qllt.toString());
        System.out.print("Tinh trang: "); qllt.TTrang();
        hh[place] = qllt;
    }
    
    public void bctk(){
        hh[place] = new QuanLyThongKe();
        QuanLyThongKe tk = new QuanLyThongKe();
        tk.nhapThongKe();
        tk.ThanhTien = tk.TTien();
        tk.TonKho = tk.TKho();
        System.out.println("");
        System.out.println(tk.toString());
        hh[place] = tk;
    }
    
    public void HienThiDS(){
        for(int i=0; i<place; i++){
            System.out.println("\n-------------------------: "); 
            System.out.println(hh[i].toString());
        }
    }
}