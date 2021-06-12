package org.firstinspires.ftc.teamcode.HardwareTest.mechanisms;


import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ServoOnly {

    private Servo servo;

    public void init(HardwareMap hwMap) {
        servo = hwMap.get(Servo.class, "servo");
    }

    public void setServoPosition(double position) {
        servo.setPosition(position);
    }

}
