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
public class Customer {
    private int muaHangTrongNam=0;
    private IState state;
    private static IState[] stateList={new NormalState(), new VipState()};
    public Customer()
    {
        state = stateList[0];
    }
    
    private void changeStateIfNeccessary()
    {
        if(state.getClass().getName().equals("Strategy.NormalState")&&muaHangTrongNam>10000000) 
        {
            state=stateList[1];
            System.out.println("Ban da chuyen thanh khach hang Vip");
        }
    }
    public void muaHang(long sotien)
    {
        muaHangTrongNam+=state.muaHang(sotien);
        changeStateIfNeccessary();
    }
    public void an(long sotien)
    {
        muaHangTrongNam+=state.an(sotien);
        changeStateIfNeccessary();
    }
    
    public void resetMuaHang()
    {
        muaHangTrongNam=0;
        state=stateList[0];
        System.out.println("Da reset trang thai");
    }
    
    public void tangQuaSinhNhat()
    {
        state.tangQuaSinhNhat();
    }
}
