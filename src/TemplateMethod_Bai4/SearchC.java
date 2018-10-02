/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod_Bai4;

/**
 *
 * @author lap10602
 */
public class SearchC extends Search {

    @Override
    protected int initialIndex(Object[] a) {
        for (int i = 0; i < a.length; i++) {
            if ( Double.valueOf(a[i].toString()) < 0) {
                return i;
            }
        }
        return -1;
    }

    @Override
    protected boolean satisfy(Object a, Object b) {
        double ad=Double.valueOf(a.toString());
        double bd=Double.valueOf(b.toString());
        return (bd < 0 && bd > ad);
    }

}
