package multiple_patterns

class DuckSimulator {
    fun simulate(duckFactory: DuckFactory) {
        // QuackCounter는 Quackable을 구현한 클래스를 Wrapping하는 데코레이터이다.

        // duckFactory를 사용해서 오리를 생성한다.
        val mallardDuck = duckFactory.createMallardDuck()
        val redHeadDuck = duckFactory.createRedHeadDuck()
        val duckCall = duckFactory.createDuckCall()
        val rubberDuck = duckFactory.createRubberDuck()
        // 거위 추가 : 거위 어뎁터를 사용해서 오리 자리에 거위가 들어 갈 수 있도록 함
        val gooseAdapter = GooseAdapter(Goose())
        println("오리 시뮬레이션 게임")

        // 오리 집합을 생성한다.
        val quackAggregate = QuackAggregate().apply {
            add(mallardDuck)
            add(redHeadDuck)
            add(duckCall)
            add(rubberDuck)
            add(gooseAdapter)
        }
        // 오리 집합을 시뮬레이션 한다.
        simulate(quackAggregate)

        // 오리들이 울은 횟수를 출력한다.
        println("오리들이 울은 횟수 : ${QuackCounter.numberOfQuacks}")
    }

    private fun simulate(duck: Quackable) {
        duck.quack()
    }
}

fun main() {
    val simulator = DuckSimulator()
    // simulate() 메소드의 인자로 CountingDuckFactory를 넘겨준다.
    simulator.simulate(CountingDuckFactory())
}