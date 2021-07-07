package org.firstinspires.ftc.teamcode.HardwareTest.mechanisms;


import com.qualcomm.hardware.rev.RevTouchSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class PushButtonOnly {

    private RevTouchSensor touchSensor;

    public void init(HardwareMap hwMap) {
        touchSensor = hwMap.get(RevTouchSensor.class, "touch_sensor");
    }

    public boolean getTouchSensorState() {

        return touchSensor.isPressed();
    }

}
