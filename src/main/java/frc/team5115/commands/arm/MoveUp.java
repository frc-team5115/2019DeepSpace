package frc.team5115.commands.arm;

import edu.wpi.first.wpilibj.command.Command;

public class MoveUp extends Command {

    protected void initialize() {
        ArmLooper.addLevel(1);
        ArmLooper.system.setState("Moving Up");
    }

    protected boolean isFinished(){ return true; }

}