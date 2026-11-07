package Y9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10516b;

    @Override // Y9.P
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f10515a, this.f10516b);
        p251z9.j.d(jArrCopyOf, "copyOf(...)");
        return new p110k9.u(jArrCopyOf);
    }

    @Override // Y9.P
    public final void b(int i10) {
        long[] jArr = this.f10515a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            p251z9.j.d(jArrCopyOf, "copyOf(...)");
            this.f10515a = jArrCopyOf;
        }
    }

    @Override // Y9.P
    public final int d() {
        return this.f10516b;
    }
}
