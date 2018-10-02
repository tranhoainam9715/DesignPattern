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
public class NormalNode implements INode {

    public INode leftNode, rightNode;
    private int value;
    public NormalNode(int val)
    {
        value=val;
    }
    /*
    @Override
    public boolean isExist(int val) {
        if(value==val) return true;
        if(leftNode==null) return rightNode.isExist(val);
        else{
            if(rightNode==null) return leftNode.isExist(val);
            return (leftNode.isExist(val)||rightNode.isExist(value));
        } 
    }
    */
    
    @Override
    public boolean isExist(int val) {
        if(value==val) return true;
        if(leftNode!=null&&leftNode.isExist(val)) return true; 
        return rightNode!=null&&rightNode.isExist(val);
    }
    
    @Override
    public void traversal() {
        System.out.print(value+" ");
        if(leftNode!=null) leftNode.traversal();
        if(rightNode!=null) rightNode.traversal();
    }
    
    
}
