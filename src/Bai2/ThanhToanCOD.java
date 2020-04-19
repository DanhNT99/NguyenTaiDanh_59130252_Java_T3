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
public class ThanhToanCOD implements IThanhtoan{

    @Override
    public double thanhtoan(int tienHang) {
        if(tienHang > 2000000)
            return tienHang - tienHang * 2/100;
       else
            return tienHang;
       
    }
}
