package p094j1;

import J0.I;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.compose.ui.viewinterop.a;
import androidx.lifecycle.InterfaceC0771u;
import l0.r;
import p063g1.m;
import p110k9.y;
import p241y9.c;
import p241y9.e;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f18730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f18731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j f18732u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f18733v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j f18734w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final j f18735x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j f18736y;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18737r;

    static {
        int i10 = 2;
        f18730s = new j(i10, 0);
        f18731t = new j(i10, 1);
        f18732u = new j(i10, 2);
        f18733v = new j(i10, 3);
        f18734w = new j(i10, 4);
        f18735x = new j(i10, 5);
        f18736y = new j(i10, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, int i11) {
        super(i10);
        this.f18737r = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        switch (this.f18737r) {
            case 0:
                a.c((I) obj).setUpdateBlock((c) obj2);
                return y.f19095a;
            case 1:
                a.c((I) obj).setReleaseBlock((c) obj2);
                return y.f19095a;
            case 2:
                a.c((I) obj).setModifier((r) obj2);
                return y.f19095a;
            case 3:
                a.c((I) obj).setDensity((p063g1.c) obj2);
                return y.f19095a;
            case 4:
                a.c((I) obj).setLifecycleOwner((InterfaceC0771u) obj2);
                return y.f19095a;
            case 5:
                a.c((I) obj).setSavedStateRegistryOwner((M2.e) obj2);
                return y.f19095a;
            default:
                ViewFactoryHolder viewFactoryHolderC = a.c((I) obj);
                int iOrdinal = ((m) obj2).ordinal();
                if (iOrdinal != 0) {
                    i10 = 1;
                    if (iOrdinal != 1) {
                        throw new A6.a();
                    }
                } else {
                    i10 = 0;
                }
                viewFactoryHolderC.setLayoutDirection(i10);
                return y.f19095a;
        }
    }
}
