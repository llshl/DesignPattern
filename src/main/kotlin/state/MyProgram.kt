package state

fun main(){
    val modeSwitch: ModeSwitch = ModeSwitch()
    modeSwitch.onSwitch() // "FROM LIGHT TO DARK" 출력
    modeSwitch.onSwitch() // "FROM DARK TO LIGHT" 출력
    modeSwitch.onSwitch() // "FROM LIGHT TO DARK" 출력
    modeSwitch.onSwitch() // "FROM DARK TO LIGHT" 출력
}