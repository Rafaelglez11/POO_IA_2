package org.example.unidad2.Practica04;

public class Main {
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Hub de sensores (Polimorfismo)
        List<SensorIA> percepcionHub = new ArrayList<>();

        // Instanciación de sensores
        percepcionHub.add(new SensorLidar("Lidar-X1", 15.5));
        percepcionHub.add(new SensorVision("Vision-Pro", 10.2));
        percepcionHub.add(new SensorUltrasonido("UltraSound-3000", 5.8));

        // Demostración de Polimorfismo
        for (SensorIA sensor : percepcionHub) {
            sensor.leerDatos(); // misma llamada, diferente comportamiento
        }
    }
}
