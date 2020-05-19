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
public class huffmannode extends huffmantree {
    public final huffmantree right;
    public final huffmantree left;
    
    public huffmannode(huffmantree l, huffmantree r){
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }
}
