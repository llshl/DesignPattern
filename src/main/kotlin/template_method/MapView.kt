package template_method

abstract class MapView {
    protected abstract fun connectMapServer()
    protected abstract fun showMapOnScreen()
    protected abstract fun moveToCurrentLocation()
    
    fun initMap() {
        connectMapServer()
        showMapOnScreen()
        moveToCurrentLocation()
    }
}
