/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Angel
 */
public class GestorProduc_aCoronel {
    private ArrayList<Produc_aCoronel> lista;

    public GestorProduc_aCoronel() 
    {
        lista = new ArrayList<Produc_aCoronel>();
    }

    public ArrayList<Produc_aCoronel> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Produc_aCoronel> lista) {
        this.lista = lista;
    }
     
    public void insertarProducto(Produc_aCoronel item)
    {
      lista.add(item);
    }
    public void modificarProducto(int pos, Produc_aCoronel item)
    {
      lista.set(pos, item);
    }
    public void eliminarProducto(int pos)
    {
      lista.remove(pos);
    }
   
    public int obtieneId()
    {
      int idaux=0;
      
      for (Produc_aCoronel item:lista)
      {
          idaux=item.getId();
      }
      return idaux + 1;
    }
    
    public int ubicarProducto(int id)
    {
        int pos=-1;
        Iterator<Produc_aCoronel> it = lista.iterator();
        
        while ( it.hasNext())
        {
            ++pos;
            Produc_aCoronel aux = it.next();
            
            if(aux.getId()==id)
            {
                break;
            }
        }
        return pos;
    }
}
