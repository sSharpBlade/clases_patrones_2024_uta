package com.patrones.estructurales.TallerAdapter;

public class XMLToJSONAdapter implements IJSONData {
    private IXMLData xmlData;

    public XMLToJSONAdapter(IXMLData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public String getJSON() {
        String xml = xmlData.getXML();
        // Conversión básica de XML a JSON (simple y no robusta, solo para demostración)
        String json = convertXMLToJSON(xml);
        return json;
    }

    private String convertXMLToJSON(String xml) {
        // Conversión manual básica de XML a JSON para fines de demostración
        xml = xml.replace("<", "{\"").replace(">", "\":\"");
        xml = xml.replace("</", "\"}").replace("\">", "\",\"");
        xml = xml.replace("\":\"{", ":{").replace("\",\"}", "}");
        xml = xml.replace("\":\"{", ":").replace("\",\"", ",");
        return xml;
    }
}
