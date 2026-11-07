package Y9;

import java.util.Arrays;

/* JADX INFO: renamed from: Y9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0659o extends P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f10538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10539b;

    @Override // Y9.P
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f10538a, this.f10539b);
        p251z9.j.d(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // Y9.P
    public final void b(int i10) {
        double[] dArr = this.f10538a;
        if (dArr.length < i10) {
            int length = dArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
            p251z9.j.d(dArrCopyOf, "copyOf(...)");
            this.f10538a = dArrCopyOf;
        }
    }

    @Override // Y9.P
    public final int d() {
        return this.f10539b;
    }
}
