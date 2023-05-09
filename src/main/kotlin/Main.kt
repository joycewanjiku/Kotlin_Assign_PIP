import javax.print.attribute.standard.NumberUpSupported

fun main() {
    println(number(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)))
    println(number1(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)))
    var new=number2(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62))
    println(new)
    people()
    println(person("joyce","James","Jojo"))



//    println(number())
//    println(people())
//    println(number.sum())
//    println(number(.get[158]))
//    println(number.sortedeByDesending())

}

//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
fun number(numbers:Array<Int>):Int{
    var sum=numbers[1]+numbers[4]
    return sum

}

//(ii) prints out the index of 158 (1 point)
fun number1(numbers:Array<Int>):Int{
    return numbers.indexOf(158)

}

//(iii) prints out the elements in ascending order. (1 point)
fun number2(numbers:Array<Int>){
    var sortedNumber=numbers.sort()
    return sortedNumber
}
//2. Given a list of Person objects, each with the attributes, name,
// age, height, and weight. Sort the list in order of descending age (2 points)
data class  Person(var name:String,var age:Int,var height:Double,var weight:Double)

fun people(){
    val firstperson= Person("girl",20,158.5,56.5)
    val secondperson= Person("boy",15,150.3,45.6)
    val thirdperson= Person("man",13,140.5,56.5)
    val personList= listOf(firstperson,secondperson,thirdperson)
    val sortedlist=personList.sortedByDescending { it.age }
    println(sortedlist)

}
//
//3. Create a function that takes in 3 names and returns a string array
// containing all 3 names. (2 points)
fun person(name1:String,name2:String,name3:String):Array<String>{
    return arrayOf(name1,name2,name3)


}

//
//4. Write a function that takes in a list of Car objects each with a registration and mileage
// attribute and returns the average mileage of all the vehicles in the list. (3 points)
fun car(regestration:String,mileage:Double ){
    var van=

}