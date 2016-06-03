/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import com.alfonsogalvanmadera.robot_v2.DAO.DAOAccion3;
import com.alfonsogalvanmadera.robot_v2.DAO.DAOCadena3;
import com.alfonsogalvanmadera.robot_v2.DAO.DAOCliente3;
import com.alfonsogalvanmadera.robot_v2.DAO.DAODato3;
import com.alfonsogalvanmadera.robot_v2.Modelo.Accion3;
import com.alfonsogalvanmadera.robot_v2.Modelo.Cadena3;
import com.alfonsogalvanmadera.robot_v2.Modelo.Cliente3;
import com.alfonsogalvanmadera.robot_v2.Modelo.Dato3;

/**
 *
 * @author MBI
 */
public class prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente3 cli2=new Cliente3();
        Cadena3 cad=new Cadena3();
        Accion3 ac2=new Accion3();
        Dato3 d2=new Dato3();
        
        DAOCliente3 daoc1=new DAOCliente3();
        DAOCadena3 daoc=new DAOCadena3();
        DAOAccion3 daoa=new DAOAccion3();
        DAODato3 daod=new DAODato3();
        
        
        cli2.setIdCliente3(3);
        cli2.setNombre("BACARDI");
        cli2.setUsuario("bacardiaba001");
        cli2.setPass("bacardi13");
        
        cad.setIdCliente3(cli2);
        //cad.setIdCadena3;
        
        
        
        
        
        
    }
    
}
