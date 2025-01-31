package org.firstinspires.ftc.teamcode.LearnJavaForFTC.Chpt5;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//@TeleOp
public class UseRobotLocationOpMode extends OpMode {
    RobotLocation robotLocation = new RobotLocation(0);

    @Override
    public void init() {
        robotLocation.setAngle(0);
    }

    @Override
    public void loop() {
        if(gamepad1.a) {
            robotLocation.turn(0.1);
        }
        else if (gamepad1.b){
            robotLocation.turn(-0.1);
        }
        telemetry.addData("Location", robotLocation.toString());
        telemetry.addData("Heading", robotLocation.getHeading());
    }




}
