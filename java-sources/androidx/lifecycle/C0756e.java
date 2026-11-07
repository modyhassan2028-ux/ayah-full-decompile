package androidx.lifecycle;

import java.util.HashMap;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0756e implements InterfaceC0769s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12654r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f12655s;

    public /* synthetic */ C0756e(int i10, Object obj) {
        this.f12654r = i10;
        this.f12655s = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0769s
    public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
        switch (this.f12654r) {
            case 0:
                new HashMap();
                InterfaceC0761j[] interfaceC0761jArr = (InterfaceC0761j[]) this.f12655s;
                if (interfaceC0761jArr.length > 0) {
                    InterfaceC0761j interfaceC0761j = interfaceC0761jArr[0];
                    throw null;
                }
                if (interfaceC0761jArr.length <= 0) {
                    return;
                }
                InterfaceC0761j interfaceC0761j2 = interfaceC0761jArr[0];
                throw null;
            default:
                if (enumC0766o == EnumC0766o.ON_CREATE) {
                    interfaceC0771u.h().f(this);
                    ((L) this.f12655s).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0766o).toString());
                }
        }
    }
}
