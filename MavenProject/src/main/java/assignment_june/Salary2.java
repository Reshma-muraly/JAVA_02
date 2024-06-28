package assignment_june;

public class Salary2 extends Salary1 {
      double hra;
      double pf;

    public void calculatehrandpf() {
        this.hra= 0.20* hra;
        this.pf=0.5* pf;
    }
}
