package Y9;

import java.util.Arrays;

/* JADX INFO: renamed from: Y9.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0663t extends P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f10550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10551b;

    @Override // Y9.P
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f10550a, this.f10551b);
        p251z9.j.d(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // Y9.P
    public final void b(int i10) {
        float[] fArr = this.f10550a;
        if (fArr.length < i10) {
            int length = fArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i10);
            p251z9.j.d(fArrCopyOf, "copyOf(...)");
            this.f10550a = fArrCopyOf;
        }
    }

    @Override // Y9.P
    public final int d() {
        return this.f10551b;
    }
}
