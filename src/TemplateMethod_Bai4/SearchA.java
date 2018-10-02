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
public class SearchA  extends Search{

    @Override
    protected int initialIndex(Object[] a) {
        return 0;
    }

    @Override
    protected boolean satisfy(Object a, Object b) {
        return (int)b>(int)a;
    }
    
}
