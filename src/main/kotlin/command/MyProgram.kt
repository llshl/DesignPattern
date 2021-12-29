package command

fun main(){
    val robotKit = RobotKit()

    robotKit.addCommand(MoveForwardCommand(2))
    robotKit.addCommand(TurnCommand(Robot.Direction.LEFT))
    robotKit.addCommand(MoveForwardCommand(1))
    robotKit.addCommand(TurnCommand(Robot.Direction.RIGHT))
    robotKit.addCommand(PickupCommand())
    robotKit.start()
}