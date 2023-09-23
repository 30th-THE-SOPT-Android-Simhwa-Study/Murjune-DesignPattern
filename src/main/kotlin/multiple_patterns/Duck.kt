package multiple_patterns

class MallardDuck : Quackable {
    // 구성을 통해 Quackable 객체가 오리를 관찰 가능하게 함 (Wrapper)
    private val observable: Observable = Observable(this)
    override fun quack() {
        println("꽥꽥")
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }
}

class RedHeadDuck : Quackable {
    private val observable: Observable = Observable(this)
    override fun quack() {
        println("꽥꽥")
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

}

class DuckCall : Quackable {
    private val observable: Observable = Observable(this)
    override fun quack() {
        println("꽉꽉")
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }
}

class RubberDuck : Quackable {
    private val observable: Observable = Observable(this)
    override fun quack() {
        println("삑삑")
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }
}

