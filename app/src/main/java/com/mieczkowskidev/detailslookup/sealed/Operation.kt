package com.mieczkowskidev.detailslookup.sealed

/**
 * Created by Patryk Mieczkowski on 27.03.2018
 */
sealed class Operation {
    class Add(val value: Int) : Operation()
    class Substract(val value: Int) : Operation()
    class Multiplay(val value: Int) : Operation()
    class Divide(val value: Int) : Operation()
}