
public class Cercle {
	private Point centre;
	private static double rayon;
    private static final double pi=3.14;
	public Cercle (Point centre, double rayon) {
		this.centre=centre;
		Cercle.rayon=rayon;
	}
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	public Cercle ( double rayon) {
		this.centre=new Point();
		Cercle.rayon=rayon;
	}

		public Point getCentre() {
			return centre;
		}
		
public void setCentre(Point b) {
	this.centre=b;
}
public double calculSurface() {
	double s=0.0;
	s=rayon*rayon*pi;
	return s;
}
@Override
public String toString() {
	return "Cercle [centre=" + centre + "rayon="+rayon+"]";
}

}