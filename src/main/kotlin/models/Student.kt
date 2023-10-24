package models

class Student constructor(firstName: String, lastName:String, id:Int) { 
        private val firstName :String;
          private val lastName :String;
    val id :Int;
    private val grades :MutableList<Grade>;

    init{
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grades = mutableListOf();
    }
    override fun toString() : String{
        return "(${id}) ${firstName} ${lastName}"
    }
    fun getAverage():Double{
        var sum = 0.0;
        for(grade in grades){
            sum+=grade.num*grade.weight
        }
        return sum
    }
    fun addGrade(grade: Grade){
        this.grades.add(grade)
    }
    
}