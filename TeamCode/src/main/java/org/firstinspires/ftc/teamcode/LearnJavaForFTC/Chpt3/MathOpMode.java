package org.firstinspires.ftc.teamcode.LearnJavaForFTC.Chpt3;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//@TeleOp
public class MathOpMode extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y / 2.0;
        telemetry.addData("left stick y", gamepad1.left_stick_y);
        telemetry.addData("SpeedForward", speedForward);
    }
}
