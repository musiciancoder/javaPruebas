package patronesdiseno2.structural.facade.facadeend.email;

public class StationaryFactory {

	public static Stationary createStationary() {
		return new HalloweenStationary();
	}
}
