// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.subsystems.DrivingSubsystem;

public class MovmentCommand extends CommandBase {
  DrivingSubsystem drivingSubsystem;
  private Supplier<Double> driveX;
  private Supplier<Double> driveY;
  private Supplier<Double> rotate;

  /** Creates a new movment. */
  public MovmentCommand(DrivingSubsystem dSubsystem, Supplier<Double> driveX, Supplier<Double> driveY ,Supplier<Double> rot) {
    this.drivingSubsystem = dSubsystem;
    this.rotate = rot;
    this.driveX = driveX;
    this.driveY = driveY;
    addRequirements(drivingSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    drivingSubsystem.stop();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivingSubsystem.drive(0.5*driveX.get(), 0.5*driveY.get(), 0.5*rotate.get() );
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drivingSubsystem.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
