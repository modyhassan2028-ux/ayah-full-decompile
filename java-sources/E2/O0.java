package E2;

/* JADX INFO: loaded from: classes.dex */
public final class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1600e;

    public final boolean a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f1596a;
        int i14 = 2;
        if ((i13 & 7) != 0) {
            int i15 = this.f1599d;
            int i16 = this.f1597b;
            if (i15 > i16) {
                i12 = 1;
            } else {
                i12 = i15 == i16 ? 2 : 4;
            }
            if ((i12 & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 112) != 0) {
            int i17 = this.f1599d;
            int i18 = this.f1598c;
            if (i17 > i18) {
                i11 = 1;
            } else {
                i11 = i17 == i18 ? 2 : 4;
            }
            if (((i11 << 4) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 1792) != 0) {
            int i19 = this.f1600e;
            int i20 = this.f1597b;
            if (i19 > i20) {
                i10 = 1;
            } else {
                i10 = i19 == i20 ? 2 : 4;
            }
            if (((i10 << 8) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 28672) != 0) {
            int i21 = this.f1600e;
            int i22 = this.f1598c;
            if (i21 > i22) {
                i14 = 1;
            } else if (i21 != i22) {
                i14 = 4;
            }
            if ((i13 & (i14 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
