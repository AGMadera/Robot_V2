/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author MBI
 */
public class leer {

    /**
     * @param args the command line arguments
     */
    
   
public static String linea;
public static String linea1;
 public static void main(String[] arg) throws IOException, InterruptedException{
  
  File file= new File("C:\\Users\\MBI\\Desktop\\pruebas\\pruebaParaLeerArchivoRespaldo.txt");
  BufferedReader reader=new BufferedReader(new FileReader(file));
  linea=reader.readLine();
  //String cadena;
  String cliente;
  String url;
  String tiempoPrincipal;
  String archivoAcciones;
  //String[] 
  String[] arreglo_datos = linea.split(",");
  
 // System.out.println("-----------------------------------------------");
    String sCurrentLine;
     while ((sCurrentLine=reader.readLine())!= null) {
         
         /*
         System.out.println(sCurrentLine);
         System.out.println(arreglo_datos[0]);
         System.out.println(arreglo_datos[1]);
         System.out.println(arreglo_datos[2]);
         System.out.println(arreglo_datos[3]);
         */
         /* for (int i=0; i<arreglo_datos.length; i++){
            System.out.println(arreglo_datos[i]);
            
            }*/
         
         cliente=arreglo_datos[0];
         url=arreglo_datos[1];
         tiempoPrincipal= arreglo_datos[2];
         archivoAcciones =arreglo_datos[3];
        
 
         webDriver(cliente,url,archivoAcciones);


         
     }
    
         
         
     }
     
  

     static WebDriver webDriver(String cliente, String url, String acciones) throws FileNotFoundException, IOException, InterruptedException {
        
         WebDriver driver=new FirefoxDriver();
        driver.get(url);
        Thread.sleep(4000);
              //      System.out.println(acciones);

        String accionesStr;
         String tipoObejto ="";
         String handle  ="";
         String IdObjeto  ="";
         String valor  ="";
         String accion  ="";
         String tiempo ="" ;
         String[] accionesStr2;
         int i=1;
         int e=0;
          String[] tempdatos3arr;
        String [] datos2arr=acciones.split("/");
      while (i<datos2arr.length) {
             e=0;
            tempdatos3arr = datos2arr[i].split(":");
                while (e<tempdatos3arr.length) {
                           switch(e){
                               case 0:
                                   tipoObejto  = tempdatos3arr[e];
                               break;
                               case 1:
                                   handle  = tempdatos3arr[e];
                               break;
                               case 2:
                                   IdObjeto  = tempdatos3arr[e];
                               break;
                               case 3:
                                   valor  = tempdatos3arr[e];
                               break;
                               case 4:
                                   accion  = tempdatos3arr[e];
                               break;
                               case 5:
                                   tiempo  = tempdatos3arr[e];
                               break;
                                            
                           };
                            System.out.println(tempdatos3arr[e]);
                            
                       e++;

                  }
              i++;
         
          
     

         if(tipoObejto.equals("input")){
             System.out.println("entro rn input");
             switch (handle){
                 case "name":
                     if(accion.equals("escribir")){
                         driver.findElement(By.name(IdObjeto)).sendKeys(valor);
                     }
                     if(accion.equals("click")){
                         driver.findElement(By.name(IdObjeto)).click();
                     }
                  break;
                case "id":
                    if(accion.equals("escribir")){
                         driver.findElement(By.id(IdObjeto)).sendKeys(valor);
                     }
                     if(accion.equals("click")){
                         driver.findElement(By.id(IdObjeto)).click();
                     }                  
                  break;
                case "class":
                   if(accion.equals("escribir")){
                         driver.findElement(By.className(IdObjeto)).sendKeys(valor);
                     }
                     if(accion.equals("click")){
                         driver.findElement(By.className(IdObjeto)).click();
                     }
                  break;
                case "xpath":
                     if(accion.equals("escribir")){
                         driver.findElement(By.xpath(IdObjeto)).sendKeys(valor);
                     }
                     if(accion.equals("click")){
                         driver.findElement(By.xpath(IdObjeto)).click();
                     }
                  break;
             }
            
         }
         System.out.println(tipoObejto);
         if(tipoObejto.equals("boton")){
             System.out.println("entro rn boton");
             System.out.println("Identifica boton");
             System.out.println(IdObjeto);
            switch (handle){
                 case "name":                   
                      driver.findElement(By.name(IdObjeto)).click();
                  break;
                case "id":
                   driver.findElement(By.id(IdObjeto)).click();          
                  break;
                case "class":
                   driver.findElement(By.className(IdObjeto)).click();
                  break;
                case "xpath":
                    driver.findElement(By.xpath(IdObjeto)).click();
                  break;
             }
         }
         int tiempoMath=Integer.parseInt(tiempo);
         if (tiempoMath!=0) {
             Thread.sleep(tiempoMath);
         }
         
                    
      }
     
      return driver;
    }
}
 

   


    
