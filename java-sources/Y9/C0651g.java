package Y9;

import java.util.Arrays;

/* JADX INFO: renamed from: Y9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0651g extends P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f10513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10514b;

    @Override // Y9.P
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f10513a, this.f10514b);
        p251z9.j.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // Y9.P
    public final void b(int i10) {
        byte[] bArr = this.f10513a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            p251z9.j.d(bArrCopyOf, "copyOf(...)");
            this.f10513a = bArrCopyOf;
        }
    }

    @Override // Y9.P
    public final int d() {
        return this.f10514b;
    }
}
