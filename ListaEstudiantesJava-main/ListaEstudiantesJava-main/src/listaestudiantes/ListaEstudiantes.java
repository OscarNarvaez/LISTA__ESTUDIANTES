/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaestudiantes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Oscar Julian Narvaez -- Carlos Alexander Burgos
 */
public class ListaEstudiantes {

    private File file;
    private ArrayList<Estudiante> estudiates;
    private int index;

    public ListaEstudiantes() {
        this.file = new File("estudiantes.obj");
        this.estudiates = new ArrayList<Estudiante>();
        this.index = 0;
        this.loadEstudiantes();
    }
    
    void loadEstudiantes() {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            this.estudiates = (ArrayList<Estudiante>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    void saveEstudiates() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this.estudiates);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

    Estudiante addEstudiante(Estudiante estudiante) {
        this.estudiates.add(estudiante);
        this.saveEstudiates();
        return this.getUltimoEstudiante();
    }

    Estudiante getPrimerEstudiante() {
        return this.getEstudiante(0);
    }

    Estudiante getSiguienteEstudiante() {
        return this.getEstudiante(this.index + 1);
    }

    Estudiante getAnteriorEstudiante() {
        return this.getEstudiante(this.index - 1);
    }

    Estudiante getUltimoEstudiante() {
        return this.getEstudiante(this.estudiates.size() - 1);
    }

    private Estudiante getEstudiante(int index) {
        if (index < 0 || index >= this.estudiates.size())
            return null;
        this.index = index;
        return this.estudiates.get(index);
    }

    private Estudiante getEstudiante() {
        return this.getEstudiante(this.index);
    }

    Estudiante updateEstudiante(Estudiante estudiante) {
        this.estudiates.set(this.index, estudiante);
        this.saveEstudiates();
        return this.getEstudiante();
    }

    Estudiante removeEsudiante(Estudiante estudiante) {
        if(this.estudiates.isEmpty()) return null;
        if (!estudiante.equals(this.getEstudiante())) {
            return this.getEstudiante();
        }
        this.estudiates.remove(this.index);
        
        this.saveEstudiates();

        if(this.index == 0) return this.getEstudiante();
        else return this.getAnteriorEstudiante();
    }
    
    ArrayList<Estudiante> getEstudiantes() {
        return this.estudiates;
    }
}