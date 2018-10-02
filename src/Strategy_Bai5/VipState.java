/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy_Bai5;

/**
 *
 * @author lap10602
 */
public class VipState implements IState {

    @Override
    public long muaHang(long sotien) {
        System.out.println("Ban duoc giam 5% khi mua hang: "+sotien*0.95+"VND");
        return (long)(sotien*0.95);
    }

    @Override
    public long an(long sotien) {
        System.out.println("Ban duoc an mien phi");
        return 0;
    }
    @Override
    public void tangQuaSinhNhat() {
        System.out.println("Ban duoc tang qua sinh nhat");
    }
    
}
