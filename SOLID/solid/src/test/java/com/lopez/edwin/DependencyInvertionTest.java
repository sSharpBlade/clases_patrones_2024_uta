package com.lopez.edwin;

import org.junit.Test;

import com.lopez.edwin.Dependencia.ButtonSwitch;
import com.lopez.edwin.Dependencia.Lamp;
import com.lopez.edwin.Dependencia.Television;

public class DependencyInvertionTest {
    @Test
    public void test1() {
        Lamp lamp = new Lamp();
        Television tv = new Television();
        ButtonSwitch ButtonSwitchLamp = new ButtonSwitch(lamp);
        ButtonSwitchLamp.press(true);

        ButtonSwitch ButtonSwitchTV = new ButtonSwitch(tv);
        ButtonSwitchTV.press(true);
    }
}
