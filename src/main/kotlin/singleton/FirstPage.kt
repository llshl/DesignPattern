package singleton

class FirstPage {
    private val settings: Settings = Settings.getSettings()
    fun setAndPrintSettings() {
        settings.darkMode = true
        settings.fontSize = 15
        println("${settings.darkMode} ${settings.fontSize}")
    }
}