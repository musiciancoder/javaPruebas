package patronesdiseno2.structural.facade.facadebegin.email;

public abstract class Template {



	public enum TemplateType {Email, NewsLetter};
	
	public abstract String format(Object obj);
	
}
