package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class HoloHardwareClass {
    //Define the hardware
    //for right now, just the motors
    public DcMotor frontMotor = null;
    public DcMotor backMotor = null;
    public DcMotor leftMotor = null;
    public DcMotor rightMotor = null;

    //Define the hardware map
    HardwareMap hardwareMap = null;

    //Constructor
    public HoloHardwareClass(){

    }

    //Main method
    public void init(HardwareMap ahwMap){
        //get the motors from the hardware map

        hardwareMap = ahwMap;
        frontMotor = hardwareMap.dcMotor.get("FM");
        backMotor = hardwareMap.dcMotor.get("BM");
        rightMotor = hardwareMap.dcMotor.get("RM");
        leftMotor = hardwareMap.dcMotor.get("LM");

        //set motors to 0
        frontMotor.setPower(0);
        backMotor.setPower(0);
        rightMotor.setPower(0);
        leftMotor.setPower(0);
    }

}
