package com.patrones.creacionales.FactoryMethod;

import java.util.HashMap;
import java.util.Map;

public class PasteleriaEL implements IPasteleria {
    /*
     * Define una interfaz para la creación de un objeto, pero deja que la
     * subclase, es decir l clase que implementa la interfaz decida que clase
     * instancia
     */

    private Map<String, Pastel> pastelMap;

    public PasteleriaEL() {
        pastelMap = new HashMap<>();
        pastelMap.put("Chocolate", new Pastel(12, "Chocolate"));
        pastelMap.put("Vainilla", new Pastel(8, "Vainilla"));
        pastelMap.put("Limon", new Pastel(6, "Limon"));
        pastelMap.put("Rellena", new PastelRelleno(8, "Rellena"));
    }

    @Override
    public Pastel prepararPastel(String tipoSabor) {
        return pastelMap.get(tipoSabor);
    }

}
