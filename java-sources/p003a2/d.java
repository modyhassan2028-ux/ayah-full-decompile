package p003a2;

import p214w.AbstractC1389b;
import p214w.J;
import p214w.K;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f11132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f11133b;

    public J a(float f3) {
        double dB = b(f3);
        double d5 = K.f23448a;
        double d9 = d5 - 1.0d;
        return new J(f3, (float) (Math.exp((d5 / d9) * dB) * ((double) (this.f11132a * this.f11133b))), (long) (Math.exp(dB / d9) * 1000.0d));
    }

    public double b(float f3) {
        float[] fArr = AbstractC1389b.f23472a;
        return Math.log(((double) (Math.abs(f3) * 0.35f)) / ((double) (this.f11132a * this.f11133b)));
    }
}
