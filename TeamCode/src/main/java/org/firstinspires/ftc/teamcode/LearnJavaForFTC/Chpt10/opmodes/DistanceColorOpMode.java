package org.firstinspires.ftc.teamcode.LearnJavaForFTC.Chpt10.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.LearnJavaForFTC.Chpt10.mechanisms.ProgrammingBoard7;

//@TeleOp
public class DistanceColorOpMode extends OpMode {
    private ProgrammingBoard7 board = new ProgrammingBoard7();


    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Amount Red:", board.getAmountRed());
        telemetry.addData("Distance (CM):", board.getDistance(DistanceUnit.CM));
        telemetry.addData("Distance (IN):", board.getDistance(DistanceUnit.INCH));
    }
}
