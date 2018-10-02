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
public interface IState {
    public long muaHang(long sotien);
    public long an(long sotien);
    public void tangQuaSinhNhat();
}
