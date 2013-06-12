import org.scalatra._

class Hello extends ScalatraServlet {
  get("/") {
    <h1>Hello, World!</h1>
  }
}
