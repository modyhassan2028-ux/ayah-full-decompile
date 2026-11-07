package com.squareup.moshi;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0914a f15419a = new C0914a(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D f15420b = new D(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f15421c = new D(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f15422d = new D(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D f15423e = new D(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D f15424f = new D(5);
    public static final D g = new D(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D f15425h = new D(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final D f15426i = new D(8);
    public static final D j = new D(0);

    public static int a(n nVar, String str, int i10, int i11) {
        int iF = nVar.F();
        if (iF >= i10 && iF <= i11) {
            return iF;
        }
        throw new A6.a("Expected " + str + " but was " + iF + " at path " + nVar.s());
    }
}
