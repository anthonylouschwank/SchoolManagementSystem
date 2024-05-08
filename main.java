public class main {
    public static void main(String[] args) {
        // Crear instancia de Universidad
        GestorAcademico universidad = new GestorAcademico();

        // Crear un estudiante y un curso
        Estudiante estudiante = new Estudiante("1", "Juan", "Pérez", "01/01/2000", "Activo");
        Curso curso = new Curso("101", "Introducción a la Programación", "Curso básico de programación en Java", 3, "2021");

        // Matricular al estudiante y agregar el curso a la universidad
        universidad.matricularEstudiante(estudiante);
        universidad.agregarCurso(curso);

        // Inscribir al estudiante en el curso
        try {
            universidad.inscribirEstudianteCurso(estudiante, curso.getId());
            System.out.println("Estudiante inscrito con éxito.");
        } catch (EstudianteYaInscritoException e) {
            System.out.println(e.getMessage());
        }

        // Intentar desinscribir al estudiante
        try {
            universidad.desinscribirEstudianteCurso(estudiante.getId(), curso.getId());
            System.out.println("Estudiante desinscrito con éxito.");
        } catch (EstudianteNoInscritoEnCursoException e) {
            System.out.println(e.getMessage());
        }

        // Intentar inscribir al estudiante de nuevo para verificar la excepción
        try {
            universidad.inscribirEstudianteCurso(estudiante, curso.getId());
            System.out.println("Estudiante inscrito nuevamente con éxito.");
        } catch (EstudianteYaInscritoException e) {
            System.out.println(e.getMessage());
        }
    }
}

