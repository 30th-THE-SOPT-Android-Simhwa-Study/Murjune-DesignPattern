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

    /**
     * 모든 오리들의 관찰자를 등록한다.
     * */
    override fun registerObserver(observer: Observer) {
        quackers.forEach { quacker -> quacker.registerObserver(observer) }
    }

    /**
     * 어차피 오리들이 알아서 알림을 보낼 것이므로, 여기서는 아무것도 하지 않는다.
     * */
    override fun notifyObservers() {
        throw UnsupportedOperationException()
    }
}