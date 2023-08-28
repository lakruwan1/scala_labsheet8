object Q01 {
  val interest = (deposit: Double) => {
    if (deposit <= 20000) deposit*0.02
    else if (deposit <= 200000) deposit*0.04
    else if (deposit <= 2000000) deposit*0.035
    else deposit*0.065
  } 

  def main(args: Array[String]): Unit = {
    print("Enter the deposit amount : ")
    val deposit = scala.io.StdIn.readDouble()
    if (deposit < 0) {
      println("Invalid deposit amount.")
      return
    }

    println(s"Interest : ${interest(deposit)}")
  }
}
