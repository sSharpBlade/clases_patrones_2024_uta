package com.patrones.estructurales.TallerAdapter;

public class StockDataXML implements IXMLData {
    private String xml;

    public StockDataXML(String xml) {
        this.xml = xml;
    }

    @Override
    public String getXML() {
        return xml;
    }
}
