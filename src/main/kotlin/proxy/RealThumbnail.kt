package proxy

class RealThumbnail(
    private val title: String,
    private val movieUrl: String): Thumbmail {

    init {
        println("${movieUrl}로부터 ${title}의 영상 데이터 다운")
    }
    override fun showTitle() {
        println("제목: $title")
    }

    override fun showPreview() {
        println("${title}의 프리뷰 재생")
    }
}