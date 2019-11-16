import org.scalatest.FlatSpec

/**
 * Specification mixin for testing [[EventProcessor]] against any backend.
 */
class MySpec extends FlatSpec {

  behavior of "Something"

  it should "handle things" in {
    assert(true === true)
  }

}
