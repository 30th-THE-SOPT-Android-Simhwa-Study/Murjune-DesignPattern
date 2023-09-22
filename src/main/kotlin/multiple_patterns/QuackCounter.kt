package multiple_patterns

/**
 * 기존의 오리에 새로운 기능을 추가하기 위해 데코레이터 패턴을 사용한다.
 *
 * 1) QuackCounter은 Quackable을 구현한 Wrapper 클래스이다.
 * 2) 오리가 몇 번 울었는지를 세는 기능을 추가한다.
 *
 * */
class QuackCounter(private val duck: Quackable) : Quackable {

    override fun quack() {
        duck.quack()
        numberOfQuacks++
    }

    companion object {
        var numberOfQuacks = 0
            private set
    }
}