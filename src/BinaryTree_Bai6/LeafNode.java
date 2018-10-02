/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree_Bai6;

/**
 *
 * @author lap10602
 */
public class LeafNode implements INode {
   private int value;
   public LeafNode(int val)
   {
       value=val;
   }

    @Override
    public boolean isExist(int val) {
        return this.value==val;
    }

    @Override
    public void traversal() {
        System.out.print(value+" ");
    }
   
   
}
