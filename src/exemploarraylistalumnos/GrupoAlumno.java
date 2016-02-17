package exemploarraylistalumnos;

import java.util.ArrayList;

/**
 *
 * @author epastorizalorenzo
 */
public class GrupoAlumno {
    ArrayList<Alumno>lista = new ArrayList <Alumno>();
    public void crearLista(){
        Alumno alum1 = new Alumno("aa", 5);
        Alumno alum2 = new Alumno("bb", 2);
        Alumno alum3 = new Alumno("cc", 3);
        Alumno alum4 = new Alumno("dd", 2);
        lista.add(alum1);
        lista.add(alum2);
        lista.add(alum3);
        lista.add(alum4);
        alum1=alum3;
        lista.add(alum1);
    }
    public void verLista(){
        System.out.println(lista);
    }
    public void verIgual(){
        if(lista.get(1)==lista.get(2))
            System.out.println("****son iguais");
        else
            System.out.println("****son distintos");
            System.out.println("alumno1 :"+ lista.get(1).hashCode()+"alumno2"+lista.get(3).hashCode());
            System.out.println("alumno1 :"+ lista.get(4).hashCode()+"alumno2"+lista.get(2).hashCode());
    }
    public void engadirAlumno(Alumno Alm){
        lista.add(Alm);
    }
    
    }
    