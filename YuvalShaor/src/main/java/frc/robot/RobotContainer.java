// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.MovmentCommand;
import frc.robot.subsystems.DrivingSubsystem;
import frc.robot.subsystems.ExampleSubsystem;
import swervelib.SwerveDrive;
import swervelib.parser.SwerveDriveConfiguration;
import swervelib.parser.SwerveModuleConfiguration;
import swervelib.parser.SwerveParser;

import java.io.File;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.Filesystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  private final DrivingSubsystem drivingSubsystem = DrivingSubsystem.getInstance();
  private Joystick joystick = new Joystick(1);
  // Replace with CommandPS4Controller or CommandJoystick if needed
  private Joystick movementStick = new Joystick(0);

  private final MovmentCommand movement = new MovmentCommand(drivingSubsystem, () -> -movementStick.getX(), () -> movementStick.getY(), () -> movementStick.getZ());

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the trigger bindings
    drivingSubsystem.setDefaultCommand(movement);

    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be
   * created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with
   * an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for
   * {@link
   * CommandXboxController
   * Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or
   * {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    //
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`

  }

  private DrivingSubsystem createDrivingSubsystem() {
    SwerveModuleConfiguration smc = parseSwerveModuleConfiguration(new File("C:\\Users\\tamir\\Desktop\\YuvalShahor\\YuvalShaor\\src\\main\\java\\frc\\robot\\swerve\\swervedrive.json"));
    SwerveDriveConfiguration sdc = new SwerveDriveConfiguration(, null, false, null, null)
    DrivingSubsystem drivingSubsystem = new DrivingSubsystem();
}

}