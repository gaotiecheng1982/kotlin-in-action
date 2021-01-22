package ch05

import main.ch05.ex1_2_LambdasAndCollections.*
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class _5_1_2_LambdasAndCollectionsKtTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun findTheOldest() {
        val people = listOf(Person("Alice", 29)
                , Person("Alice", 29)
                , Person("Bob", 31)
                , Person("Bobb", 31))
        people.stream().distinct().forEach() { System.out.println(it) }
        //findTheOldest(people)
    }
}