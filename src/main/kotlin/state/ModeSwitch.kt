package state

class ModeSwitch {
    private var modeState: ModeState = ModeStateLight()

    fun setState(_modeState: ModeState){
        modeState = _modeState
    }
    fun onSwitch() {
        modeState.toggle(this)
    }
}
