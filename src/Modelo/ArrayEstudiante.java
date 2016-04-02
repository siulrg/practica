/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Luis Enrique
 */
import java.util.ArrayList;
public class ArrayEstudiante {
    private ArrayList<Estudiante> lista;
    public ArrayEstudiante()
    {
        lista=new ArrayList<Estudiante>();
    }
    public void llenarArray(Estudiante estud)
    {
        lista.add(estud);
    }
    public Estudiante retornarEstud(String carnet)
    {
        Estudiante estud=null;
        for(int i=0;i<lista.size();i++)
        {
            if(lista.get(i).getCarnet().equals(carnet))
            {
                estud=lista.get(i);
            }
        }
        return estud;
    }
    public void eliminarEstud(String carnet)
    {
        lista.remove(retornarEstud(carnet));
    }
}
