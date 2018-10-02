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
public class NormalState implements IState  {
    @Override
    public long muaHang(long sotien)
    {
        System.out.println("Ban da mua hang: "+ sotien+ "VND");
        return sotien;
    }
    
    @Override
    public long an(long sotien)
    {
        System.out.println("Ban da an voi so tien: "+ sotien+ "VND");
        return sotien;
    }

    @Override
    public void tangQuaSinhNhat() {
        System.out.println("Ban khong duoc tang qua sinh nhat");
    }
   
    
}
