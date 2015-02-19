package net.virtualvoid.docs
import akka.actor.ActorSystem

object Main extends App {
  implicit val system = ActorSystem()

  MultiDocsBrowser.run(args.toSeq)
}
