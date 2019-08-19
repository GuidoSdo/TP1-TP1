import ejercicio1.Grupo;

public class Main {

    public static final String NUEVO_INTEGRANTE_TEST1 = "Guido Salcedo";
    public static final String NUEVO_INTEGRANTE_TEST2 = "Franco Perez";
    public static final String NUEVO_INTEGRANTE_TEST3 = "Raul Lopez";
    public static final String NOMBRE_GRUPO = "YA-TP1-12A";

    public static void main(String[] args) {

        // Ejercicio 1
        Grupo grupoTest = new Grupo(NOMBRE_GRUPO);
        grupoTest.agregarIntegrante(NUEVO_INTEGRANTE_TEST1);
        grupoTest.agregarIntegrante(NUEVO_INTEGRANTE_TEST2);
        grupoTest.agregarIntegrante(NUEVO_INTEGRANTE_TEST3);
        System.out.println("Cantidad de integrantes :" + grupoTest.getCantidadIntegrantes());
        String testBuscar = grupoTest.buscarIntegrante("Raul Lopez");
        System.out.println("Buscar integrante por " + testBuscar + ". Resultado: " + testBuscar);
        String integranteBorrar = grupoTest.removerIntegrante(NUEVO_INTEGRANTE_TEST3);
        System.out.println("Integrante borrado: " + integranteBorrar);
        System.out.println("Cantidad de integrantes :" + grupoTest.getCantidadIntegrantes());
        grupoTest.agregarIntegrante(NUEVO_INTEGRANTE_TEST1);
        System.out.println("Cantidad de integrantes :" + grupoTest.getCantidadIntegrantes());

        // Ejercicio 2

    }
}
