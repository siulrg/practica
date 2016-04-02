/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Luis Enrique
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Manejador implements ActionListener
{
    private ProcesosEstud miProcesos;
    public Manejador(ProcesosEstud procesos)
    {
        miProcesos=procesos;
    }
    public void actionPerformed(ActionEvent evento)
    {
        if(evento.getActionCommand().equals("Registro"))
        {
            miProcesos.agregarEstud();
        }
        if(evento.getActionCommand().equals("Eliminar"))
        {
            miProcesos.eliminarEstud();
        }
        if(evento.getActionCommand().equals("Modificar"))
        {
            miProcesos.modificarEstud();
        }
        if(evento.getActionCommand().equals("Consultar"))
        {
            miProcesos.consultarEstud();
        }
    }    
    
}
