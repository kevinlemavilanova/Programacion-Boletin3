/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author klemavilanova
 */
public class consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    public consumo(float km1,float litros1, float vMed1,float pGas1){
        km = km1;
        litros = litros1;
        vMed = vMed1;
        pGas = pGas1;
    }
    public consumo(){}
    
    public float getTempo(){
        float tempo = vMed * km;
        return tempo;
    }
    
    public float consumomedio(){
        float cM = 100 * litros / km;
        return cM;
    }
    public float consumoEuros(){
        float euros = pGas * litros;
        return euros;
    }

    public void setKm(float kms){
        km = kms;
    }
    public void setLitros(float litros1){
        litros = litros1;
    }
    public void setvMed(float vM){
        vMed = vM;
    }
    public void setPGas(float pG){
        pGas = pG;
    }

}
