package patronesdiseno2.structural.facade.facadeend.email;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
