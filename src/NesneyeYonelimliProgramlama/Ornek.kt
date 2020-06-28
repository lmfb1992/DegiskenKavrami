package NesneyeYonelimliProgramlama

class Student(var name : String = "Student",var age : Int = 99){
    init {
        if (name=="Student"){
            name = "NA"
            age =0
        }
        else{
            name = name.toUpperCase()

        }

        println("$name")
        println("$age")

    }



}


fun main() {

    val stu = Student("Chaitanya", 31)
    val stu2 = Student("Chaitanya")
    val stu3 = Student()

}