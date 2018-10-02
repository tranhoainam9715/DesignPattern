/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import BinaryTree_Bai6.INode;
import BinaryTree_Bai6.NormalNode;
import BinaryTree_Bai6.LeafNode;

/**
 *
 * @author lap10602
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Bai 5
        Customer c= new Customer();
        c.tangQuaSinhNhat();
        c.muaHang(5000000);
        c.an(6000000);
        c.tangQuaSinhNhat();
        c.muaHang(5000000);
        c.an(6000000);
        c.resetMuaHang();
        c.muaHang(5000000);
        c.an(6000000);
         */
 /*Create Tree*/
        NormalNode root = new NormalNode(10);
        NormalNode left = new NormalNode(2);
        NormalNode left2 = new NormalNode(3);
        LeafNode leaf1 = new LeafNode(9);
        LeafNode leaf2 = new LeafNode(1);
        LeafNode leaf3 = new LeafNode(7);
        LeafNode leaf4 = new LeafNode(5);
        root.leftNode = left;
        root.rightNode = leaf4;
        left.leftNode = leaf1;
        left.rightNode = left2;
        left2.leftNode = leaf2;
        left2.rightNode = leaf3;

        INode tree = root;
        int a = 100;
        tree.traversal();

        System.out.println("\n" + tree.isExist(a));

    }
}
