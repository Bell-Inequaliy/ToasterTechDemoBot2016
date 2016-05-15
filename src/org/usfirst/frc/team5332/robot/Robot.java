
package org.usfirst.frc.team5332.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends IterativeRobot {
	
	Joystick js = new Joystick(0);
	Intake intake = new Intake(js);
	Drive drive = new Drive(js, 0.3);
	
    public void robotInit() {
    	
    }
    
    public void teleopPeriodic() {
        drive.runPeriodic();
        intake.runPeriodic();
    }
    
}
