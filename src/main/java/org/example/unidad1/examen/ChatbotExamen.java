import java.util.Scanner;


abstract class Chat {
    protected Scanner sc = new Scanner(System.in);

    public abstract void responder();
}

class ChatVentas extends Chat {

    @Override
    public void responder() {
        int opcion;

        do {
            System.out.println("\n--- CHAT DE VENTAS ---");
            System.out.println("1. Ver productos");
            System.out.println("2. Ver promociones");
            System.out.println("3. Hablar con asesor");
            System.out.println("0. Regresar al menú principal");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tenemos laptops, celulares y accesorios.");
                    break;
                case 2:
                    System.out.println("Descuentos del 20% en productos seleccionados.");
                    break;
                case 3:
                    System.out.println("Un asesor se comunicará contigo pronto.");
                    break;
                case 0:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}


class ChatSoporte extends Chat {

    @Override
    public void responder() {
        int opcion;

        do {
            System.out.println("\n--- SOPORTE TÉCNICO ---");
            System.out.println("1. Problemas con el sistema");
            System.out.println("2. Recuperar contraseña");
            System.out.println("3. Contactar técnico");
            System.out.println("0. Regresar al menú principal");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Intenta reiniciar el sistema.");
                    break;
                case 2:
                    System.out.println("Se ha enviado un enlace a tu correo.");
                    break;
                case 3:
                    System.out.println("Un técnico te contactará en breve.");
                    break;
                case 0:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Chat chat;

        int opcion;

        do {
            System.out.println("\n=== CHATBOT PRINCIPAL ===");
            System.out.println("1. Ventas");
            System.out.println("2. Soporte técnico");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    chat = new ChatVentas();
                    chat.responder();
                    break;

                case 2:
                    chat = new ChatSoporte();
                    chat.responder();
                    break;

                case 0:
                    System.out.println("Gracias por usar el chatbot.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}