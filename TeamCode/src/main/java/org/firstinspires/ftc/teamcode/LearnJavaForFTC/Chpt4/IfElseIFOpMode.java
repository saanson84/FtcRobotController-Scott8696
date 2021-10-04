package org.firstinspires.ftc.teamcode.LearnJavaForFTC.Chpt4;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.internal.camera.delegating.DelegatingCaptureSequence;

//@TeleOp
public class IfElseIFOpMode extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        if (gamepad1.left_stick_y < -0.5) {
            telemetry.addData("Left Stick Y", " is negative and large");
        } else if (gamepad1.left_stick_y < 0.0) {
            telemetry.addData("Left Stick Y", " is negative and small");
        } else if (gamepad1.left_stick_y < 0.5) {
            telemetry.addData("Left Stick Y", " is positive and small");
        } else {
            telemetry.addData("Left Stick Y", " is positive and large");
        }
        telemetry.addData("Left Stick Y", gamepad1.left_stick_y);
    }

}
