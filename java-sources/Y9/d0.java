package Y9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f10505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10506b;

    @Override // Y9.P
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f10505a, this.f10506b);
        p251z9.j.d(iArrCopyOf, "copyOf(...)");
        return new p110k9.s(iArrCopyOf);
    }

    @Override // Y9.P
    public final void b(int i10) {
        int[] iArr = this.f10505a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            p251z9.j.d(iArrCopyOf, "copyOf(...)");
            this.f10505a = iArrCopyOf;
        }
    }

    @Override // Y9.P
    public final int d() {
        return this.f10506b;
    }
}
