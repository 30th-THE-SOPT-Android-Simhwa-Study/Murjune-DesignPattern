package multiple_patterns

import multiple_patterns.Goose

/**
 * GooseAdapter는 goose를 Quackable(오리의 행동)로 변환한다.
 * */
class GooseAdapter(private val goose: Goose) : Quackable {
    private val observable: Observable = Observable(this)
    override fun quack() {
        goose.honk()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }
}