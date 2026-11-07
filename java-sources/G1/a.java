package G1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f2765e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f2766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f2769d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f2765e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f2766a = charSequence;
        this.f2767b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.f2768c - 1;
        CharSequence charSequence = this.f2766a;
        char cCharAt = charSequence.charAt(i10);
        this.f2769d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f2768c);
            this.f2768c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f2768c--;
        char c10 = this.f2769d;
        return c10 < 1792 ? f2765e[c10] : Character.getDirectionality(c10);
    }
}
