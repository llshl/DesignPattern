package template_method

class NaverMapView : MapView() {
    override fun connectMapServer() {
        println("네이버 지도 서버에 연결")
    }

    override fun showMapOnScreen() {
        println("네이버 지도를 보여줌")
    }

    override fun moveToCurrentLocation() {
        println("네이버 지도에서 현 좌표로 이동")
    }
}