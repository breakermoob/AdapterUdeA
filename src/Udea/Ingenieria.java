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
public class Ingenieria implements CarrerasUdea {

    @Override
    public void realizarPreinscripcion() {
         System.out.println("Se hizo la pre-inscipcion en Ingenieria");
    }
    @Override
    public void pagarDerechosMatricula() {
        System.out.println("Se pago la matricula en Ingenieria");
    }
    @Override
    public void realizarInscripcion() {
        System.out.println("Se hizo la inscipcion en Ingenieria");
    }
    @Override
    public void presentarExamenAdmision() {
        System.out.println("Debe presentarse el dia 27 de abril para presentar el examen en Ingenieria");
    }
    
}
