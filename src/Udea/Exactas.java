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
public class Exactas implements CarrerasUdea {

    @Override
    public void realizarPreinscripcion() {
        System.out.println("se hizo la pre-inscipcion en Exactas");
    }

    @Override
    public void pagarDerechosMatricula() {
        System.out.println("se pago la matricula en Exactas");
    }

    @Override
    public void realizarInscripcion() {
        System.out.println("se hizo la inscipcion en Exactas");
    }

    @Override
    public void presentarExamenAdmision() {
        System.out.println("debe presentarse el dia 27 de abril para presentar el examen en Exactas");
    }
    
}
