package command

abstract class Command {
    internal var robot: Robot? = null
    fun setRobot(_robot: Robot?) {
        robot = _robot
    }

    abstract fun execute()
}

internal class MoveForwardCommand(var space: Int) : Command() {
    override fun execute() {
        robot!!.moveForward(space)
    }
}

internal class TurnCommand(var direction: Robot.Direction) : Command() {
    override fun execute() {
        robot!!.turn(direction)
    }
}

internal class PickupCommand : Command() {
    override fun execute() {
        robot!!.pickup()
    }
}