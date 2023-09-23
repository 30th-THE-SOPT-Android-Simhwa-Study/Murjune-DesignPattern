package multiple_patterns

class Quackologist: Observer {
    override fun update(duck: QuackObservable) {
        println("오리학자 : $duck 가 울었다!")
    }
}