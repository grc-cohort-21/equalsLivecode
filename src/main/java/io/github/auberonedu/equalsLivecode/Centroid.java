package io.github.auberonedu.equalsLivecode;

public class Centroid {
    private int r;
    private int c;
    private String name;
    
    public Centroid(int r, int c, String name) {
        this.r = r;
        this.c = c;
        this.name = name;
    }

    public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }

    public String getName() {
        return name;
    }

    public int HashCode() {
        final int prime = 25;
        int result = 1;
        result = prime+result+c;
        result = prime+result+r;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null) return false;
        if (getClass()!=obj.getClass()) return false;
        Centroid o = (Centroid) obj;
        if (r!= o.r) return false;
        if (c!= o.c) return false;
        return true;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (o==null) return false;
    //     if (!this.getClass().equals(o.getClass())) {
    //         return false;
    //     }

    //     Centroid other = (Centroid) o;
    //     if (this.r != other.r) return false;
    //     if (this.c != other.c) return false;

    //     if (this.name==null) {
    //         if (other.name==null) {
    //             return true;
    //         }
    //         else {
    //             return false;
    //         }
    //     }
    //     if (!this.name.equals(other.name)) return false;
    //     return true;
    // }
}
