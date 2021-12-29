package adapter

class SearchButton(private val _myProgram: MyProgram) {
    private var searchStrategy: SearchStrategy = SearchStratagyAll()
    fun setSearchStrategy(_searchStrategy: SearchStrategy){
        searchStrategy = _searchStrategy
    }
    fun onClick(){
        searchStrategy.search()
    }
}