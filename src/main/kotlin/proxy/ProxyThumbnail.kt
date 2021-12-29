package proxy

class ProxyThumbnail(
    private val title: String,
    private val movieUrl: String,
    ): Thumbmail {
    private var realThumbnail: RealThumbnail? = null

    override fun showTitle() {
        println("제목: $title")
    }

    override fun showPreview() {
        realThumbnail?.showPreview() ?: RealThumbnail(title, movieUrl)
    }
}


