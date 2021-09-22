package cz.uhk.pro2;

public interface Raster {
    void setPixel(int x, int y, int color);
    int getWidth();
    int getHeight();
}
