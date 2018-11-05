/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udea;

/**
 *
 * @author bm
 */
public class ArtesAdapter extends Artes implements CarrerasUdea {
    
    Artes a1 = new Artes();
    @Override
    public void realizarPreinscripcion() {
        a1.realizarPreinscripcionArtes();      
    }

    @Override
    public void pagarDerechosMatricula() {
        a1.comprarPinArtes();
    }

    @Override
    public void realizarInscripcion() {
        a1.realizarInscripcionArtes();
    }

    @Override
    public void presentarExamenAdmision() {
        a1.presentarPreparatorio();
        a1.presentarPruebaEscrita(); 
    }   
}
