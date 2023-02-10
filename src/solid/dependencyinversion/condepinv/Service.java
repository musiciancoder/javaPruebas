package solid.dependencyinversion.condepinv;

import solid.liskovprinciple.sinliskov.Video;
import solid.openclosed.conopenclosed.IEarningCalculator;

public class Service {

    IEarningCalculator calculator;

    public Service(IEarningCalculator calculator) {
        this.calculator = calculator;
    }

    public double calculateEarnings(Video video){
      //  return calculator.calculateEarnings(video);
        return 2.5;
    }
}
