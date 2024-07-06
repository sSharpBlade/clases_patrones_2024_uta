package com.patrones.estructurales;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.patrones.estructurales.TallerAdapter.AnalysisLibrary;
import com.patrones.estructurales.TallerAdapter.StockDataXML;
import com.patrones.estructurales.TallerAdapter.XMLToJSONAdapter;
import com.patrones.estructurales.TallerAdapter.IXMLData;
import com.patrones.estructurales.TallerAdapter.IJSONData;
import com.patrones.estructurales.adapter.AdaptadorDB;
import com.patrones.estructurales.adapter.ConexionMongoDB;
import com.patrones.estructurales.adapter.ConexionMySQL;
import com.patrones.estructurales.adapter.IConexionBD;

public class AdapterTest {

    @Test
    public void test1() {
        IConexionBD conexion = new ConexionMySQL();
        conexion.conexion();
        String resultado = conexion.ejecutarConsulta();
        System.out.println(resultado);
    }

    @Test
    public void test2() {
        IConexionBD conexionBD = new AdaptadorDB(new ConexionMongoDB());
        conexionBD.conexion();
        String res = conexionBD.ejecutarConsulta();
        System.out.println(res);
    }

    @Test
    public void TallerAdapterTest() {
        // Crear datos XML
        String xml = "<stock><name>ABC</name><price>100</price></stock>";
        IXMLData stockDataXML = new StockDataXML(xml);

        // Crear adaptador de XML a JSON
        IJSONData stockDataJSON = new XMLToJSONAdapter(stockDataXML);

        // Crear instancia de la biblioteca de análisis y pasarle los datos JSON
        AnalysisLibrary analysisLibrary = new AnalysisLibrary();
        analysisLibrary.analyze(stockDataJSON);

        // Verificar el JSON generado
        String expectedJSON = "{\"stock\":{\"name\":\"ABC\",\"price\":\"100\"}}";
        assertEquals(expectedJSON, stockDataJSON.getJSON());
    }
}
