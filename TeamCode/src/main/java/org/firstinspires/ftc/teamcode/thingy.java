package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "thingy")
public class thingy extends OpMode {
    DcMotor motor;
    DcMotor motor2;

    @Override
    public void init() {
        motor = hardwareMap.get(DcMotor.class, "right_frontAsDcMotor");
        motor2 = hardwareMap.get(DcMotor.class, "right_backAsDcMotor");
    }

    public void loop() {
        motor.setPower(-0.5);
        motor.setPower(0.5);

    }
}
