import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;
    private double salarioAsignado;

    // Constructor
    public Empleado(String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, double salarioAsignado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.salarioAsignado = salarioAsignado;
    }

    // Getters y Setters
    // ...

    // Métodos para calcular la edad y la antigüedad
    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }

    public int calcularAntiguedad() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaIngreso, fechaActual).getYears();
    }

    // Método para calcular las prestaciones
    public double calcularPrestaciones() {
        double decimoCuartoSueldo = 0;
        double decimoTercerSueldo = salarioAsignado;

        int antiguedad = calcularAntiguedad();
        if (antiguedad >= 1) {
            decimoCuartoSueldo = 450;
        }

        return decimoCuartoSueldo + decimoTercerSueldo;
    }

    // Método para aumentar el salario
    public void aumentarSalario(double nuevoSalario) {
        salarioAsignado = nuevoSalario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido +
                "\nFecha de nacimiento: " + fechaNacimiento +
                "\nFecha de ingreso a la PUCE: " + fechaIngreso +
                "\nSalario asignado: $" + salarioAsignado;
    }
}