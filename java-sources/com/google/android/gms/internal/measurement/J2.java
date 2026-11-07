package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class J2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T1 f14058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f14060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14061d;

    public J2(T1 t2, String str, Object[] objArr) {
        this.f14058a = t2;
        this.f14059b = str;
        this.f14060c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f14061d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f14061d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final int a() {
        int i10 = this.f14061d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
