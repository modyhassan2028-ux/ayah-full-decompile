package Y9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f10497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10498b;

    @Override // Y9.P
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f10497a, this.f10498b);
        p251z9.j.d(bArrCopyOf, "copyOf(...)");
        return new p110k9.q(bArrCopyOf);
    }

    @Override // Y9.P
    public final void b(int i10) {
        byte[] bArr = this.f10497a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            p251z9.j.d(bArrCopyOf, "copyOf(...)");
            this.f10497a = bArrCopyOf;
        }
    }

    @Override // Y9.P
    public final int d() {
        return this.f10498b;
    }
}
