fun main() {
    val event1 = Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", Daypart.EVENING, 15)
    println(event1.toString())
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val duration: Int,
)

enum class Daypart {
    MORNING, AFTERNOON, EVENING,
}

/* 

Resultado:
Event(title=Study Kotlin, description=Commit to studying Kotlin at least 15 minutes per day., daypart=EVENING, duration=15)

*/