fun main(){
    val your = Animal("kamu", 0f, true, 10)
    your.info()
    
    
    val monyet = Animal("siapa", 2.3f, true, 23)
    monyet.info()
}


class Animal(nama: String, berat: Float, berbulu: Boolean){
    val name: String
    val weight: Float
    val company_Name : String
    val berbulu: Boolean
    var umur: Int? = null


    init{
        this.name = nama
        this.weight = if (berat <= 0) 0.1f else berat
        this.berbulu = berbulu
        this.company_Name = "The_Virtual_Bots"  
    }

    constructor(nama: String, berat: Float, berbulu: Boolean, umur: Int) : this(nama, berat, berbulu){
        this.umur = if (umur < 0) 0 else umur
    }


    fun info(){
        println("company Name :$company_Name \n  $nama: $name \nBerat: $weight \nBerbulu: $berbulu \nUmur: $umur")
    }
}
