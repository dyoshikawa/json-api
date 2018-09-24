package net.dyosh.kakeibo

import org.scalatra._

class HouseholdAccountsServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
