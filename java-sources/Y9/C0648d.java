package Y9;

import java.util.Arrays;

/* JADX INFO: renamed from: Y9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0648d extends P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f10503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10504b;

    @Override // Y9.P
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f10503a, this.f10504b);
        p251z9.j.d(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // Y9.P
    public final void b(int i10) {
        boolean[] zArr = this.f10503a;
        if (zArr.length < i10) {
            int length = zArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
            p251z9.j.d(zArrCopyOf, "copyOf(...)");
            this.f10503a = zArrCopyOf;
        }
    }

    @Override // Y9.P
    public final int d() {
        return this.f10504b;
    }
}
