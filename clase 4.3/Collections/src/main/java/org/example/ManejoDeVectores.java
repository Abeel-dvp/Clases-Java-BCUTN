package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class ManejoDeVectores {

    public Integer sumarElementos( Integer [] elementos){
        Integer total = 0;

      for (Integer numero: elementos){
          total = total + numero;
      }
        return  total;
    }

    public Boolean elTextoEsta(ArrayList<String> elementos, String textoBuscar){
        Boolean seEncontroElTexto = elementos.contains(textoBuscar);
        return  seEncontroElTexto;
    }


}
