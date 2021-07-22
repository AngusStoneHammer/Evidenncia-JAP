/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author nealg
 */
public class IMC {
    double IMC;
    int altura;
    int Peso;   
    public IMC() {
    }
    
public static String Fecha(){
    Date fecha= new Date();
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
    return formatofecha.format(fecha);
}
public void devolverIMC(){
        int op;
        op = (this.getPeso()/(this.getAltura()*this.getAltura()));
        this.setIMC(op);
    }
        
    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }
    
    
}
