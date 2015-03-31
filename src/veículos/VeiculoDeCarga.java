/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veículos;

/**
 *
 * @author Asus
 */
public class VeiculoDeCarga extends Veiculo{
    
    private double cargaMax;
    
    public double getCargaMax(){
        return this.cargaMax;
    }
    public double setCargaMax(double cargaMax){
        this.cargaMax = cargaMax;
        return cargaMax;
    }
}
