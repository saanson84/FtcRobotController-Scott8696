package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class HelloWorld extends OpMode {
  
  /*
  *   This method is called when the OpMode is initialized
  */
  @Override
  public void init() {
    telemetry.addData("Hello", "World");
  }
  
  /*
  *   This method does nothing while the OpMode is running.
  */
  @Override
  public void loop {
    
  }    
}
