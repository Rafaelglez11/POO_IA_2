package main.java.unidad1.agenteia;

public class RobotTerrestre extends AgenteIA{


    public RobotTerrestre(int energiaInicial) {
        super(energiaInicial);
    }

    @Override
    public void moverse() {
        System.out.println("Moviendose a las coordenadas X: 280, Y: 56");
    }
}
