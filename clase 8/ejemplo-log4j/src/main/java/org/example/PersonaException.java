package org.example;

public class PersonaException  extends  Exception{


    public PersonaException(String msgError){
        super(msgError);
    }

    public  PersonaException(String msgError, Throwable errorOriginal){
        super(msgError, errorOriginal);
    }
}
