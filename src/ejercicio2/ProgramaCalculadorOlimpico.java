package ejercicio2;

import java.util.ArrayList;

public class ProgramaCalculadorOlimpico {

    ArrayList<Atleta> atletas;
    String[] ganadores;

    public ProgramaCalculadorOlimpico() {
        ganadores = new String[3];
    }

    public void agregarAtleta(String nombreAtleta, TipoEspecialidad especialidad, float segundosRecorridos) {
        if (this.atletas.size() > 0) {
            if (isValidarAtleta(nombreAtleta)) {
                this.atletas.add(new Atleta(nombreAtleta,especialidad, segundosRecorridos));
            }
        } else {
            this.atletas.add(new Atleta(nombreAtleta,especialidad, segundosRecorridos));
        }
    }

    private boolean isValidarAtleta(String nombreAtleta) {
        int i = 0;
        boolean agregado = true;
        while (i < atletas.size() && agregado) {
            if (atletas.get(i).equals(nombreAtleta)) {
                System.out.println("Ya existe el atleta");
                agregado = false;
            } else {
                i++;
            }
        }
        return agregado;
    }

    public void quienGano(TipoEspecialidad especialidad){
        String primerPuesto;
        int maxGanadores = 3;
        float tiempoMayor = 0;
        //TODO:
        // validar quien gano
        // guardar solo los primeros tres ganadores solamente
        // Pueden empatar en cualquiera de las posicines dadas.

            for (int i = 0; i < this.atletas.size(); i++) {


            if(this.atletas.get(i).getEspecialidad().equals(especialidad)){
                if(this.atletas.get(i).getSegundosRecoridos() > tiempoMayor){
                ganadores[0] = this.atletas.get(i).getNombre();
                tiempoMayor = this.atletas.get(i).getSegundosRecoridos();
                }
                else {
                    if(this.atletas.get(i).getSegundosRecoridos() == tiempoMayor)
                    ganadores[1] = this.atletas.get(i).getNombre();

                }

            }
        }
    }

}


