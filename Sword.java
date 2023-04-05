public class Sword<M extends Metal>{
    private M metal;

    Sword(M metal){
        setMetal(metal);
    }

    public void setMetal(M metal) {
        this.metal = metal;
    }

    public M getMetal() {
        return metal;
    }

    public boolean checkEndurance(){
        return metal.getEndurance() > 49;
    }
}
