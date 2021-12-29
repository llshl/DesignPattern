package proxy

fun main(){
    val thumbnails = mutableListOf<Thumbmail>()

    thumbnails.add((ProxyThumbnail("Git 강좌", "/git.mp4")))
    thumbnails.add((ProxyThumbnail("RestAPI 강좌", "/rest.mp4")))
    thumbnails.add((ProxyThumbnail("도커 강좌", "/docker.mp4")))
    thumbnails.add((ProxyThumbnail("blockchain 강좌", "/blockchain.mp4")))

    // 썸네일은 그냥 보여줌
    for (thumbnail in thumbnails){
        thumbnail.showTitle()
    }

    // 프리뷰는 RealThumbnail을 이제서야 생성해서 보여줌
    println("===============================================")
    thumbnails.get(2).showPreview()
    thumbnails.get(2).showPreview()
    thumbnails.get(3).showPreview()
    thumbnails.get(1).showPreview()

}