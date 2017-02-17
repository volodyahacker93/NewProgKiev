package Module_1.HW.Task_3;

import java.io.Serializable;

public class MyClass implements Serializable{

    private static final long serialVersionUID = 1L;

    @Save
    private String a;

    @Save
    private int b;

    @Save
    private double c;

    @Save
    private long d;

    private boolean e;

    public MyClass() {

    }

    public MyClass(String a, int b, double c, long d, boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    @Override
    public String toString() {
        return "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }

    public boolean isE() {
        return e;
    }

    public void setE(boolean e) {
        this.e = e;
    }
}
