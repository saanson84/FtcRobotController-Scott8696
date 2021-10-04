package org.firstinspires.ftc.teamcode.HardwareTest.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.HardwareTest.mechanisms.ServoOnly;

//@TeleOp()
public class ServoTestOpMode extends OpMode {
    ServoOnly board = new ServoOnly();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        double position;
        if(gamepad1.a) {
            position = 1.0;
        }
        else if (gamepad1.b)
        {
                position = 0.0;
        }
        else {
            position = 0.5;
        }
        board.setServoPosition(position);
        telemetry.addData("Servo Position", position);
    }
}
