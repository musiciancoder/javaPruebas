package patronesdiseno2.structural.facade.facadebegin.email;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
