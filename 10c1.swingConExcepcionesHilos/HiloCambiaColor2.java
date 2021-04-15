import java.awt.*;

public class HiloCambiaColor2 implements Runnable {
    final JVentana jVentana;

    public HiloCambiaColor2(JVentana jVentana) {
        this.jVentana = jVentana;
    }

    @Override
    public void run() {
        while (true) {
            this.jVentana.getPnlSouth().setBackground(new Color((int) (255 * Math.random()), (int) (255 * Math.random()), (int) (255 * Math.random())));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
