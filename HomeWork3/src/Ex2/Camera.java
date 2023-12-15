package Ex2;

public class Camera {
    private String type;
    private String zoom;
    private boolean haveFlash;

    public Camera(String type, String zoom, boolean haveFlash) {
        this.type = type;
        this.zoom = zoom;
        this.haveFlash = haveFlash;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getZoom() {
        return zoom;
    }

    public void setZoom(String zoom) {
        this.zoom = zoom;
    }

    public boolean isHaveFlash() {
        return haveFlash;
    }

    public void setHaveFlash(boolean haveFlash) {
        this.haveFlash = haveFlash;
    }
}
