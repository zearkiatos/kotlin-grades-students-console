import models.*

fun main(args: Array<String>) {
    var course = Class("Mobiles")
    var studentsList =
            listOf(
                    Student("Luis", "Aragones", 1),
                    Student("Fernando", "Hierro", 2),
                    Student("Raul", "Gonzalez", 3),
                    Student("Fernando", "Morientes", 4)
            )
    course.enrollStudent(studentsList)
    course.rate(
            hashMapOf(
                    1 to Grade(3.5, 0.3),
                    2 to Grade(4.0, 0.3),
                    3 to Grade(4.5, 0.3),
                    4 to Grade(4.6, 0.3)
            )
    )
    course.rate(
            hashMapOf(
                    1 to Grade(4.0, 0.3),
                    2 to Grade(5.0, 0.3),
                    3 to Grade(4.2, 0.3),
                    4 to Grade(4.8, 0.3)
            )
    )
    course.rate(
            hashMapOf(
                    1 to Grade(4.0, 0.3),
                    2 to Grade(5.0, 0.3),
                    3 to Grade(4.3, 0.3),
                    4 to Grade(5.0, 0.3)
            )
    )
    course.rate(
            hashMapOf(
                    1 to Grade(5.0, 0.1),
                    2 to Grade(4.4, 0.1),
                    3 to Grade(4.0, 0.1),
                    4 to Grade(5.0, 0.1)
            )
    )
    println(course.getAverageGrade())
}
