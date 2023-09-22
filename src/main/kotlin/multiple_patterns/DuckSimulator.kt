package multiple_patterns

class DuckSimulator {
    fun simulate() {
        val mallardDuck = MallardDuck()
        val redHeadDuck = RedHeadDuck()
        val duckCall = DuckCall()
        val rubberDuck = RubberDuck()
        // 거위 추가 : 거위 어뎁터를 사용해서 오리 자리에 거위가 들어 갈 수 있도록 함
        val gooseAdapter = GooseAdapter(Goose())
        println("오리 시뮬레이션 게임")

        simulate(mallardDuck)
        simulate(redHeadDuck)
        simulate(duckCall)
        simulate(rubberDuck)
        simulate(gooseAdapter)
    }

    private fun simulate(duck: Quackable) {
        duck.quack()
    }
}

fun main() {
    val simulator = DuckSimulator()
    simulator.simulate()
}