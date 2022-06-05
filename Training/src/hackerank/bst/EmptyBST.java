package hackerank.bst;

public class EmptyBST<D extends Comparable> implements Tree<D>{
	
	public EmptyBST() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int cardinality() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean member(D elt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public NonEmptyBst<D> add(D elt) {
		// TODO Auto-generated method stub
		return null;
	}

}
