package ra;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21639b = new int[10];

    public final int a() {
        if ((this.f21638a & 16) != 0) {
            return this.f21639b[4];
        }
        return 65535;
    }

    public final void b(B b5) {
        p251z9.j.e(b5, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (((1 << i10) & b5.f21638a) != 0) {
                c(i10, b5.f21639b[i10]);
            }
        }
    }

    public final void c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f21639b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f21638a = (1 << i10) | this.f21638a;
            iArr[i10] = i11;
        }
    }
}
