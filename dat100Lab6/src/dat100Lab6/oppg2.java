package dat100Lab6;

import easygraphics.EasyGraphics;

public class oppg2 extends EasyGraphics {

	// nesten dekket hvis mindre en fra havoverflaten
	int NESTEN_DEKKET = 1;
	int RADIUS = 20;
	int MARGIN = 50;

	// terreng hogde
	int[][] terreng = { { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 }, { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
			{ 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 } };

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {

		makeWindow("FLOODING", 800, 300);

		visualiser();
	}

	public void visualiser() {

		System.out.println("Angi havh�yde i tegnevinduet ...");
		int hav = Integer.parseInt(getText("havh�yde"));

		while (hav >= 0) {

			// TODO - START

			// setColor(0,0,255); // bl� - vann

			// setColor(222,184,135); // lysebrun - t�rt

			// setColor(255,140,0); // oransje - s�le

			// fillCircle(MARGIN + * 2 * RADIUS,MARGIN + * 2* RADIUS,RADIUS);

			// TODO - SLUTT

			System.out.println("Angi havh�yde i tegnevinduet ...");
			hav = Integer.parseInt(getText("havh�yde"));
		}
	}
}