/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author 202301089
 */
public class Celsius {

    private double templnCelsius;

    public Celsius(double templnCelsius) {
        this.templnCelsius = templnCelsius;
    }

    public double getTempInFahr() {
        return templnCelsius * 1.8 + 32;
    }

}
