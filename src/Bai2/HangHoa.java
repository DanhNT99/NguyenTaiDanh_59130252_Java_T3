/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Nguyen Tai Danh
 */
public class HangHoa extends GioHang{
    public String tenHH;
    public int gia;
    public String moTa;

    public HangHoa() {
    }

    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public IThanhtoan getHinhthucTT() {
        return hinhthucTT;
    }

    public void setHinhthucTT(IThanhtoan hinhthucTT) {
        this.hinhthucTT = hinhthucTT;
    }
    public String Hienthi(){
        return "TenHH: " + tenHH +"\n" +
                "gia: " + gia + "\n" +
                "Tiền phải trả: " + thanhtoan(gia);
    }
    
}
