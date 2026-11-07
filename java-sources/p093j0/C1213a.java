package p093j0;

import p110k9.y;
import p241y9.c;
import p251z9.k;

/* JADX INFO: renamed from: j0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1213a extends k implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1213a f18622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1213a f18623t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18624r;

    static {
        int i10 = 1;
        f18622s = new C1213a(i10, 0);
        f18623t = new C1213a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1213a(int i10, int i11) {
        super(i10);
        this.f18624r = i11;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f18624r) {
            case 0:
                synchronized (n.f18661b) {
                    ?? r10 = n.f18666h;
                    int size = r10.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((c) r10.get(i10)).e(obj);
                    }
                }
                return y.f19095a;
            default:
                return y.f19095a;
        }
    }
}
