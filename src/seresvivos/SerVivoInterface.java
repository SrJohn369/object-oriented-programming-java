package src.seresvivos;

import src.objeto.Comida;

// Interface e Agregação
interface SerVivoInterface {
    void comer(Comida comida);
    void beberAgua();
    void fazerNecessidades(int numNecessidade);
    void fazerSom();
}