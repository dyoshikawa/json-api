import com.mchange.v2.c3p0.ComboPooledDataSource
import javax.servlet.ServletContext
import net.dyosh.jason._
import org.scalatra._
import org.slf4j.LoggerFactory
import slick.jdbc.H2Profile.api._

class ScalatraBootstrap extends LifeCycle {

  val logger = LoggerFactory.getLogger(getClass)

  val cpds = new ComboPooledDataSource
  logger.info("Created c3p0 connection pool")

  override def init(context: ServletContext) {
    val db = Database.forDataSource(cpds, None)
    context.mount(new JasonServlet(db), "/*")
  }
}
