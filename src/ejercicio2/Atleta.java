package ejercicio2;

public class Atleta {
    private String nombre;
    private TipoEspecialidad especialidad;
    private float segundosRecoridos;


    public Atleta(String nombre, TipoEspecialidad especialidad, float segundosRecoridos) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.segundosRecoridos = segundosRecoridos;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoEspecialidad getEspecialidad() {
        return especialidad;
    }

    public float getSegundosRecoridos() {
        return segundosRecoridos;
    }
}
