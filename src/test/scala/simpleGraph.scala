import com.twitter.cassovary.graph.TestGraphs
object simpleGraph extends App {
  val numofnodes = 3;
  val graph = TestGraphs.generateErdosRenyi(3,0.5);
  println(graph.edgeCount);

}