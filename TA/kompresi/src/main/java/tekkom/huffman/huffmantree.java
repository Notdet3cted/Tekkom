/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekkom.huffman;

/**
 *
 * @author ini nopal
 */

public abstract class huffmantree implements Comparable<huffmantree>{
    public final int frequency;
    
    public huffmantree(int freg){
        frequency = freg;
        
    }
    
    @Override
    public int compareTo(huffmantree tree){
        return frequency - tree.frequency;
    }
}
