package solid.liskovprinciple.sinliskov;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode

public class PremiumVideo extends Video{

    private int premiumId;

    @Override
    public void playRandomAd() throws Exception {
        throw new Exception("No ads played during premium videos");
    }
}
