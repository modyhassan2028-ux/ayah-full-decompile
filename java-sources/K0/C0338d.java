package K0;

/* JADX INFO: renamed from: K0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0338d extends AbstractC0332a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0338d f5070c;

    @Override // K0.AbstractC0332a
    public final int[] f(int i10) {
        int length = k().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && k().charAt(i10) == '\n' && (k().charAt(i10) == '\n' || (i10 != 0 && k().charAt(i10 - 1) != '\n'))) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !t(i11)) {
            i11++;
        }
        return j(i10, i11);
    }

    @Override // K0.AbstractC0332a
    public final int[] n(int i10) {
        int length = k().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && k().charAt(i10 - 1) == '\n' && !t(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && (k().charAt(i11) == '\n' || (i11 != 0 && k().charAt(i11 - 1) != '\n'))) {
            i11--;
        }
        return j(i11, i10);
    }

    public final boolean t(int i10) {
        if (i10 <= 0 || k().charAt(i10 - 1) == '\n') {
            return false;
        }
        return i10 == k().length() || k().charAt(i10) == '\n';
    }
}
