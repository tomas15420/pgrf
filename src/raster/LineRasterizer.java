package raster;

public abstract class LineRasterizer {

    protected Raster raster;

    public LineRasterizer(Raster raster){
        this.raster = raster;
    }

    public void rasterize(int x1, int y1, int x2, int y2) {

    }
}
