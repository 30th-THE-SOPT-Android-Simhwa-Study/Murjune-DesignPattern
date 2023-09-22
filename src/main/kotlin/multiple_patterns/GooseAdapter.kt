package multiple_patterns

import multiple_patterns.Goose
/**
 * GooseAdapter는 goose를 Quackable(오리의 행동)로 변환한다.
 * */
class GooseAdapter(private val goose: Goose) : Quackable {
    override fun quack() {
        goose.honk()
    }
}