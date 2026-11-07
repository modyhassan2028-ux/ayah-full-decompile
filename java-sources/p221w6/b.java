package p221w6;

import Z.C0690k;
import Z.C0698o;
import Z.S;
import com.ayah.ui.util.view.PermissionsRequestWrapper;
import p015b4.f;
import p074h0.j;
import p110k9.y;
import p227x3.c;
import p241y9.a;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23746r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PermissionsRequestWrapper f23747s;

    public /* synthetic */ b(PermissionsRequestWrapper permissionsRequestWrapper, int i10) {
        this.f23746r = i10;
        this.f23747s = permissionsRequestWrapper;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f23746r;
        y yVar = y.f19095a;
        final PermissionsRequestWrapper permissionsRequestWrapper = this.f23747s;
        final int i11 = 0;
        final int i12 = 1;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = PermissionsRequestWrapper.f13944u;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    p005a4.e.a(false, j.d(479261857, new b(permissionsRequestWrapper, i12), c0698o), c0698o, 48);
                }
                break;
            default:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = PermissionsRequestWrapper.f13944u;
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                } else {
                    c cVar = permissionsRequestWrapper.f13945r;
                    String str = cVar.f24369a;
                    String str2 = cVar.f24370b;
                    boolean zI = c0698o2.i(permissionsRequestWrapper);
                    Object objH = c0698o2.H();
                    S s10 = C0690k.f10683a;
                    if (zI || objH == s10) {
                        objH = new a() { // from class: w6.c
                            @Override // p241y9.a
                            public final Object invoke() throws Exception {
                                switch (i11) {
                                    case 0:
                                        PermissionsRequestWrapper permissionsRequestWrapper2 = permissionsRequestWrapper;
                                        E5.c cVar2 = permissionsRequestWrapper2.f13946s;
                                        permissionsRequestWrapper2.f13945r.getClass();
                                        cVar2.e("android.permission.POST_NOTIFICATIONS");
                                        break;
                                    default:
                                        permissionsRequestWrapper.f13947t.invoke();
                                        break;
                                }
                                return y.f19095a;
                            }
                        };
                        c0698o2.e0(objH);
                    }
                    a aVar = (a) objH;
                    boolean zI2 = c0698o2.i(permissionsRequestWrapper);
                    Object objH2 = c0698o2.H();
                    if (zI2 || objH2 == s10) {
                        objH2 = new a() { // from class: w6.c
                            @Override // p241y9.a
                            public final Object invoke() throws Exception {
                                switch (i12) {
                                    case 0:
                                        PermissionsRequestWrapper permissionsRequestWrapper2 = permissionsRequestWrapper;
                                        E5.c cVar2 = permissionsRequestWrapper2.f13946s;
                                        permissionsRequestWrapper2.f13945r.getClass();
                                        cVar2.e("android.permission.POST_NOTIFICATIONS");
                                        break;
                                    default:
                                        permissionsRequestWrapper.f13947t.invoke();
                                        break;
                                }
                                return y.f19095a;
                            }
                        };
                        c0698o2.e0(objH2);
                    }
                    f.b(str, str2, aVar, (a) objH2, c0698o2, 0);
                }
                break;
        }
        return yVar;
    }
}
