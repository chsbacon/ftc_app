package org.firstinspires.ftc.teamcode.Teleops;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.HoloHardwareClass;
//TODO make a rotation ability
// TODO run using encoders,
//TODO put function in hardware class
@TeleOp(name = "David's New and Improved Holonomic Robot", group = "Holo")

public class HoloDrive extends LinearOpMode{
    HoloHardwareClass robot = new HoloHardwareClass();

    @Override
    public void runOpMode(){
        //initialize the robot
        robot.init(hardwareMap);
        float spinSpeed;
        float rightLeftPos;
        float upDownPos;
        float rightPos;
        float leftPower;
        float rightPower;
        float frontPower;
        float backPower;
        int frontPos;
        //tell the phones you are ready
        telemetry.addLine("Ready to Run!");
        telemetry.update();
        robot.backMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.frontMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        waitForStart();
        while(opModeIsActive()){
            //get the position from the joysticks
            rightLeftPos  = (gamepad1.left_stick_x)*9/10;
            upDownPos = (gamepad1.left_stick_y)*9/10;
            spinAdjust = (gamepad1.right_stick_x)/10;
            //Add the direction and the spin amount to get drive
            rightPower = upDownPos+spinAdjust;
            leftPower = spinAdjust-upDownPos;
            frontPower = rightLeftPos+spinAdjust;
            backPower = spinAdjust-rightLeftPos;
            //set the power to the motor
            robot.rightMotor.setPower(rightPower);
            robot.leftMotor.setPower(leftPower);
            robot.backMotor.setPower(backPower);
            robot.frontMotor.setPower(frontPower);
            
            frontPos = frontMotor.getCurrentPosition();
            telemetry.addData("Front Position"+frontPos);


        }
    }

}
