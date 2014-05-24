import java.lang.Object;


public class Thresholding extends MarvinAbstractImagePlugin {

    private int threshold;

    @Override
    public void load() {
    }

    @Override
    public MarvinAttributesPanel getAttributesPanel() {
        return null;
    }

    @Override
    public void process(
            MarvinImage imageIn,
            MarvinImage imageOut,
            MarvinAttributes attributesOut,
            MarvinImageMask mask,
            boolean previewMode
    ) {
        threshold = (Integer) getAttribute("threshold");
        for (int y = 0; y < imageIn.getHeight(); y++) {
            for (int x = 0; x < imageIn.getWidth(); x++) {

                if (imageIn.getIntComponent0(x, y) < threshold) {
                    imageOut.setIntColor(x, y, imageIn.getAlphaComponent(x, y), 0, 0, 0);
                } else {
                    imageOut.setIntColor(x, y, imageIn.getAlphaComponent(x, y), 255, 255, 255);
                }
            }
        }
    }
}