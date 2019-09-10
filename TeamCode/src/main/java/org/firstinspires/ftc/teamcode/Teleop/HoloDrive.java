package org.firstinspires.ftc.teamcode.Teleop;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.HoloHardwareClass;
import org.firstinspires.ftc.teamcode.LearningHardwareClass;
import org.firstinspires.ftc.teamcode.MasterHardwareClass;

@TeleOp(name = "Holonomic Robot", group = "Holo")

public class HoloDrive extends LinearOpMode{
    HoloHardwareClass robot = new HoloHardwareClass();

    @Override
    public void runOpMode(){
        //initialize the robot
        robot.init(hardwareMap);
        float rightLeftPos;
        float upDownPos;
        double sinAngle;
        double cosAngle;
        //tell the phones you are ready
        telemetry.addLine("Ready to Run!");
        telemetry.update();
        waitForStart();
        while(opModeIsActive()){
            /*PseudoCode
            find the
            assign to each motor
             */
            rightLeftPos  = (gamepad1.left_stick_x);
            upDownPos = (gamepad1.left_stick_y);

            robot.frontMotor.setPower(upDownPos);
            robot.backMotor.setPower(upDownPos);
            robot.leftMotor.setPower(rightLeftPos);
            robot.rightMotor.setPower(rightLeftPos);
        }
    }

}
