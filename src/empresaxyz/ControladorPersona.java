/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaxyz;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ControladorPersona {

    ArrayList<Persona> lista = new ArrayList();

    public void agregarPersona(Persona nuevaPersona) {

        for (Persona persona : lista) {

            if (persona.getNumeroDocumento().equals(
                    nuevaPersona.getNumeroDocumento())) {

                System.out.println("El documento ya esta registrado.");
                return;
            }
        }

        lista.add(nuevaPersona);
        System.out.println("Persona registrada correctamente.");
    }

    public void listarPersonas() {
        System.out.println("La lista de personas es:");
        for (int i = 0; i < lista.size(); i++) {
            Persona p = lista.get(i);
            p.verDatos();
        }
    }
}
