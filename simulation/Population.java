package simulation;

public class Population {
	
	private Organism type;
	private List<Organism> pool = new ArrayList<Organism>();
	private Consumer<List<Organism>> onUpdate;
	
	public Population(Organism type) {
		
		this.type = type;
		
		initPool();
		
	}
	
	public Population(Organism type, Consumer<List<Organism>> onUpdate) {
		
		this(type);
		
		this.onUpdate = onUpdate;
		
	}
	
	private void update() {
		
		for (Organism o : pool) {
			
			o.update();
			
		}
		
		reproduce();
		
	}
	
	private void select() {
		
		//TODO
		
	}
	
	private void createChildren() {
		
		//TODO
		
	}
	
	private void reproduce() {
		
		select();
		createChildren();
		
	}
	
}
