package com.patrones.estructurales.TallerAdapter;

public class AnalysisLibrary {
    public void analyze(IJSONData jsonData) {
        String json = jsonData.getJSON();
        // Análisis de datos en formato JSON
        System.out.println("Analizando datos JSON: " + json);
    }
}
