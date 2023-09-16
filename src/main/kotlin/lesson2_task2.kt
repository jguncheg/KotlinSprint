fun main(){

    val worker = 50
    val salaryWorker = 30000

    val intern = 30
    val salaryIntern = 20000

    val totalSalaryWorker = worker * salaryWorker
    val totalSalaryIntern = intern * salaryIntern

    val allSalary = totalSalaryIntern + totalSalaryWorker
    val averageSalary = salaryIntern + salaryWorker / worker + intern

    println(totalSalaryWorker)
    println(allSalary)
    println(averageSalary)

}
