package patronesdiseno.solid.interfsegregation.sin;

/*
It is a SOLID design principle and represent “I” on the SOLID acronym. According to ISP clients should not be forced to implement unnecessary methods which they will not use. To achieve the ISP SOLID design principle we favor many, smaller, client-specific interfaces over one larger interface.
Let us understand the interface segregation principle by below example. In below example we have one interface which have two methods to generate reports in different formats generateExcel()and generatePdf().
 Now consider a case client Test wants to use this interface but want to use reports only in PDF format and not in excel. With the above design he cannot achieve it because we are forcing him to implement both methods. So this design is not following the interface segregation principle.
 */

public interface GenerateReport{
    public void generateExcel();
    public void generatePDF();
}