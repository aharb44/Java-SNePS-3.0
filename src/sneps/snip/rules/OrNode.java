package sneps.snip.rules;

import sneps.network.RuleNode;
import sneps.network.classes.Semantic;
import sneps.network.classes.setClasses.NodeSet;
import sneps.network.classes.term.Term;
import sneps.snip.classes.RuleUseInfo;

public class OrNode extends RuleNode {

	public OrNode() {}

	public OrNode(Term syn) {
		super(syn);
	}

	public OrNode(Term syn, Semantic sym) {
		super(syn, sym);
	}

	@Override
	protected void sendRui(RuleUseInfo tRui, String contextID) {
		// TODO Auto-generated method stub

	}

	@Override
	public NodeSet getDownAntNodeSet() {
		// TODO Auto-generated method stub
		return null;
	}

}