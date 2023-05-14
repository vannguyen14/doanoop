/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlynhakho;

/**
 *
 * @author nguyen
 */
import java.util.Scanner;
public class QuanLyHangHoa {
    
    protected String DanhMuc, TenHangHoa, NhaSanXuat;
    protected double GiaNhap,GiaXuat, ThanhTien;
    protected int SoLuong;
    
    Scanner sc = new Scanner (System.in);
    
    protected QuanLyHangHoa(){
        this.DanhMuc = "";
        this.TenHangHoa = "";
        this.NhaSanXuat = "";
        this.GiaNhap = 0;
        this.GiaXuat = 0;
        this.SoLuong = 0;
        this.ThanhTien = 0;
    }
    
    protected QuanLyHangHoa(String DanhMuc, String TenHangHoa, String NhaSanXuat, double GiaNhap, double GiaXuat, int SoLuong, double ThanhTien){
        this.DanhMuc = DanhMuc;
        this.TenHangHoa = TenHangHoa;
        this.NhaSanXuat = NhaSanXuat;
        this.GiaNhap = GiaNhap;
        this.GiaXuat = GiaXuat;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
    }

    public String getDanhMuc() {
        return DanhMuc;
    }

    public String getTenHangHoa() {
        return TenHangHoa;
    }

    public String getNhaSanXuat() {
        return NhaSanXuat;
    }

    public double getGiaNhap() {
        return GiaNhap;
    }

    public double getGiaXuat() {
        return GiaXuat;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public double getThanhTien() {
        return ThanhTien;
    }
    

    public void setDanhMuc(String DanhMuc) {
        this.DanhMuc = DanhMuc;
    }

    public void setTenHangHoa(String TenHangHoa) {
        this.TenHangHoa = TenHangHoa;
    }

    public void setNhaSanXuat(String NhaSanXuat) {
        this.NhaSanXuat = NhaSanXuat;
    }

    public void setGiaNhap(double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public void setGiaXuat(double GiaXuat) {
        this.GiaXuat = GiaXuat;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
    protected void nhapThongTinHangHoa(){
        System.out.print("Danh muc san pham: ");
        DanhMuc = sc.nextLine();
        System.out.print("Ten hang hoa: ");
        TenHangHoa = sc.nextLine();
        System.out.print("Nha san xuat: ");
        NhaSanXuat = sc.nextLine();
        System.out.print("Gia nhap hang: ");
        GiaNhap = sc.nextDouble();
        System.out.print("Gia xuat hang: ");
        GiaXuat = sc.nextDouble();
        System.out.print("So luong hang dang co: ");
        SoLuong = sc.nextInt();
    }

    public String toString(){
        return "Danh muc san pham: " + DanhMuc +"\n"
             + "Ten hang hoa: " + TenHangHoa+"\n"
             + "Nha san xuat: " + NhaSanXuat+"\n"
             + "Ton kho: " + SoLuong + "\n"
             + "Gia nhap hang: " + GiaNhap+"\n"
             + "Gia xuat hang: " + GiaXuat;
    }
    
}
