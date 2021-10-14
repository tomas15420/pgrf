package raster;

public class DottedLineRasterizer extends LineRasterizer{
    public DottedLineRasterizer(Raster raster) {
        super(raster);
    }

    @Override
    public void rasterize(int x1, int y1, int x2, int y2) {
        float k = (float)(y2-y1)/(x2-x1);

        float q = y1-k*x1;
        for(int x = x1; x <= x2; x += 2) {
            int y = (int)(k*x+q);
            raster.setPixel(x,y,0xFFFF00);
        }
    }
}
