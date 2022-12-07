// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class GTADriveCommand extends CommandBase {
  
  DriveTrain driveTrain;
  XboxController xboxController;
  public GTADriveCommand(DriveTrain driveTrain, XboxController xboxController) {
  
    this.driveTrain = driveTrain;
    this.xboxController = xboxController;
  
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    DriveTrain.GTA_Drive(xboxController.getLeftTriggerAxis(), 
                          xboxController.getRightTriggerAxis(), 
                          xboxController.getLeftY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
