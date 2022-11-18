package org.opentripplanner.routing.vertextype;

import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.transit.model.basic.I18NString;

/**
 * A vertex representing a place along a street between two intersections that is not derived from
 * an OSM node, but is instead the result of breaking that street segment into two pieces in order
 * to connect it to a transit stop.
 */
public class SplitterVertex extends IntersectionVertex {

  private static final long serialVersionUID = 1L;

  public SplitterVertex(Graph g, String label, double x, double y, I18NString name) {
    // splitter vertices don't represent something that exists in the world, so traversing them is
    // always free.
    super(g, label, x, y, name, true);
  }
}
