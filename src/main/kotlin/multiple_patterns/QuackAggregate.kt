package multiple_patterns

/**
 * 오리 꽥꽥이 집합 - Quackable을 구현하고, Quackable을 집합으로 묶어서 관리하는 클래스
 * Composite 패턴 + Iterator 패턴
 *
 * */
class QuackAggregate() : Quackable {

    private val quackers: MutableList<Quackable> = mutableListOf()

    override fun quack() {
        quackers.forEach { it.quack() }
    }

    fun add(quackable: Quackable) {
        quackers.add(quackable)
    }
}