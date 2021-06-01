package org.firstinspires.ftc.teamcode.LearnJavaForFTC.Chpt5;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class ClassMemberOpMode extends OpMode {
    boolean initDone;

    @Override
    public void init() {
        telemetry.addData("Init Done", initDone);
        initDone = true;
    }

    @Override
    public void loop() {
        telemetry.addData("init Done", initDone);
    }
}
