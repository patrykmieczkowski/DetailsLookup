package com.mieczkowskidev.detailslookup.sealed

/**
 * Created by Patryk Mieczkowski on 27.03.2018
 */
class OperationUsage() {

    fun execute(x: Int, op: Operation) = when (op) {
        is Operation.Add -> x + op.value
        is Operation.Substract -> x - op.value
        is Operation.Multiplay -> x * op.value
        is Operation.Divide -> x / op.value
    }

    fun mainBody() {
        execute(10, Operation.Add(5))
    }
}