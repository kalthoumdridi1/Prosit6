/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Vector;
import javaapplication1.Employe;


/**
 *
 * @author Kal
 */
public class Magasin {
    private int id ;
    private String adresse ;
    private int capacite; 
    private Produit[2] produits;
    private Employe[] employes;
    
public  Magasin(){
      this.produits= new Produit[50];
   
}    
public Magasin (int id ,String adresse){
    this.id=id;
    this.adresse= adresse ;
    this.capacite=0;
    this.produits= new Produit[50];
}
public void ajouterProduit (Produit p){    
    try {
    produits[this.capacite]=p;
    this.capacite++; 
    System.out.println("Element ajouté.");}
    //catch (IndexOutOfBoundsException e){
    catch (MagasinPleinException e) {
       // System.out.println("Tableau saturée."); 
    }
}

public void setProduits(Produit p) {
        this.produits.add(p);
    }

public void setEmployes(Employe E) {
        this.employes.add(E);
    }


 public void afficherEmployes() {
         System.out.println("Proprietes des employes:");
          
  for(int i=0; i<employes.length; i++)
         {
     System.out.println (employes[i].toString());
         }
    
@Override
public String toString (){
    String str ="";
    for (int i =0 ; i<this.capacite;i++){
        //str=str+"7ajja"
        str+="\n nom  "+produits[i].getLibelle()+"  Prix"+produits[i].getPrix();
    }
    
    
    return "le magasin  id :"+this.id+"\nadresse "+this.adresse+"\n Produit "+str;
} 

  public float calculStock() {
        float stock = 0;
        for (int i = 0; i < this.capacite; i++) {
         if (this.produits[i].determinerTypeProduit().equals("Fruit")) {
             stock += (this.produits[i]).quantite;
            }
        }

        return stock;
    }
}


 


