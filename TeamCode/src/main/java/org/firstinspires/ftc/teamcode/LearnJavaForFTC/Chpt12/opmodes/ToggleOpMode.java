package org.firstinspires.ftc.teamcode.LearnJavaForFTC.Chpt12.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.LearnJavaForFTC.Chpt11.mechanisms.ProgrammingBoard8;

//@TeleOp
public class ToggleOpMode extends OpMode {
    ProgrammingBoard8 board = new ProgrammingBoard8();
    boolean aAlreadyPressed;
    boolean motorOn;


    @Override
    public void init() {
        board.init(hardwareMap);
    }

    public void loop() {
        if(gamepad1.a && !aAlreadyPressed) {
            motorOn = !motorOn;
            telemetry.addData("Motor", motorOn);
            if (motorOn) {
                board.setMotorSpeed(0.5);
            } else {
                board.setMotorSpeed(0.0);
            }
        }
        aAlreadyPressed = gamepad1.a;
    }
}
