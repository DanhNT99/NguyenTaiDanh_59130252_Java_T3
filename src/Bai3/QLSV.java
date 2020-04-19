/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Tai Danh
 */
public class QLSV{
    ISoSanh soSanh;
    ISoSanh<SinhVien> soSanhSV;
    
    ArrayList<SinhVien> listSinhVien = new ArrayList<>();
    
    public void them(SinhVien sv){
        listSinhVien.add(sv);
    }
    public int soSanh(SinhVien o1, SinhVien o2) {
        return soSanh.soSanh(o1, o2);
    }   
}
