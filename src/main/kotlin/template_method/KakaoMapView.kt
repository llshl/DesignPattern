package template_method

class KakaoMapView : MapView() {
    override fun connectMapServer() {
        println("카카오 지도 서버에 연결")
    }

    override fun showMapOnScreen() {
        println("카카오 지도를 보여줌")
    }

    override fun moveToCurrentLocation() {
        println("카카오 지도에서 현 좌표로 이동")
    }
}