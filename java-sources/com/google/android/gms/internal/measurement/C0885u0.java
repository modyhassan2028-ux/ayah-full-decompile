package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0885u0 implements InterfaceC0843l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0885u0 f14414b = new C0885u0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0885u0 f14415c = new C0885u0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0885u0 f14416d = new C0885u0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0885u0 f14417e = new C0885u0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0885u0 f14418f = new C0885u0(4);
    public static final C0885u0 g = new C0885u0(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0885u0 f14419h = new C0885u0(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0885u0 f14420i = new C0885u0(7);
    public static final C0885u0 j = new C0885u0(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0885u0 f14421k = new C0885u0(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0885u0 f14422l = new C0885u0(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0885u0 f14423m = new C0885u0(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0885u0 f14424n = new C0885u0(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0885u0 f14425o = new C0885u0(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14426a;

    public /* synthetic */ C0885u0(int i10) {
        this.f14426a = i10;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0843l2
    public final boolean a(int i10) {
        switch (this.f14426a) {
            case 0:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
            case 1:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 2:
                return i10 == 0 || i10 == 1 || i10 == 2;
            case 3:
                return p050e8.b.e0(i10) != 0;
            case 4:
                return i10 == 0 || i10 == 1 || i10 == 2;
            case 5:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5;
            case 6:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
            case 7:
                return i10 == 0 || i10 == 1 || i10 == 2;
            case 8:
                return i10 == 0 || i10 == 1;
            case 9:
                return i10 == 1 || i10 == 2;
            case 10:
                return android.support.v4.media.session.p.k(i10) != 0;
            case 11:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5;
            case 12:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
            default:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
        }
    }
}
