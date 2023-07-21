package org.example;

public class MiPropiaException extends Exception {

    public MiPropiaException(String miMensaje){
        super(miMensaje);
    }

    public MiPropiaException(String miMensaje, Throwable e){
        super(miMensaje, e);
    }

}
