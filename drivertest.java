package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

public class driverTest{
  public static main void{
  if(gamepad1.left_stick_x > 0){
  telemetry.adddata("Left stick x is" + gamepad1.left_stick_x)
    }else{
    telemetry.adddata("You are not moving it sideways")
      }
      if(gamepad1.left_stick_y > 0){
      telemetry.adddata("Left stick  y is" + gamepad1.left_stick_y)
  }else{
    telemetry.adddata("You are net moving it up or down")
      }
    telemetry.update();
}
}
