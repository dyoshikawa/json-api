package net.dyosh.kakeibo

import org.scalatra.test.scalatest._

class HouseholdAccountsServletTests extends ScalatraFunSuite {

  addServlet(classOf[HouseholdAccountsServlet], "/*")

  test("GET / on HouseholdAccountsServlet should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
