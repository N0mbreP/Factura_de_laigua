package org.example

import java.util.*

val scan: Scanner = Scanner(System.`in`)

/**
 * This method can be used to read a String word value from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue Output value
 */
fun readWord(pMessageIn: String
             , pMessageErrorDT: String
): String{

    var outputValue: String = ""
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNext()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.next()
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read a String sentence from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue Output value
 */
fun readSentence(pMessageIn: String
             , pMessageErrorDT: String
): String{

    var outputValue: String = ""
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNext()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextLine()
        }
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read a Char value from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue Output value
 */
fun readChar(pMessageIn: String
             , pMessageErrorDT: String
): Char{

    var outputValue: Char = ' '
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNext()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            // Get the first character of the input word from scan.next()
            outputValue = scan.next()[0]
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}
/**
 * This method can be used to read a Char value from the user and return a Boolean
 * through keyboard using java.util.Scanner
 * @author raimon.izard
 * @author pol paredes
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue trueFalse
 */
fun readCharReturnBoolean(pMessageIn: String
             , pMessageErrorDT: String
): Boolean{
    var trueFalse:Boolean=false
    var outputValue: Char = ' '
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNext()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            // Get the first character of the input word from scan.next()
            outputValue = scan.next()[0]
        }
        scan.nextLine()
        if (outputValue.lowercaseChar()=='s') return true
        else if (outputValue.lowercaseChar()=='n') return false
        correctDataType=false
        println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
    }while(!correctDataType)
    return false
}

/**
 * This method can be used to read a Char value from the user through keyboard using java.util.Scanner. It can force the output Char to be lower or uppercase
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @param pCase Input parameter to force lowercase (0) or uppercase (1)
 * @return outputValue Output value
 */
fun readChar(pMessageIn: String
             , pMessageErrorDT: String
             , pCase: Int
): Char{

    var outputValue: Char = ' '
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNext()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = if (pCase == 0) scan.next()[0].lowercaseChar()
            else scan.next()[0].uppercaseChar()
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read a Boolean value from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue Output value
 */
fun readBoolean(pMessageIn: String
                , pMessageErrorDT: String
): Boolean{

    var outputValue: Boolean = false
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNextBoolean()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextBoolean()
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read an Int value from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @return outputValue Output value
 */
fun readInt(pMessageIn: String
            , pMessageErrorDT: String
): Int{

    var outputValue: Int = 0
    var correctDataType: Boolean = false
    do{
        println(pMessageIn)
        correctDataType = scan.hasNextInt()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextInt()
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read an Int value from the user through keyboard using java.util.Scanner in within a range
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @param pMessageErrorDV Data value error message to be shown to the user
 * @param pMin Min accepted value
 * @param pMax Max accepted value
 * @return outputValue Output value
 */
fun readInt(pMessageIn: String
            , pMessageErrorDT: String
            , pMessageErrorDV: String
            , pMin: Int
            , pMax: Int
): Int{

    var outputValue: Int = 0
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNextInt()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextInt()

            if (outputValue < pMin || outputValue > pMax){
                println(YELLOW_BOLD_BRIGHT + "WARNING: " + pMessageErrorDV + RESET)
                correctDataType = false
            }
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read a Float value from the user through keyboard using java.util.Scanner
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @return outputValue Output value
 */
fun readFloat(pMessageIn: String
              , pMessageErrorDT: String
): Float{

    var outputValue: Float = 0.0f
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNextFloat()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextFloat()
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read a Float value from the user through keyboard using java.util.Scanner in within a range
 * @author raimon.izard
 * @since 15/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @param pMessageErrorDV Data value error message to be shown to the user
 * @param pMin Min accepted value
 * @param pMax Max accepted value
 * @return outputValue Output value
 */
fun readFloat(pMessageIn: String
            , pMessageErrorDT: String
            , pMessageErrorDV: String
            , pMin: Float
            , pMax: Float
): Float{

    var outputValue: Float = 0.0f
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scan.hasNextFloat()

        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextFloat()

            if (outputValue < pMin || outputValue > pMax){
                println(YELLOW_BOLD_BRIGHT + "WARNING: " + pMessageErrorDV + RESET)
                correctDataType = false
            }
        }
        scan.nextLine()
    }while(!correctDataType)

    return outputValue
}

/**
 * This method can be used to read a float value from the user via the keyboard using java.util.Scanner within a range
 * determined by the numbers corresponding to the current coins value.
 * @author jacomar, based on the raimon.izard's code.
 * @since 28/12/2023
 * @param pMessageIn Input message to be shown to the user
 * @param pMessageErrorDT Data type error message to be shown to the user
 * @param pMessageErrorDV Data value error message to be shown to the user
 * @param pMin Min accepted value
 * @param pMax Max accepted value
 * @return outputValue Output value
 */


fun readFloatCash(pMessageIn: String
                  , pMessageErrorDT: String
): Float{


    var outputValue: Float = 0.0f
    var correctDataType: Boolean = false


    do{
        println(pMessageIn)
        correctDataType = scan.hasNextFloat()


        if (!correctDataType){
            println(RED_BACKGROUND_BRIGHT + "ERROR: " + pMessageErrorDT + RESET)
        }else{
            outputValue = scan.nextFloat()
            when (outputValue){
                0.05f -> return 0.05f
                0.10f -> return 0.10f
                0.20f -> return 0.20f
                0.50f -> return 0.50f
                1f -> return 1f
                2f -> return 2f
                5f -> return 5f
                10f -> return 10f
                20f -> return 20f
                50f -> return 50f
            }
        }
        scan.nextLine()
    }while(correctDataType)


    return outputValue
}
