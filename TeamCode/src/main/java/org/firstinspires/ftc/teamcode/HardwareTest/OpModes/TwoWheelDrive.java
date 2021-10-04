package org.firstinspires.ftc.teamcode.HardwareTest.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.HardwareTest.mechanisms.TwoDriveMotors;

//@TeleOp
public class TwoWheelDrive extends OpMode {

    TwoDriveMotors board = new TwoDriveMotors();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        double leftPosition = gamepad1.left_stick_y;
        double rightPosition = gamepad1.right_stick_y;

        board.setLeftMotorSpeed(leftPosition);
        board.setRightMotorSpeed(rightPosition);
    }
}
