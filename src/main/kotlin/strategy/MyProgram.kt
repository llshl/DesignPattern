package strategy

class MyProgram {
    private val searchButton = SearchButton(this)
    fun setModeAll() {
        searchButton.setSearchStrategy(SearchStratagyAll())
    }

    fun setModeImage() {
        searchButton.setSearchStrategy(SearchStratagyImage())
    }

    fun setModeNews() {
        searchButton.setSearchStrategy(SearchStratagyNews())
    }

    fun setModeMap() {
        searchButton.setSearchStrategy(SearchStratagyMap())
    }

    fun testProgram() {
        searchButton.onClick() // "SEARCH ALL" 출력
        setModeImage() // 이미지검색 모드로
        searchButton.onClick() // "SEARCH IMAGE" 출력
        setModeNews() // 뉴스검색 모드로
        searchButton.onClick() // "SEARCH NEWS" 출력
        setModeMap() // 지도검색 모드로
        searchButton.onClick() // "SEARCH MAP" 출력
    }
}