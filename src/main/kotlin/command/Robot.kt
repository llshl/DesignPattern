package command

class Robot {
    enum class Direction {
        LEFT, RIGHT
    }

    fun moveForward(space: Int) {
        println("$space 칸 전진")
    }

    fun turn(_direction: Direction) {
        println(
            (if (_direction == Direction.LEFT) "왼쪽" else "오른쪽") + "으로 방향전환"
        )
    }

    fun pickup() {
        println("앞의 물건 집어들기")
    }
}