package org.firstinspires.ftc.teamcode.LearnJavaForFTC.Chpt4;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//@TeleOp
public class IfOpMode extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        if(gamepad1.left_stick_y < 0) {
            telemetry.addData("Left Stick", " is negative");
        }

        telemetry.addData("Left Stick y", gamepad1.left_stick_y);
    }
}
