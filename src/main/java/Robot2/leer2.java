/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author MBI
 */
public class leer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //FileReader fr = new FileReader("datos.txt");
//BufferedReader bf = new BufferedReader(fr);


BufferedReader bf = new BufferedReader(new FileReader("datos.txt"));
        String sCadena;
while ((sCadena = bf.readLine())!=null) {
   System.out.println(sCadena);
}
    }
    
}
