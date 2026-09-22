/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaxyz;

/**
 *
 * @author LENOVO
 */
public class Persona {

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String tipoDocumento;
    private String numeroDocumento;
    private int edad;
    private String categoria;
    private String celular;
    private String correo;

    public Persona() {
    }

    
    // Constructor lleno
    public Persona(String nombres, String apellidoPaterno,
            String apellidoMaterno, String tipoDocumento,
            String numeroDocumento, int edad,
            String celular, String correo) {

        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.celular = celular;
        this.correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        if (tipoDocumento.equalsIgnoreCase("dni") || tipoDocumento.equalsIgnoreCase("ce")) {
            this.tipoDocumento = tipoDocumento;
        } else {
            System.out.println("Error tipo documento no valido");
        }
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        //this.numeroDocumento = numeroDocumento;
        if (!numeroDocumento.matches("\\d+")) {
            System.out.println("El numero de documento solo debe ser numeros");

        }
        if (this.tipoDocumento == null) {
            System.out.println("Primero debe ingresar el tipo de documento");
            return;
        }
        if (this.tipoDocumento.equalsIgnoreCase("dni")) {
            if (numeroDocumento.length() == 8) {
                this.numeroDocumento = numeroDocumento;
            } else {
                System.out.println("Error el DNI debe tener 8 dígitos");
            }

        } else if (this.tipoDocumento.equalsIgnoreCase("ce")) {
            if (numeroDocumento.length() == 10) {
                this.numeroDocumento = numeroDocumento;
            } else {
                System.out.println("Error el CE debe tener 10 dígitos");
            }
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        
        if (edad < 0) {
            System.out.println("La edad no puede ser negativa");

        }
        this.edad = edad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCategoria() {
       if (edad <= 10) {
            return "Niño";
        } else if (edad <= 17) {
            return "Adolescente";
        } else {
            return "Adulto";
        }
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

   

//     private String nombres;
//    private String apellidoPaterno;
//    private String apellidoMaterno;
//    private String tipoDocumento;
//    private String numeroDocumento;
//    private int edad;
//     private String categoria;
//    private String celular;
//    private String correo;
    public void verDatos() {
        System.out.println("Nombres: " + this.nombres);
        System.out.println("Apellido Paterno: " + this.apellidoPaterno);
        System.out.println("Apellido Materno: " + this.apellidoMaterno);
        System.out.println("Tpo de Documento: " + this.tipoDocumento);
        System.out.println("Numero de Documento: " + this.numeroDocumento);
        System.out.println("Edad: " + this.edad);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Celular: " + this.celular);
        System.out.println("Correo: " + this.correo);
    }

}
