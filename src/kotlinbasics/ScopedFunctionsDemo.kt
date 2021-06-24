package kotlinbasics


import kotlinbasics.Person.Companion.SCOPED_FUNCTION

class Person() {
    companion object{
        const val SCOPED_FUNCTION = 6
    }
    var name: String = "Abcd"
    var contactNumber: String = "1234567890"
    var address: String = "xyz"
    val age : Int = 25
    fun displayInfo()  = print("\n Name: $name\n " +
            "Contact Number: $contactNumber\n " +
            "Address: $address")

}

fun main(arg : Array<String>){


    val person=Person()

    val c = getTime()

   /* val letScope = person.let {
        it.name= "Aj"
        //print("letScope :${it.name}, ${it.address}")
        0
    }

    print("letScope :${letScope.name}")*/

  /*  val runScope =person?.let {
        1
    }.run {

    }*/


   // print("runScope : $runScope")
   /* val apyScope =person?.apply {
        this.name= "Vivek"
        print("ApplyScope :${this.name}, ${this.address}")
        //person
    }*/

   // print("runScope : $apyScope")

    /*val apyScope =person?.also {
        this.name= "Vivek"
        print("ApplyScope :${this.name}, ${this.address}")
        //person
    }*/

    val runScope =person.run {
        name= "Vivek"
        print("runScope :$name, $address")
        //person
    }

   /*val withScope  = with(person){
             this?.name= "Ajay"
    }
    val alsoScope  =person.also{

    }*/





}

fun getTime(): Long {
    return System.currentTimeMillis()
}
