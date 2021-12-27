package singleton

fun main() {
    FirstPage().setAndPrintSettings() // settings에 값을 넣고 출력
    SecondPage().printSettings() // settings 출력하면 위에서 값 넣었던 그 settings 인스턴스를 출력한다.
}
