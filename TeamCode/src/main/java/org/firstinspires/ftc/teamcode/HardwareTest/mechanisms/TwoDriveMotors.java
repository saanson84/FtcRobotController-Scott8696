package org.firstinspires.ftc.teamcode.HardwareTest.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TwoDriveMotors {

    private DcMotor leftMotor;
    private DcMotor rightMotor;

    public void init(HardwareMap hwMap) {
        leftMotor = hwMap.get(DcMotor.class, "leftMotor");
        rightMotor = hwMap.get(DcMotor.class, "rightMotor");
        leftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftMotor.setDirection(DcMotor.Direction.FORWARD);
        rightMotor.setDirection(DcMotor.Direction.REVERSE);

    }

    public void setLeftMotorSpeed(double speed) {
        leftMotor.setPower(speed);
    }

    public void setRightMotorSpeed(double speed) {
        rightMotor.setPower(speed);
    }

}
