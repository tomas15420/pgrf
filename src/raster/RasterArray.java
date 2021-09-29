package raster;

public class RasterArray implements Raster{

    private int[][] array;
    private int width;
    private int height;

    public RasterArray(int width, int height){
        array = new int[width][height];
        this.width = width;
        this.height = height;
    }

    @Override
    public void setPixel(int x, int y, int color) {
        array[x][y] = color;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
