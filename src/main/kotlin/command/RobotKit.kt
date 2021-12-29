package command

class RobotKit {
    private val robot = Robot()
    private var commands = mutableListOf<Command>()

    fun addCommand(command: Command){
        commands.add(command)
    }
    fun start(){
        for (command: Command in commands){
            command.setRobot(robot)
            command.execute()
        }
    }
}