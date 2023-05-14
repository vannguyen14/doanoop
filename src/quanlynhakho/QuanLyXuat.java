/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhakho;

/**
 *
 * @author nguyen
 */
public class QuanLyXuat extends QuanLyHangHoa{
     private String NgayXuat;
     private int SLXuat;
     
     public QuanLyXuat(){
         super();
         this.NgayXuat = "";
         this.SLXuat = 0;
     }

    public QuanLyXuat(String NgayXuat, int SLXuat,double GiaNhap, double GiaXuat, String DanhMuc, String TenHangHoa, String NhaSanXuat, double GiaHangHoa, int SoLuong, double ThanhTien) {
        super(DanhMuc, TenHangHoa, NhaSanXuat, GiaNhap, GiaXuat, SoLuong, ThanhTien);
        this.NgayXuat = NgayXuat;
        this.SLXuat = SLXuat;
    }

    public String getNgayXuat() {
        return NgayXuat;
    }

    public int getSLXuat() {
        return SLXuat;
    }

    public void setNgayXuat(String NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

    public void setSLXuat(int SLXuat) {
        this.SLXuat = SLXuat;
    }
    
    public double TTien(){
        return this.ThanhTien=this.GiaXuat*this.SLXuat;
    }
    
     public int TKho(){
        return this.SoLuong = this.SoLuong - this.SLXuat;
    }
    
    public void nhapXuat(){
        super.nhapThongTinHangHoa();
        System.out.print("Ngay xuat hang: ");
        NgayXuat = sc.next();
        System.out.print("So luong hang xuat ra: ");
        SLXuat = sc.nextInt();
    }
    
    public String toString(){
        return "Xuat hang: \n" + super.toString()+"\n"
                + "Ngay xuat hang: " + NgayXuat+"\n"
                + "So luong hang da xuat: " + SLXuat+"\n"
                + "Tong chi phi xuat hang: " + ThanhTien;
    }
}
