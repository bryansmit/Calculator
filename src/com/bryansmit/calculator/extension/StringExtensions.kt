package com.bryansmit.calculator.extension

fun String.isValidOperator(operators: List<String>): Boolean {
    return operators.contains(this)
}