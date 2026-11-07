package Y9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f10523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10524b;

    @Override // Y9.P
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f10523a, this.f10524b);
        p251z9.j.d(sArrCopyOf, "copyOf(...)");
        return new p110k9.x(sArrCopyOf);
    }

    @Override // Y9.P
    public final void b(int i10) {
        short[] sArr = this.f10523a;
        if (sArr.length < i10) {
            int length = sArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
            p251z9.j.d(sArrCopyOf, "copyOf(...)");
            this.f10523a = sArrCopyOf;
        }
    }

    @Override // Y9.P
    public final int d() {
        return this.f10524b;
    }
}
