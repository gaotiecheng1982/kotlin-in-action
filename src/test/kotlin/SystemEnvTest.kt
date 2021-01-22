import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

data class Person(val name: String) {
    var age: Int = 0
}

internal class SystemEnvTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }
    
    @Test
    fun testSystemEnv(){
        var envVar: String = System.getenv("WORKFLOW") ?: "default_value"
        System.out.println(envVar)
        System.out.println(if (envVar=="ALISINKFLOW") "ALISINKFLOW" else "SDFCFLOW")
    }

    @Test
    fun testDataClassEquals() {
        val person1 = Person("John")
        val person2 = Person("John")
        person1.age = 10
        person2.age = 20
        println("person1 == person2: ${person1 == person2}")
        println("person1 with age ${person1.age}: ${person1}")
        println("person2 with age ${person2.age}: ${person2}")
    }
}