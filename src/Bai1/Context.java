/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Nguyen Tai Danh
 */
public class Context {
    ITinh tinhtoan;

    public Context() {
    }

    public Context(ITinh tinhtoan) {
        this.tinhtoan = tinhtoan;
    }
    public ITinh getTinhtoan() {
        return tinhtoan;
    }

    public void setTinhtoan(ITinh tinhtoan) {
        this.tinhtoan = tinhtoan;
    }
    public float tinh(float a, float b) {
        return tinhtoan.tinh(a, b);
    }
    
}