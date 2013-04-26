import com.twitter.cassovary.graph.TestGraphs
object simpleGraph extends App {
  val numofnodes = 3;
  val graph = TestGraphs.generateCompleteGraph(numofnodes);
  println(graph.edgeCount);

}