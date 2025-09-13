/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.poo;

/**
 *
 * @author jnowell
 */
public class Empleado {
    // Atributos encapsulados
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0; // contador global

    
    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;               // uso de this para diferenciar atributo de parámetro
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;           // incrementa contador
    }

    // Constructor con nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; // id automático (se usa totalEmpleados como contador)
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0;      // salario por defecto
    }


    // Métodos sobrecargados
    public void actualizarSalario(double porcentaje) {
        // Aumenta en base a un porcentaje
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int cantidadFija) {
        // Aumenta en base a un monto fijo
        this.salario += cantidadFija;
    }


    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }


    // Método toString()
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + ", Salario=" + salario + "]";
    }

    
    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
