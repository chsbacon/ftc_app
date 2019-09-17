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
        double sinAngle;
        double cosAngle;
        boolean leftMotorBoole;
        boolean rightMotorBoole;
        boolean frontMotorBoole;
        boolean backMotorBoole;
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
            rightPos = (gamepad1.right_stick_x);
            /*
            robot.rightMotor.setPower(upDownPos);
            robot.leftMotor.setPower(-1*upDownPos);
            robot.backMotor.setPower(rightLeftPos);
            robot.frontMotor.setPower(-1*rightLeftPos);
            */
            //insert backend/frontend meme here
            leftMotorBoole = gamepad1.left_stick_x<0;
            rightMotorBoole = gamepad1.left_stick_x>0;
            frontMotorBoole = gamepad1.left_stick_y>0;
            backMotorBoole = gamepad1.left_stick_y<0;
            if (leftMotorBoole) robot.leftMotor.setPower(upDownPos);

            if (rightMotorBoole) robot.rightMotor.setPower(-1 * upDownPos);

            if (frontMotorBoole) robot.backMotor.setPower(rightLeftPos);

            if (backMotorBoole) robot.frontMotor.setPower(rightLeftPos);
            spinSpeed = (gamepad1.right_stick_x);


        }
    }

}
