package state

internal class ModeStateLight : ModeState{
    override fun toggle(modeSwitch: ModeSwitch) {
        println("FROM LIGHT TO DARK")
        modeSwitch.setState(ModeStateDark())
    }
}
