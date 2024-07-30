import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class GetInitialsKtTest {

    @Test
    fun testGetInitials() {
        val fullName = "Sergey Bezborodov"

        assertThat(getInitials(fullName)).isEqualTo("SB")
    }

}