package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.GTADriveCommand;
import frc.robot.subsystems.DriveTrain;


public class RobotContainer {

  public static DriveTrain driveTrain         = new DriveTrain();
  public static XboxController xboxController = new XboxController(0);

  public RobotContainer() {
    configureButtonBindings();
    driveTrain.setDefaultCommand(new GTADriveCommand(driveTrain, xboxController));
  }


  private void configureButtonBindings() {

  }


  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
