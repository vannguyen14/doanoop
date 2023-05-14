/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhakho;

/**
 *
 * @author nguyen
 */
public class QuanLyNhap extends QuanLyHangHoa{
    
     private String NgayNhap;
     private int SLNhap;
     
     public QuanLyNhap(){
         super();
         this.NgayNhap = "";
         this.SLNhap = 0;
     }

    public QuanLyNhap(String NgayNhap, int SLNhap, double GiaNhap, double GiaXuat, String DanhMuc, String TenHangHoa, String NhaSanXuat, double GiaHangHoa, int SoLuong, double ThanhTien) {
        super(DanhMuc, TenHangHoa, NhaSanXuat, GiaNhap, GiaXuat, SoLuong, ThanhTien);
        this.NgayNhap = NgayNhap;
        this.SLNhap = SLNhap;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public int getSLNhap() {
        return SLNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public void setSLNhap(int SLNhap) {
        this.SLNhap = SLNhap;
    }
    
    public double TTien(){
        return this.ThanhTien=this.GiaNhap*this.SLNhap;
    }
    
    public int TKho(){
        return this.SoLuong = this.SoLuong + this.SLNhap;
    }
    
    public void nhapNhap(){
        super.nhapThongTinHangHoa();
        System.out.print("Ngay nhap hang: ");
        NgayNhap = sc.next();
        System.out.print("So luong hang nhap vao: ");
        SLNhap = sc.nextInt();
    }
    
    public String toString(){
        return "Nhap hang: \n" + super.toString()+"\n"
                + "Ngay nhap hang: " + NgayNhap + "\n"
                + "So luong hang da nhap vao: " + SLNhap + "\n"
                + "Tong chi phi nhap hang: " + ThanhTien;
    }
     
}
