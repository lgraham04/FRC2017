package frc.team3863.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team3863.robot.commands.Drive;
import frc.team3863.robot.subsystems.Drivetrain;
import frc.team3863.robot.subsystems.Shooter;
import lib.util.CheesyDriveHelper;

public class Robot extends IterativeRobot {
    public static final CheesyDriveHelper cheesyDriveHelper = new CheesyDriveHelper();
    public static final Drivetrain drivetrain = new Drivetrain();
    public static final OI oi = new OI();
    public static final Shooter shooter = new Shooter();
    @Override
    public void robotInit() {

    }

    @Override
    public void disabledInit() {

    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void teleopInit() {
    }

    @Override
    public void testInit() { }


    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() { }

    @Override
    public void testPeriodic() { }
}