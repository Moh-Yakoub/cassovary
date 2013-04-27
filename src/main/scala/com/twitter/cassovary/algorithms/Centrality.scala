package com.twitter.cassovary.algorithms

import com.twitter.cassovary.graph.DirectedGraph
import com.twitter.cassovary.graph.Node
import com.twitter.cassovary.graph.GraphDir

trait Centrality{
  protected def centralitymeasure(graph:DirectedGraph,id:Int):Double
}


object InDegreeCentrality extends Centrality{
  def centralitymeasure(graph:DirectedGraph,id:Int):Double ={
	val nd = graph.getNodeById(id)
	val node = nd.get
	val l = node.neighborCount(GraphDir.InDir)
	return (l/(graph.nodeCount))
  }
  
}