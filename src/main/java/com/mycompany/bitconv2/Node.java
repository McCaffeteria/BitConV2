/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bitconv2;

/**
 *
 * @author allkn
 */
public class Node {
    double[] inputs;
    double bias;
    double output;
    
    public Node(int prevNumNodes) {
        inputs = new double[prevNumNodes];
    }
}
