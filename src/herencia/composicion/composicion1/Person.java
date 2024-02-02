package herencia.composicion.composicion1;

public class Person {

    //composition features a 'has-a' relationship, in this case a Person has a Job
    private Job job;

    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
    }
    public long getSalary() {
        return job.getSalary();
    }

}