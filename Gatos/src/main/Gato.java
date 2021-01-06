package main;

import java.util.ArrayList;

public class Gato {
    public String nombre;
    public String propietario;
    public String genero;
    public String color;
    public Integer gatitos;

    public Gato(String nombre, String propietario, String color){
        this.nombre = nombre;
        this.propietario = propietario;
        this.color = color;
        this.gatitos = 0;

    }

    @Override
    public boolean equals(Object o){
        Gato comparedGato = (Gato) o;
        if (comparedGato.getColor() == this.getColor()){
            return true;
        }
        else {
            return false;
        }

    }

    public String getColor() {
        return color;
    }

    public boolean addGatitos(Integer adoptedGatitos){
        if (this.getGatitos() >= 2){
            return false;
        }
        else if ((this.getGatitos() + adoptedGatitos) > 2 ){
            return false;
        }
        else {
            this.gatitos += adoptedGatitos;
            return true;
        }

    }

    public Integer getGatitos(){
        return gatitos;
    }
}
