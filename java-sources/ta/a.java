package ta;

import i7.B;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f22648a = new B(13);

    public static final int a(int i10, String str) {
        char cCharAt = str.charAt(i10);
        return (cCharAt << 7) + str.charAt(i10 + 1);
    }
}
