package org.firstinspires.ftc.teamcode.HardwareTest.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.HardwareTest.mechanisms.PushButtonOnly;

//@TeleOp()
public class PushButtonTestOpMode extends OpMode {
    PushButtonOnly board = new PushButtonOnly();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        boolean state;
        state = board.getTouchSensorState();
        telemetry.addData("Touch Sensor State: ", state);
    }
}
