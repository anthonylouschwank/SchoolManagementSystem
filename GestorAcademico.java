import java.util.*;

public class GestorAcademico {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;
    private Map<String, Set<String>> inscripcionesPorCurso;

    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.inscripcionesPorCurso = new HashMap<>();
    }

    // Método para matricular un estudiante
    public void matricularEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
        }
    }

    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            inscripcionesPorCurso.put(curso.getId(), new HashSet<>());
        }
    }

    public void inscribirEstudianteCurso(Estudiante estudiante, String idCurso) throws EstudianteYaInscritoException {
        Set<String> inscritos = inscripcionesPorCurso.get(idCurso);
        if (inscritos != null && inscritos.contains(estudiante.getId())) {
            throw new EstudianteYaInscritoException("El estudiante ya está inscrito en este curso.");
        }
        inscritos.add(estudiante.getId());
    }

    public void desinscribirEstudianteCurso(String idEstudiante, String idCurso) throws EstudianteNoInscritoEnCursoException {
        Set<String> inscritos = inscripcionesPorCurso.get(idCurso);
        if (inscritos == null || !inscritos.contains(idEstudiante)) {
            throw new EstudianteNoInscritoEnCursoException("El estudiante no está inscrito en este curso o el ID del curso no es válido.");
        }
        inscritos.remove(idEstudiante);
    }
}

class EstudianteYaInscritoException extends Exception {
    public EstudianteYaInscritoException(String message) {
        super(message);
    }
}

class EstudianteNoInscritoEnCursoException extends Exception {
    public EstudianteNoInscritoEnCursoException(String message) {
        super(message);
    }
}

