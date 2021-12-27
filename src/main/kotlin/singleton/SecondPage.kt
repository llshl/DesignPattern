package singleton

class SecondPage {
    private val settings = Settings.getSettings()
    fun printSettings(){
        println("${settings.darkMode} ${settings.fontSize}")
    }
}