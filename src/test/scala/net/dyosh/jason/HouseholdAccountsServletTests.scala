package net.dyosh.jason

import org.scalatra.test.scalatest._

class JasonServletTests extends ScalatraFunSuite {

  addServlet(classOf[JasonServlet], "/*")

  test("GET / on JasonServlet should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
