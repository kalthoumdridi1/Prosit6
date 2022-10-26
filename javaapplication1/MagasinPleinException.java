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
public class MagasinPleinException extends IndexOutOfBoundsException {
    
 
public MagasinPleinException(){
super();
System.out.println("Le magasin est déja plein!");
}

}