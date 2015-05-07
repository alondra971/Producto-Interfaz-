/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.ArrayList;
import modelo.IdProducto;

/**
 *
 * @author Parisan
 */
public class ClsProducto {
        ArrayList <IdProducto>tbproducto = new ArrayList<IdProducto>(); 
    public ClsProducto(IdProducto idp) {
        tbproducto.add(idp);
    }
    
    public ArrayList reporteProducto(){        
        return tbproducto;
    }
}
