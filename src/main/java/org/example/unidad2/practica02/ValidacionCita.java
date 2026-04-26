package org.example.unidad2.practica02;


public class ValidacionCita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa la hora de la cita (0-23): ");
            int hora = sc.nextInt();

            System.out.print("Ingresa el día de la semana: ");
            String dia = sc.next();

                // Validación con if-else anidados
                if (hora >= 9 && hora <= 17) {
                    if (!dia.equalsIgnoreCase("sabado") && !dia.equalsIgnoreCase("domingo")) {
                        System.out.println("Cita agendada con éxito");
                    } else {
                        System.out.println("Error: No se atiende fines de semana");
                    }
                } else {
                    System.out.println("Error: Hora fuera de horario laboral");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido para la hora");
            }
        }
    }
}
