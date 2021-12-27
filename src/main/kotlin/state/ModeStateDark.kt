package state

internal class ModeStateDark : ModeState{
    override fun toggle(modeSwitch: ModeSwitch) {
        println("FROM DARK TO LIGHT")
        modeSwitch.setState(ModeStateLight())
    }
}