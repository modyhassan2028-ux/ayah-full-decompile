package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements InterfaceC1057e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1057e f17883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f17885c;

    @Override // j$.time.format.InterfaceC1057e
    public final int l(v vVar, CharSequence charSequence, int i10) {
        boolean z10 = vVar.f17921c;
        if (i10 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        int length = this.f17884b + i10;
        if (length > charSequence.length()) {
            if (z10) {
                return ~i10;
            }
            length = charSequence.length();
        }
        int i11 = i10;
        while (i11 < length && vVar.a(charSequence.charAt(i11), this.f17885c)) {
            i11++;
        }
        int iL = this.f17883a.l(vVar, charSequence.subSequence(0, length), i11);
        return (iL == length || !z10) ? iL : ~(i10 + i11);
    }

    public k(InterfaceC1057e interfaceC1057e, int i10, char c10) {
        this.f17883a = interfaceC1057e;
        this.f17884b = i10;
        this.f17885c = c10;
    }

    @Override // j$.time.format.InterfaceC1057e
    public final boolean k(y yVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.f17883a.k(yVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i10 = this.f17884b;
        if (length2 <= i10) {
            for (int i11 = 0; i11 < i10 - length2; i11++) {
                sb.insert(length, this.f17885c);
            }
            return true;
        }
        throw new j$.time.b("Cannot print as output of " + length2 + " characters exceeds pad width of " + i10);
    }

    public final String toString() {
        String str;
        char c10 = this.f17885c;
        if (c10 == ' ') {
            str = ")";
        } else {
            str = ",'" + c10 + "')";
        }
        return "Pad(" + this.f17883a + "," + this.f17884b + str;
    }
}
