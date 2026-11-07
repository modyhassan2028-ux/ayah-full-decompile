package Y9;

import java.util.Arrays;

/* JADX INFO: renamed from: Y9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0655k extends P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f10525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10526b;

    @Override // Y9.P
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f10525a, this.f10526b);
        p251z9.j.d(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // Y9.P
    public final void b(int i10) {
        char[] cArr = this.f10525a;
        if (cArr.length < i10) {
            int length = cArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
            p251z9.j.d(cArrCopyOf, "copyOf(...)");
            this.f10525a = cArrCopyOf;
        }
    }

    @Override // Y9.P
    public final int d() {
        return this.f10526b;
    }
}
