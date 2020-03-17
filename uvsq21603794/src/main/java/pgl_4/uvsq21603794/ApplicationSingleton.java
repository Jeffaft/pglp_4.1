package pgl_4.uvsq21603794;

public enum ApplicationSingleton {
	ENVIRONNEMENT;
	public void run(String[]args) {
		 Personnels p=new Personnels.Builder("ju","rey").fonctions("test").build();
		 Personnels p1=new Personnels.Builder("ju","rey2").fonctions("test").build();
		 
		 Personnels p2=new Personnels.Builder("ju","rey3").fonctions("test").build();
		 Personnels p3=new Personnels.Builder("ju","rey4").fonctions("test").build();
		 
		 CompositePersonnels c1 = new CompositePersonnels();
		 CompositePersonnels c2 = new CompositePersonnels();
		 CompositePersonnels c = new CompositePersonnels();
		 
		 c1.add(p);
		 c1.add(p1);
		 
		 c2.add(p2);
		 c2.add(p3);
		 
		 c.add(c1);
		 c.add(c2);
		 
		 c.print();
	}
	public static void main(String[]args) {
	ENVIRONNEMENT.run(args);
	}
}
