package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1055c implements InterfaceC1057e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f17866a;

    public C1055c(char c10) {
        this.f17866a = c10;
    }

    @Override // j$.time.format.InterfaceC1057e
    public final boolean k(y yVar, StringBuilder sb) {
        sb.append(this.f17866a);
        return true;
    }

    @Override // j$.time.format.InterfaceC1057e
    public final int l(v vVar, CharSequence charSequence, int i10) {
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        char cCharAt = charSequence.charAt(i10);
        char c10 = this.f17866a;
        return (cCharAt == c10 || (!vVar.f17920b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c10) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c10)))) ? i10 + 1 : ~i10;
    }

    public final String toString() {
        char c10 = this.f17866a;
        if (c10 == '\'') {
            return "''";
        }
        return "'" + c10 + "'";
    }
}
