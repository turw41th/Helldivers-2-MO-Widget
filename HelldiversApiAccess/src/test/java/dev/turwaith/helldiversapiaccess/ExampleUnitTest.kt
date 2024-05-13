package dev.turwaith.helldiversapiaccess

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testGetMajorOrderData_RealNetworkCall() {
        val apiAccess = ApiAccess()
        val result = apiAccess.getMajorOrderData()

        // Assertions to check if the response from the API is as expected
        // Typically, we check if the result is not null to confirm that we are getting a response
        // Further assertions can be added based on what is considered a valid response
        assertNotNull("The fetched data should not be null", result)

        // Additional assertions can include checking specific fields in the response
        // This assumes that you know what the expected response should contain
        // For example:
        // assertTrue("Check some expected value", result?.someField == expectedValue)
    }
}