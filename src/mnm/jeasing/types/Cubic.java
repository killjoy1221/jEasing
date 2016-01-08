package mnm.jeasing.types;

import mnm.jeasing.Easing;
import mnm.jeasing.EasingType;

public class Cubic implements EasingType {

    @Override
    public Easing in() {
        return (t, b, c, d) -> {
            t /= d;
            return c * Math.pow(t, 3) + b;
        };
    }

    @Override
    public Easing out() {
        return (t, b, c, d) -> {
            t /= d;
            t--;
            return c * (Math.pow(t, 3) + 1) + b;
        };
    }

    @Override
    public Easing inOut() {
        return (t, b, c, d) -> {
            t /= d / 2;
            if (t < 1)
                return c / 2 * Math.pow(t, 3) + b;
            t -= 2;
            return c / 2 * (Math.pow(t, 3) + 2) + b;
        };
    }
}
