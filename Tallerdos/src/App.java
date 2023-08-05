import com.softlond.ejercicios.uno.Alumno;
import com.softlond.ejercicios.uno.sistemaAlumnos;

public class App {
    public static void main(String[] args) throws Exception {
        sistemaAlumnos sistema = new sistemaAlumnos();

        Alumno alumno1 = new Alumno("Miguel", 20);
        Alumno alumno2 = new Alumno("David", 22);

        sistema.agregarAlumno(alumno1);
        sistema.agregarAlumno(alumno2);

        sistema.asignarCalificacion("Miguel", 5);
        sistema.asignarCalificacion("Miguel", 3.5);
        sistema.asignarCalificacion("Miguel", 4.5);

        sistema.asignarCalificacion("David", 3.0);
        sistema.asignarCalificacion("David", 5.0);
        sistema.asignarCalificacion("David", 3.9);

        sistema.mostrarDetallesAlumnos();
    }
}
