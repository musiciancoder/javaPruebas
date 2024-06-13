package patronesdiseno2.structural.facade.facadebegin.email;

public class StationaryFactory {

	public static Stationary createStationary() {
		return new HalloweenStationary();
	}
}
