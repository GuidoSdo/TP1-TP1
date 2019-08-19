package ejercicio1;

import java.util.ArrayList;

/**
 * Representa al grupo de trabajos practicos y sus integrantes.
 */
public class Grupo {
    private String nombre;
    private ArrayList<String> intengrantes;

    /**
     * Constructor inicializador
     *
     * @param nombre
     */
    public Grupo(String nombre) {
        this.nombre = nombre;
        this.intengrantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cantidad actual de integrantes del grupo
     *
     * @return
     */
    public int getCantidadIntegrantes() {
        return this.intengrantes.size();
    }

    /**
     * Agrega al grupo el nombre de un nuevo integrante, siempre y vuando éste no haya sido cargado con anterioridad.
     *
     * @param nombreIntegrante nombre del nuevo integrante del grupo
     */
    public void agregarIntegrante(String nombreIntegrante) {

        if (this.intengrantes.size() > 0) {
            if (validarIntegrante(nombreIntegrante)) {
                this.intengrantes.add(nombreIntegrante);
                mensajeAgregarIntegranteExistoso(nombreIntegrante);
            }
        } else {
            intengrantes.add(nombreIntegrante);
            mensajeAgregarIntegranteExistoso(nombreIntegrante);
        }
    }

    private void mensajeAgregarIntegranteExistoso(String nombreIntegrante) {
        System.out.println(nombreIntegrante + " fue asignado al grupo: " + this.nombre);
    }

    private int obtenerPosicionIntegrante(String nombreIntegrante) {
        /**
         * Devuelve la posición en el grupo del integrante cuyo nombre se ha recibido por
         * parámetro. En caso de no encontrarlo devolverá -1.
         */
        int i = 0;
        boolean encontrado = true;
        int posicion = -1;
        while (i < intengrantes.size() && encontrado) {
            if (intengrantes.get(i).equals(nombreIntegrante)) {
                posicion = i;
                encontrado = false;
            } else {
                i++;
            }
        }
        return posicion;
    }

    /**
     * Recibe un valor entero que representa la posición del integrante en la lista
     * y devuelve el integrante guardado dentro de la colección de integrantes.
     *
     * @param posicion posicion del integrante
     * @return integrante
     */
    public String obtenerIntegrante(int posicion) {
        int posicionReal = posicion - 1;
        String integrante = null;
        if (posicionReal >= 0) {
            integrante = intengrantes.get(posicionReal);

        } else {
            System.out.println("La posicion debe ser entero igual o mayor que 1");
        }
        return integrante;

    }

    /**
     * Busca al integrante del grupo cuyo nombre coincida con el parámetro de
     * entrada. En caso de que haya coincidencia, lo devuelve; caso contrario, el
     * método devolverá null
     *
     * @param nombre
     * @return
     */
    public String buscarIntegrante(String nombre) {
        boolean encontrado = true;
        int i = 0;
        String[] palabras = nombre.split("\\s+");
        // TODO: Importante investigar
        // Split: Divide esta cadena alrededor de coincidencias de la expresión regular dada.
        // \\s+ : cuantificador de expresion regular
        // Documentacion: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
        String integranteEncontrado = null;

        while (i < this.intengrantes.size() && encontrado) {
            String integrante = this.intengrantes.get(i);
            for (String palabra : palabras) {
                if (integrante.contains(palabra)) {
                    integranteEncontrado = integrante;
                    encontrado = false;
                } else {
                    i++;
                }
            }
        }

        return integranteEncontrado;
    }

    /**
     * Remueve de la colección de integrantes a aquel cuyo nombre coincide con el
     * nombre recibido como parámetro. Si lo encontró, luego de removerlo debe
     * devolverlo con return, y si no debe devolver null.
     *
     * @param nombreIntegrante integrante a borrar
     * @return integrante borrado
     */
    public String removerIntegrante(String nombreIntegrante) {
        boolean encontrado = true;
        int i = 0;
        String integranteBorrado = null;

        while (i < intengrantes.size() && encontrado) {
            String integranteABorrar = intengrantes.get(i);
            //TODO: Cuando usar equals o contains en estos casos? Investigar
            if (integranteABorrar.equals(nombreIntegrante)) {
                this.intengrantes.remove(integranteABorrar);
                integranteBorrado = integranteABorrar;
                encontrado = false;
            } else {
                i++;
            }
        }
        return integranteBorrado;
    }

    private boolean validarIntegrante(String nombreIntegrante) {
        int i = 0;
        boolean agregado = true;
        while (i < intengrantes.size() && agregado) {
            if (intengrantes.get(i).equals(nombreIntegrante)) {
                System.out.println("Ya existe ese integrante");
                agregado = false;
            } else {
                i++;
            }
        }
        return agregado;
    }

    private void mostrarIntegrantes() {
        /**
         * Muestra por consola la cantidad de integrantes y los nombres de cada uno de ellos.
         */
        System.out.println("Cantidad de integrantes: " + getCantidadIntegrantes());
        for (int i = 0; i < intengrantes.size(); i++) {
            System.out.println("Integrante n° " + i + ", nombre: " + intengrantes.get(i));
        }
    }

    /**
     * Muestra por consola el nombre del grupo, la cantidad de integrantes y el
     * nombre de cada uno de ellos.
     */
    public void mostrar() {
        System.out.println(this.nombre);
        mostrarIntegrantes();
    }

    /**
     * Elimina todos los elementos de la lista de integrantes.
     */
    public void vaciar() {
        this.intengrantes.clear();
    }


}
