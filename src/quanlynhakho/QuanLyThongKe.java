/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhakho;

/**
 *
 * @author nguyen
 */
public class QuanLyThongKe extends QuanLyHangHoa{
    protected int TonKho;
    private int slNhap, slXuat;
    
    public QuanLyThongKe(){
        super();
        this.TonKho = 0;
        this.slNhap = 0;
        this.slXuat = 0;
    }

    public QuanLyThongKe(int TonKho, int slNhap, int slXuat, String DanhMuc, String TenHangHoa, String NhaSanXuat, double GiaNhap, double GiaXuat, int SoLuong, double ThanhTien) {
        super(DanhMuc, TenHangHoa, NhaSanXuat, GiaNhap, GiaXuat, SoLuong, ThanhTien);
        this.TonKho = TonKho;
        this.slNhap = slNhap;
        this.slXuat = slXuat;
    }

    public int getTonKho() {
        return TonKho;
    }

    public int getSlNhap() {
        return slNhap;
    }

    public int getSlXuat() {
        return slXuat;
    }

    public void setTonKho(int TonKho) {
        this.TonKho = TonKho;
    }

    public void setSlNhap(int slNhap) {
        this.slNhap = slNhap;
    }

    public void setSlXuat(int slXuat) {
        this.slXuat = slXuat;
    }
    
    public int TKho(){
        return this.TonKho = this.SoLuong + this.slNhap - this.slXuat;
    }
    
    public double TTien(){
        return this.ThanhTien=this.GiaXuat*this.slXuat-this.GiaNhap*this.slNhap;
    }
    
    public void nhapThongKe(){
        super.nhapThongTinHangHoa();
        System.out.print("So luong hang nhap vao: ");
        slNhap = sc.nextInt();
        System.out.print("So luong hang xuat ra: ");
        slXuat = sc.nextInt();
    }
    
    public String toString(){
        return "Thong ke nhap xuat hang: \n" + super.toString()+"\n"
                + "So luong hang da nhap vao: " + slNhap+"\n"
                + "So luong hanh da xuat ra: " + slXuat+"\n"
                + "So luong hang con trong kho: " + TonKho+"\n"
                + "Tong tien loi sau khi ban hang: " + ThanhTien;
    }
}
