
import com.sksamuel.elastic4s.http.{ElasticDsl, HttpClient}

object AliasesOps extends ElasticDsl {

  implicit val es: HttpClient = ???

  es.execute(addAlias("foo").on("bar"))

  es.execute(removeAlias("foo").on("bar"))

  es.execute(reindex("foo").into("bar"))
}
