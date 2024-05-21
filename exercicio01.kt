fun main() {
    val event1 = Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", "Evening", 15)
    println(event1.toString())
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: String,
    val duration: Int,
)

/* 

Resultado:
Event(title=Study Kotlin, description=Commit to studying Kotlin at least 15 minutes per day., daypart=Evening, duration=15)

*/