package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class W2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final W2 f14155t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final W2 f14156u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ W2[] f14157v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final X2 f14158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14159s;

    /* JADX INFO: Fake field, exist only in values array */
    W2 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    W2 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    W2 EF2;

    static {
        W2 w9 = new W2("DOUBLE", 0, X2.f14167u, 1);
        W2 w10 = new W2("FLOAT", 1, X2.f14166t, 5);
        X2 x9 = X2.f14165s;
        W2 w11 = new W2("INT64", 2, x9, 0);
        W2 w12 = new W2("UINT64", 3, x9, 0);
        X2 x10 = X2.f14164r;
        W2 w13 = new W2("INT32", 4, x10, 0);
        W2 w14 = new W2("FIXED64", 5, x9, 1);
        W2 w15 = new W2("FIXED32", 6, x10, 5);
        W2 w16 = new W2("BOOL", 7, X2.f14168v, 0);
        W2 w17 = new W2("STRING", 8, X2.f14169w, 2);
        f14155t = w17;
        X2 x11 = X2.f14172z;
        W2 w18 = new W2("GROUP", 9, x11, 3);
        f14156u = w18;
        f14157v = new W2[]{w9, w10, w11, w12, w13, w14, w15, w16, w17, w18, new W2("MESSAGE", 10, x11, 2), new W2("BYTES", 11, X2.f14170x, 2), new W2("UINT32", 12, x10, 0), new W2("ENUM", 13, X2.f14171y, 0), new W2("SFIXED32", 14, x10, 5), new W2("SFIXED64", 15, x9, 1), new W2("SINT32", 16, x10, 0), new W2("SINT64", 17, x9, 0)};
    }

    public W2(String str, int i10, X2 x9, int i11) {
        super(str, i10);
        this.f14158r = x9;
        this.f14159s = i11;
    }

    public static W2[] values() {
        return (W2[]) f14157v.clone();
    }
}
