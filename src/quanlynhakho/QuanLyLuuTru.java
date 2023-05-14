/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhakho;

/**
 *
 * @author nguyen
 */
public class QuanLyLuuTru extends QuanLyHangHoa{
    private int TinhTrang;
    
    public QuanLyLuuTru(){
        super();
        this.TinhTrang = 0;
    }
    
    public QuanLyLuuTru(String DanhMuc, String TenHangHoa, String NhaSanXuat, double GiaNhap, double GiaXuat, int SoLuong, int TinhTrang, double ThanhTien){
        super(DanhMuc, TenHangHoa, NhaSanXuat, GiaNhap, GiaXuat, SoLuong, ThanhTien);
        this.TinhTrang = TinhTrang;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
    public void nhapTinhTrang(){
        super.nhapThongTinHangHoa();
    }
    
    public void TTrang(){
        if (SoLuong>0){
            System.out.println("trong kho van con hang.");
        }
        else{
            System.out.println("trong kho da het hang.");
        }
    }
    
    public String toString(){
        return "\n"+ super.toString();
    }
}
