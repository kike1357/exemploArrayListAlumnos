package exemploarraylistalumnos;

import java.util.Objects;

/**
 *
 * @author epastorizalorenzo
 */
public class Alumno {

   private String nome; 
   private int nota;

    public Alumno(){}

    public Alumno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", nota=" + nota + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + this.nota;
        return hash;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return true;
        
        }
        }

    /*esta mal

   /* public int compareTo(Object o)(){
        Alumno obx = (Alumno)o;
        if(this.nome.comapreToIgnoreCase(obx.nome))==0            
                return 0;
        else
    }
    */
