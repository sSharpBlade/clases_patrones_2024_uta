package com.lopez.edwin.Dependencia;

public class ButtonSwitch {
    private IElectronicDevices electronicDevices;

    public ButtonSwitch(IElectronicDevices electronicDevices) {
        this.electronicDevices = electronicDevices;
    }

    public void press(boolean press) {
        if (press) {
            electronicDevices.on();
        } else {
            electronicDevices.off();
        }
    }

}
