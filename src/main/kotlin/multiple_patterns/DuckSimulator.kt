package multiple_patterns

class DuckSimulator {
    fun simulate() {
        val mallardDuck = MallardDuck()
        val redHeadDuck = RedHeadDuck()
        val duckCall = DuckCall()
        val rubberDuck = RubberDuck()

        println("오리 시뮬레이션 게임")

        simulate(mallardDuck)
        simulate(redHeadDuck)
        simulate(duckCall)
        simulate(rubberDuck)
    }

    private fun simulate(duck: Quackable) {
        duck.quack()
    }
}

fun main() {
    val simulator = DuckSimulator()
    simulator.simulate()
}