package pgl_4.uvsq21603794;

import java.util.List; 
import java.util.ArrayList;

public class CompositePersonnels implements PersInterface {
	private List<PersInterface> childPersonnels = new ArrayList<PersInterface>();
	@Override
	public void print_hierarchique() {
		for(PersInterface p : childPersonnels) {
			p.print_hierarchique();
		}
	}
	
	public void add(PersInterface p) {
		childPersonnels.add(p);
	}
	
	public void remove(PersInterface p) {
		childPersonnels.remove(p);
	}
}
