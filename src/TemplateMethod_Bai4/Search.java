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
public abstract class Search {

    public int search(Object[] a) {
        int res = initialIndex(a);
        if (res < 0) {
            return -1;
        }
        for (int i = res + 1; i < a.length; i++) {
            if (satisfy(a[res], a[i])) {
                res = i;
            }
        }
        return res;
    }

    protected abstract int initialIndex(Object[] a);

    protected abstract boolean satisfy(Object a, Object b);
}
