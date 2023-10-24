package models

class Class constructor(course: String) {
    private val course: String
    private val students: MutableList<Student> = mutableListOf()
    init {
        this.course = course
    }
    fun rate(grades: HashMap<Int, Grade>) {
        if (grades.size == students.size) {
            for (student in students) {
                student.addGrade(grades[student.id]!!)
            }
        }
    }
    fun enrollStudent(news: Collection<Student>) {
        students.addAll(news)
    }
    fun getAverageGrade(): String {
        var result = ""
        if (students.size > 0) {
            for (student in students) {
                result += "${student.toString()}: ${student.getAverage()}\n"
            }
        } else {
            result = "There are not students"
        }
        return result
    }
}
