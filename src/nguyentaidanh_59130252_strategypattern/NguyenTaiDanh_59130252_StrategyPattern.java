/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyentaidanh_59130252_strategypattern;

import Bai1.Cong;
import Bai1.Context;
import Bai1.Tru;
import Bai2.GioHang;
import Bai2.HangHoa;
import Bai2.ThanhToanCOD;
import Bai2.ThanhToanOnline;

/**
 *
 * @author Nguyen Tai Danh
 */
public class NguyenTaiDanh_59130252_StrategyPattern {

    static void Bai1(){
        Context tinhtoan = new Context();
        tinhtoan.setTinhtoan(new Cong());
        Context tinhtoan1 = new Context();
       tinhtoan1.setTinhtoan(new Tru());        
       System.out.println("Kết quả: " + tinhtoan.tinh(75, 12));
       System.out.println("Kết quả: " + tinhtoan1.tinh(54, 78));
    }
    static void Bai2(){
        HangHoa hh1 = new HangHoa("Latop",15000000,"Latop Dell");
        hh1.setHinhthucTT(new ThanhToanOnline());
        HangHoa hh2 = new HangHoa("Điện Thoại",7000000,"Điện thoại Iphone6s");
        hh2.setHinhthucTT(new ThanhToanCOD());
        System.out.println(hh1.Hienthi());
        System.out.println(hh2.Hienthi());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bai1();
        Bai2();
    }
    
}
