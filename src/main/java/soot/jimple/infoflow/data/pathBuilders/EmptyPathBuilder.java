package soot.jimple.infoflow.data.pathBuilders;

import soot.jimple.infoflow.data.AbstractionAtSink;
import soot.jimple.infoflow.results.InfoflowResults;

import java.util.Set;

/**
 * An empty implementation of {@link IAbstractionPathBuilder} that always
 * returns the empty set. For internal use only.
 * 
 * @author Steven Arzt
 */
public class EmptyPathBuilder implements IAbstractionPathBuilder {
	
	@Override
	public void computeTaintPaths(Set<AbstractionAtSink> res) {
	}

	@Override
	public InfoflowResults getResults() {
		return new InfoflowResults();
	}

	@Override
	public void shutdown() {
	}

}
