/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekkom.huffman;

import tekkom.huffman.huffmantree;

/**
 *
 * @author ini nopal
 */
public class huffmanleaf extends huffmantree {
    
    public final char value;
    
    public huffmanleaf(int freq, char val){
        super(freq);
        value = val;
    }
}
