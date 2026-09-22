/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresaxyz;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EmpresaXYZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();
        ControladorPersona controlador = new ControladorPersona();

        String rpta = "si";
        while (rpta.equalsIgnoreCase("si")) {
            System.out.print("Nombres: ");
            String nombres = sc.nextLine();
            p.setNombres(nombres);

            System.out.print("Apellido paterno: ");
            String apellidoPaterno = sc.nextLine();
            p.setApellidoPaterno(apellidoPaterno);

            System.out.print("Apellido materno: ");
            String apellidoMaterno = sc.nextLine();
            p.setApellidoMaterno(apellidoMaterno);

            System.out.print("Tipo de documento (DNI/CE): ");
            String tipoDocumento = sc.nextLine();
            p.setTipoDocumento(tipoDocumento);

            System.out.print("Número de documento: ");
            String numeroDocumento = sc.nextLine();
            p.setNumeroDocumento(numeroDocumento);

//            System.out.print("Edad: ");
//            int edad = Integer.parseInt(sc.nextLine());
//            p.setEdad(edad);
            while (true) {
                System.out.print("EDAD: ");
                String datoEdad = sc.nextLine();

                if (datoEdad.matches("\\d+")) {
                    int edad = Integer.parseInt(datoEdad);

                    if (edad >= 0) {
                        break;
                    } else {
                        System.out.println("Dato no valido. La edad no puede ser negativa.");
                    }

                } else {
                    System.out.println("Dato no valido. Ingrese un numero entero.");
                }
            }

            System.out.print("Celular: ");
            String celular = sc.nextLine();
            p.setCelular(celular);

            System.out.print("Correo: ");
            String correo = sc.nextLine();
            p.setCorreo(correo);
controlador.agregarPersona(p);
            System.out.println("\nPersona registrada correctamente.");

            System.out.println("Desea ingresar otra persona Si/No");
            rpta = sc.nextLine();

        }
        

        System.out.println("LISTA DE PERSONAS REGISTRADASc");

        controlador.listarPersonas();
    }

}
