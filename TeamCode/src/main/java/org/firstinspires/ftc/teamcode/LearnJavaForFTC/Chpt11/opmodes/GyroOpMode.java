package org.firstinspires.ftc.teamcode.LearnJavaForFTC.Chpt11.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.LearnJavaForFTC.Chpt11.mechanisms.ProgrammingBoard8;

@TeleOp
public class GyroOpMode extends OpMode {

    private ProgrammingBoard8 board = new ProgrammingBoard8();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Our Heading: ", board.getHeading(AngleUnit.DEGREES));
    }

}
