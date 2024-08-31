/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.proyecto;

import java.io.Serializable;
public class Alumnos implements Serializable {
    private static final long serialVersionUID = 1L;
    private int Id;
    private String Nombre;
    private String Apellido;
    private double PrimerBimestre;
    private double SegundoBimestre;
    private double TercerBimestre;
    private double CuartoBimestre;
    private double promedio;
  
   

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getPrimerBimestre() {
        return PrimerBimestre;
    }

    public void setPrimerBimestre(double PrimerBimestre) {
        this.PrimerBimestre = PrimerBimestre;
    }

    public double getSegundoBimestre() {
        return SegundoBimestre;
    }

    public void setSegundoBimestre(double SegundoBimestre) {
        this.SegundoBimestre = SegundoBimestre;
    }

    public double getTercerBimestre() {
        return TercerBimestre;
    }

    public void setTercerBimestre(double TercerBimestre) {
        this.TercerBimestre = TercerBimestre;
    }

    public double getCuartoBimestre() {
        return CuartoBimestre;
    }

    public void setCuartoBimestre(double CuartoBimestre) {
        this.CuartoBimestre = CuartoBimestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
}
