/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod_Bai4;

import static java.lang.Math.sqrt;

/**
 *
 * @author lap10602
 */
public class SearchB extends Search {

    public boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        int maxi = (int) sqrt(a);
        for (int i = 2; i <= maxi; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected int initialIndex(Object[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isPrime((int) a[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    protected boolean satisfy(Object a, Object b) {
        return (isPrime((int) b) && (int) b <= (int) a);
    }
}
