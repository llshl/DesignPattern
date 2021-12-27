package strategy

interface SearchStrategy {
    fun search()
}

internal class SearchStratagyAll : SearchStrategy {
    override fun search() {
        println("SEARCH ALL")
        // 전체검색하는 코드
    }
}

internal class SearchStratagyImage : SearchStrategy {
    override fun search() {
        println("SEARCH IMAGE")
        // 이미지검색하는 코드
    }
}

internal class SearchStratagyNews : SearchStrategy {
    override fun search() {
        println("SEARCH NEWS")
        // 뉴스검색하는 코드
    }
}

internal class SearchStratagyMap : SearchStrategy {
    override fun search() {
        println("SEARCH MAP")
        // 지도검색하는 코드
    }
}