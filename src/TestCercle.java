
public class TestCercle {

	public static void main(String[] args) {
		Point p1=null,p2=null;
		Cercle c1,c2;

		p1=new Point(); //Par d�faut x=0, y=0
		c1=new Cercle(p1,2);
		c2=new Cercle (5);// Coordonn�es du centre par d�faut 0,0
System.out.println(c1);
		p1.setX(8);
		p1.setY(7);
		c1.setCentre(p1);
		p2=new Point();
		p2.setX(2) ;
		p2.setY(7) ;

		c2.setCentre(p2);
		c2.setRayon(2);
			
		System.out.println(" les caracteristiques de c1 = "+c1);
		System.out.println(" le centre de c1 = "+ c1.getCentre());

		if(c1.equals(c2))
			System.out.print("Les deux cercles ont le m�me rayon");
		else
			System.out.print("Les deux cercles n'ont pas le m�me rayon");

	}// fin main()

}//fin TestCercle
