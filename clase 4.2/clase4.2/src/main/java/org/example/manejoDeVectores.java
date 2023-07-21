package org.example;

public class manejoDeVectores {

    public Integer sumaDeNumEnteros( Integer[] elementos ){
        Integer total = 0;
        for (int i = 0; i<elementos.length; i++){
            total = total + elementos[i];
        }
        return total;
    }

    public Boolean buscarTexto(String[] elementos, String textoBuscar){
        Boolean seEncontroElTexto = false;

        for (int i = 0; i< elementos.length; i ++) {
            if (elementos[i].equalsIgnoreCase(textoBuscar)){
                seEncontroElTexto =true;
                break;
            }

        }
        return  seEncontroElTexto;
    }
}
