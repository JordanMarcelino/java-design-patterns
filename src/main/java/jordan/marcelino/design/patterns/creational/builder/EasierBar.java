package jordan.marcelino.design.patterns.creational.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder(toBuilder = true)
@Getter
@Setter
public class EasierBar {
    private String easierBaz;
}
