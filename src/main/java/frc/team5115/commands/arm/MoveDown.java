package frc.team5115.commands.arm;

import edu.wpi.first.wpilibj.command.Command;

public class MoveDown extends Command {

    protected void initialize() {
        ArmLooper.addLevel(-1);
        ArmLooper.system.setState("Moving Down");
        System.out.println("command received up");
    }

    protected boolean isFinished(){ return true; }

}
