/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s;

/**
 *
 * @author user07
 */
public class S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String s1 = new String();
      String s2 = new String("Ez" + 1 + "String!");
      System.out.println(s2);
      char [] kartomb = {'S','A','J','Ó'};
      String s3 = new String(kartomb);
      String s4 = new String(kartomb, 2,3);
      System.out.println(s3);
      boolean log = false;
      char c1 = 'x';
      double PI = 3.15;
      boolean alma = "ALMA".equals("alma");
      boolean korte = "korte".equals("KORTE");
      System.out.println(alma);
      StringBuffer szovi = new StringBuffer("Osszesen Ft");
      float f2=34.6f;
      szovi.insert(9,f2);
      System.out.println(szovi);
      String vegyes = "NaGy bEtűK éS kIcSiK";
      String nagy = vegyes.toUpperCase();
      String kicsi = vegyes.toLowerCase();
      
        
        
    }
    
}
