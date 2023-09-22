package multiple_patterns


/**
 * 데코레이터 패턴을 쓸 때, 객체를 제대로(실수 없이) 포장하기 위해 추상 팩토리 패턴을 사용 한다.
 * - 추상 팩토리 패턴을 사용하면, 객체 포장을 추상화 할 수 있다.
 * - 솔직히 이 경우는 추상 팩토리 패턴을 사용하지 않아도 된다고 생각한다 (너무 과하다)
 * 그러나, 클라이언트가 포장된 오리를 원하지 않은 경우 혹은 또 다른 오리 객체를 원할 경우 추상 팩토리 패턴을 통해
 * 동적으로 요구사항에 맞는 오리 객체를 생성할 수 있다.
 *
 * */
abstract class DuckFactory {

    abstract fun createMallardDuck(): Quackable

    abstract fun createRedHeadDuck(): Quackable

    abstract fun createDuckCall(): Quackable

    abstract fun createRubberDuck(): Quackable
}

/**
 * 추상 팩토리 패턴을 사용하여 데코레이터 패턴을 적용한 오리 객체를 생성한다.
 *
 * 팩토리를 사용하는 입장에서는 데코레이터 패턴을 적용한 오리 객체를 생성하는 것인지 모름
 * */
class CountingDuckFactory : DuckFactory() {
    override fun createMallardDuck(): Quackable = QuackCounter(MallardDuck())

    override fun createRedHeadDuck(): Quackable = QuackCounter(RedHeadDuck())

    override fun createDuckCall(): Quackable = QuackCounter(DuckCall())

    override fun createRubberDuck(): Quackable = QuackCounter(RubberDuck())
}