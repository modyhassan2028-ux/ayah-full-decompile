package Y9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class F extends P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10459b;

    @Override // Y9.P
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f10458a, this.f10459b);
        p251z9.j.d(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // Y9.P
    public final void b(int i10) {
        long[] jArr = this.f10458a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            p251z9.j.d(jArrCopyOf, "copyOf(...)");
            this.f10458a = jArrCopyOf;
        }
    }

    @Override // Y9.P
    public final int d() {
        return this.f10459b;
    }
}
