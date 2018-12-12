package com.bryansmit.calculator

import com.bryansmit.calculator.extension.isValidOperator
import java.util.*

class Main {
    companion object {
        private val operators: List<String> = listOf("+", "-", "/", "*")

        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            System.out.println("Currently only integer types are supported!")
            System.out.println("What kind of calculation do you want to make?")
            System.out.print("(+, -, /, *) : ")
            var type = scanner.nextLine()

            while (!type.isValidOperator(operators)) {
                System.out.println("That is not a valid operator, please select a supported one.")
                System.out.print("(+, -, /, *) : ")
                type = scanner.nextLine()
            }

            System.out.print("Enter the first value: ")

            val firstValue = scanner.nextInt()

            when (type) {
                "+" -> {
                    System.out.print("What do you want to add to $firstValue? ")
                    val secondValue = scanner.nextInt()
                    System.out.printf("%n$firstValue + $secondValue = %s%n", (firstValue + secondValue))
                }
                "-" -> {
                    System.out.print("What do you want subtract of $firstValue? ")
                    val secondValue = scanner.nextInt()
                    System.out.printf("%n$firstValue + $secondValue = %s%n", (firstValue - secondValue))
                }
                "/" -> {
                    System.out.print("What do you want to divide $firstValue with? ")
                    val secondValue = scanner.nextInt()
                    System.out.printf("%n$firstValue / $secondValue = %s%n", (firstValue / secondValue))
                }
                "*" -> {
                    System.out.print("What do you want to multiply $firstValue with? ")
                    val secondValue = scanner.nextInt()
                    System.out.printf("%n$firstValue * $secondValue = %s%n", (firstValue * secondValue))
                }
            }
        }
    }
}