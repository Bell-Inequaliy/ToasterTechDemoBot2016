package org.usfirst.frc.team5332.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TalonSRX;

public class Intake {
	
	private TalonSRX intakeMotor;
	private Joystick joystick;
	
	public Intake(Joystick js){
		intakeMotor = new TalonSRX(0);
		joystick = js;
	}
	
	public void runPeriodic(){
		if(joystick.getRawButton(6)){
			intakeMotor.set(1);
		}else if(joystick.getRawButton(5)){
			intakeMotor.set(-1);
		}else{
			intakeMotor.set(0);
		}
	}
	
}