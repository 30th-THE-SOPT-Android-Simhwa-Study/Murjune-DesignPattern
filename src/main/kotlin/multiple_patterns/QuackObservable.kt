package multiple_patterns

interface QuackObservable {
    fun registerObserver(observer: Observer)
    fun notifyObservers()
}
