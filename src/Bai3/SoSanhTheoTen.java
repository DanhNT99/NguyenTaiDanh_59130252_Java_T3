/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Nguyen Tai Danh
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        int sosanh = o1.getHoTen().compareTo(o2.getHoTen());
        if(sosanh > 0)
            return 1;
        else
            if(sosanh < 0)
                return -1;
            else
                return 0;
    }
}