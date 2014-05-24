import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.filter.PlugInFilter;

public class ColorInverter_ implements PlugInFilter { // My_FirstPlugin implementuje inteface PlugInFilter

	public int setup(String arg, ImagePlus imp)
	{
		if(arg.equals("about"))
		{
		showAbout(); 
		return DONE; // nie wykona sie
		}
		return DOES_RGB+SUPPORTS_MASKING+NO_CHANGES; // gdyby dac samo "DONE" nie uruchomilaby sie metoda, dla DOES_RGB uruchomi sie tylko dla obrazkow RGB // SUPPORTS_MASKING - tylko w ROI, NO_CHANGES - obrazej wejsciowy bez zmian


	}
	public void run(ImageProcessor ip) {

	int w = ip.getWidth(); // wysokosc obrazka
	int h = ip.getHight(); // szerokosc obrazka
	Rectangle roi = ip.getRoi(); // roi
	ImagePlus inverted = NewImage.createRGBImage("Inverted image", w,h,1,NewImage.FILL_BLACK); // tworze obiekt ktory bedzie moim wyjsciowym obrazkiem, wypelniam go na czarno
	ImageProcessor inv_pr = inverted.getProcessor(); // tworze nowy processor dla obrazka wyjsciowego


inv_ip.copyBits(ip,0,0,Blitter.COPY); // kopiuje obrazek stary do nowego na pozycje (0,0)
int[] pixels = (int[]) inv_ip.getPixels(); // tworze tablice pixeli, inty bo to RGB

for( int i = roi.y; i< roi.y+roi.hight; i++)
{
	int offset = i*w;
	for(int j = roi.x;j<roi.x+roi.width;j++)
	{
		int pos = offset+j;
		int c = pixels[pos];
		int r = (c & 0xff0000)>>16;
		int g = (c & 0x00ff00)>>8;
		int b = (c & 0x0000ff);
		r = 255-r;
		g = 255-g;
		b = 255-b;
		pixels[pos] = ((r & 0xff) << 16) +
		((g & 0xff) << 8) +
		(b & 0xff);
	}
}

inverted.show();
inverted.updateAndDraw();
		


	}

}
