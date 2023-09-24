package multiple_patterns

/**
 * 옵저빙 가능한 오리 wrapper
 * */
class Observable(private val duck: QuackObservable) : QuackObservable {

    /**
     * 옵저버 목록
     * */
    private val observers: MutableList<Observer> = mutableListOf()

    /**
     * 옵저버 등록
     * */
    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    /**
     * 옵저버 알림
     * */
    override fun notifyObservers() {
        observers.forEach { observer ->  observer.update(duck) }
    }
}