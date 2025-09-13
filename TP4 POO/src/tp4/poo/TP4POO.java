/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4.poo;

/**
 *
 * @author jnowell
 */
public class TP4POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear empleados con distintos constructores
        Empleado e1 = new Empleado(1, "Julieta Nowell", "Tester", 1500);
        Empleado e2 = new Empleado("Carlos Perez", "Desarrollador");
        Empleado e3 = new Empleado("Ana Gomez", "Analista");

        // Aplicar aumentos
        e1.actualizarSalario(10);   // 10% de aumento
        e2.actualizarSalario(500);  // $500 fijos

        // Mostrar información
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total de empleados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
