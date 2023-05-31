/*
Convert.kt
Write a small Kotlin command line application (Convert.kt) that allows
a user to convert between different forms of measurement. The program should:

1. Collect a numeric value from the user and store it in an appropriate variable
2. Collect the current unit of measurement
3. Determine the appropriate conversion (in either direction, i.e., the user can enter km or mi)
4. Display the new result
*/

fun main() {
    val kmToMiConversion = 0.621371

    print("Enter the numeric value you want converted: ")

    // Ask the user for a value and convert it to a Double
    // (a bit redundant but you won't lose marks for over commenting in this course)
    // Scanner if preferred here but readLine() is fine for this course
    val stringInput = readLine()
    // If you want to add a try/catch (or alternative) here to ensure stringInput is convertible
    // a double, please do so but it is not required for Lab 1
    // You can assume the user will enter a valid double (this is not realistic though!)
    val numericValue = stringInput!!.toDouble()

    print("Enter a unit of measurement (km or mi): ")
    val unitOfMeasurement = readLine()

    var result: Double
    // A comment here to explain what is happening if this if else if chain (should be 'when')
    // might be nice
    if (unitOfMeasurement == "km") {
        result = numericValue * kmToMiConversion
        println("$numericValue in $unitOfMeasurement is $result in miles.")
    } else if (unitOfMeasurement == "mi") {
        result = numericValue / kmToMiConversion
        println("$numericValue in $unitOfMeasurement is $result in km.")
    } else {
        println("Unable to handle conversion factor: $unitOfMeasurement.")
    }
}

/* For better marks
    1. Use a 'when' statement
    2. You need to add 4 more conversion factors, avoid using the temperatures unless you want a challenge
    3. Avoid duplicate code in the 'when' statement (the println)
    4. Use enums instead of strings for the measurements
    5. Add exception handling
    6. Use the java Scanner class for the I/O operations.
*/
