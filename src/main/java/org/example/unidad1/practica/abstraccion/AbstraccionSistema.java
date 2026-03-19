package main.java.unidad1.practica.abstraccion;


// 1. LA ABSTRACCIÓN
public abstract class AbstraccionSistema {

    protected String nombreModelo;
    protected double precision;

    public AbstraccionSistema (String nombre, double precision) {
        this.nombreModelo = nombre;
        this.precision = precision;

    }

    public String getNombre() { return nombreModelo; }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public abstract void analizar(String entrada);

}


// 2. LA IMPLEMENTACIÓN
class AnalizadorSentimientos extends AbstraccionSistema {

    public AnalizadorSentimientos() {
        super("Sentiment-BERT-Lite", 0.89);
    }

    @Override
    public void analizar(String texto) {
        System.out.println("--- Ejecutando Modelo: " + getNombre() + " ---");

        System.out.println("[INFO] Tokenizando texto...");
        System.out.println("[INFO] Extrayendo embeddings semánticos...");

        if (texto.toLowerCase().contains("feliz") || texto.toLowerCase().contains("bueno") || texto.toLowerCase().contains("bonito")
        || texto.toLowerCase().contains("genial") || texto.toLowerCase().contains("polluelo")) {
            System.out.println("RESULTADO: Sentimiento Positivo (Score: " + Math.random() + ")");
        } else {
            System.out.println("RESULTADO: Sentimiento Neutro o Negativo.");
        }
    }

}

// 3. EL USO
class Main{

    public static void main (String[] args){

        AbstraccionSistema modelo = new AnalizadorSentimientos();

        System.out.println("Sistema de IA Iniciado...");

        modelo.analizar("Hoy es un día muy bueno y estoy feliz");
        modelo.analizar("El servicio fue terrible");
        modelo.analizar("El baile no estuvo bueno");
        modelo.analizar("Que bonito regalo");
        modelo.analizar("Mira ese polluelo");
        modelo.analizar("Que triste tu vida");
        modelo.analizar("El esta feo");
        modelo.analizar("Tu cumpleaños estuvo aburrido");
    }

}