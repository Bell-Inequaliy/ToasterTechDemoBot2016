package org.usfirst.frc.team5332.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TalonSRX;

public class Drive {
	
	private TalonSRX driveLeft1;
	private TalonSRX driveLeft2;
	private TalonSRX driveRight1;
	private TalonSRX driveRight2;
	private Joystick joystick;
	private double threshold;
	
	public Drive(Joystick js, double thresh){
		joystick = js;
		threshold = thresh;
		driveLeft1 = new TalonSRX(1);
		driveLeft2 = new TalonSRX(2);
		driveRight1 = new TalonSRX(5);
		driveRight2 = new TalonSRX(4);
	}
	
	public void runPeriodic(){
		double lv = 0;
		double rv = 0;
		
		if(Math.abs(joystick.getRawAxis(1))>threshold){
			if(joystick.getRawAxis(1)>0){
				lv = threshold;
			}else if(joystick.getRawAxis(1)<0){
				lv = -threshold;
			}
		}else{
			lv = joystick.getRawAxis(1);
		}
		
		if(Math.abs(joystick.getRawAxis(5))>threshold){
			if(joystick.getRawAxis(5)>0){
				rv = threshold;
			}else if(joystick.getRawAxis(5)<0){
				rv = -threshold;
			}
		}else{
			rv = joystick.getRawAxis(5);
		}
		
		setLeft(-lv);
		setRight(-rv);

	}
	
	private void setLeft(double speed){
		driveLeft1.set(-speed);
		driveLeft2.set(-speed);
	}
	
	private void setRight(double speed){
		driveRight1.set(-speed);
		driveRight2.set(speed);
	}
	
}
