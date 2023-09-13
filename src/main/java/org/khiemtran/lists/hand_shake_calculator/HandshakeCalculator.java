package org.khiemtran.lists.hand_shake_calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandshakeCalculator {
  public List<Signal> calculateHandshake(int number) {
    List<Signal> handShakes = new ArrayList<>();
    if ((number & 1) != 0) handShakes.add(Signal.WINK);
    if ((number & 1 << 1) != 0) handShakes.add(Signal.DOUBLE_BLINK);
    if ((number & 1 << 2) != 0) handShakes.add(Signal.CLOSE_YOUR_EYES);
    if ((number & 1 << 3) != 0) handShakes.add(Signal.JUMP);
    if ((number & 1 << 4) != 0) Collections.reverse(handShakes);
    return handShakes;
  }
}
