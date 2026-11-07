package D;

/* JADX INFO: renamed from: D.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0063f implements InterfaceC0062e, InterfaceC0064g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f953r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f954s;

    public C0063f(float f3) {
        this.f953r = f3;
        this.f954s = f3;
    }

    @Override // D.InterfaceC0062e, D.InterfaceC0064g
    public final float a() {
        return this.f954s;
    }

    @Override // D.InterfaceC0062e
    public final void b(p063g1.c cVar, int i10, int[] iArr, p063g1.m mVar, int[] iArr2) {
        int i11;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iE = cVar.E(this.f953r);
        boolean z10 = mVar == p063g1.m.f16262s;
        C0059b c0059b = AbstractC0066i.f977a;
        if (z10) {
            i11 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i12 = iArr[length];
                int iMin2 = Math.min(i11, i10 - i12);
                iArr2[length] = iMin2;
                iMin = Math.min(iE, (i10 - iMin2) - i12);
                i11 = iArr2[length] + i12 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i13 = 0;
            i11 = 0;
            iMin = 0;
            int i14 = 0;
            while (i13 < length2) {
                int i15 = iArr[i13];
                int iMin3 = Math.min(i11, i10 - i15);
                iArr2[i14] = iMin3;
                int iMin4 = Math.min(iE, (i10 - iMin3) - i15);
                int i16 = iArr2[i14] + i15 + iMin4;
                i13++;
                iMin = iMin4;
                i11 = i16;
                i14++;
            }
        }
        int i17 = i11 - iMin;
        if (i17 < i10) {
            int iRound = Math.round((1 + (mVar != p063g1.m.f16261r ? (-1.0f) * (-1) : -1.0f)) * ((i10 - i17) / 2.0f));
            int length3 = iArr2.length;
            for (int i18 = 0; i18 < length3; i18++) {
                iArr2[i18] = iArr2[i18] + iRound;
            }
        }
    }

    @Override // D.InterfaceC0064g
    public final void d(int i10, H0.K k7, int[] iArr, int[] iArr2) {
        b(k7, i10, iArr, p063g1.m.f16261r, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0063f) || !p063g1.f.a(this.f953r, ((C0063f) obj).f953r)) {
            return false;
        }
        Object obj2 = C0065h.f975r;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C0065h.f975r.hashCode() + (((Float.floatToIntBits(this.f953r) * 31) + 1231) * 31);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) p063g1.f.b(this.f953r)) + ", " + C0065h.f975r + ')';
    }
}
