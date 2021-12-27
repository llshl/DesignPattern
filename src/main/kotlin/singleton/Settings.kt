package singleton

class Settings private constructor() {
    var darkMode = false
    var fontSize = 13

    companion object {
        private var settings: Settings? = null
        fun getSettings(): Settings {
            return settings ?: Settings().also {
                settings = it
            }
        }

    }
}