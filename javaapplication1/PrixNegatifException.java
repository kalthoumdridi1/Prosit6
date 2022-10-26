/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Kal
 */
public class PrixNegatifException extends Exception {
  
public PrixNegatifException (float prix){
super();
if (prix<0) {
throw (new Exception("ERROR! Le prix est négatif!"));
}
}
}
