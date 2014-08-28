package schokolade;

public class GasVerbrauch {

	public double berechneGaspreis(int verbrauch) throws UnzulaessigerVerbauchException {

		double kosten = 0;

		if (verbrauch < 0) throw new UnzulaessigerVerbauchException(
					"Verbrauch kann nicht negativ sein!");

		if (verbrauch <= 50) {
			kosten = kosten + verbrauch * 0.2;
		} else if (verbrauch > 50 && verbrauch <= 500) {
			kosten = kosten + (verbrauch - 50) * 0.15 + 10;
		} else
			kosten = kosten + (verbrauch - 500) * 0.1 + 77.50;

		System.out.println("Kosten:" + kosten);

		return kosten;
	}
}
