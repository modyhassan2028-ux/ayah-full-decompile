package p217w2;

import E5.e;
import K0.Y;
import N9.InterfaceC0415h;
import N9.V;
import N9.k0;
import Z.C0672b;
import Z.C0681f0;
import android.os.Build;
import android.util.Log;
import p110k9.y;
import p120l9.m;
import p123m2.c;
import p150o9.h;
import p161p9.a;
import p207v2.C1363a;
import p207v2.C1370h;
import p207v2.C1374l;
import p207v2.K;
import p207v2.N;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0415h f23637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f23638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0681f0 f23639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0681f0 f23640d;

    public b(InterfaceC0415h interfaceC0415h) {
        this.f23637a = interfaceC0415h;
        a aVar = new a(this, (h) Y.f5035D.getValue(), interfaceC0415h instanceof V ? (N) m.g0(((V) interfaceC0415h).a()) : null);
        this.f23638b = aVar;
        this.f23639c = C0672b.r(aVar.b());
        C1363a c1363a = (C1363a) aVar.f23634k.f6130r.getValue();
        if (c1363a == null) {
            C1374l c1374l = d.f23644a;
            c1363a = new C1363a(c1374l.f23263a, c1374l.f23264b, c1374l.f23265c, c1374l, null);
        }
        this.f23640d = C0672b.r(c1363a);
    }

    public final Object a(i iVar) {
        Object objD = this.f23638b.f23634k.f6130r.d(new C4.b(new e(10, this), 16), iVar);
        y yVar = y.f19095a;
        a aVar = a.f21156r;
        if (objD != aVar) {
            objD = yVar;
        }
        return objD == aVar ? objD : yVar;
    }

    public final Object b(int i10) {
        Object value;
        Object value2;
        a aVar = this.f23638b;
        k0 k0Var = aVar.j;
        do {
            value = k0Var.getValue();
            ((Boolean) value).getClass();
        } while (!k0Var.l(value, Boolean.TRUE));
        aVar.f23632h = true;
        aVar.f23633i = i10;
        if (Build.ID != null && Log.isLoggable("Paging", 2)) {
            String str = "Accessing item index[" + i10 + ']';
            j.e(str, "message");
            Log.v("Paging", str, null);
        }
        p151p.V v10 = aVar.f23627b;
        if (v10 != null) {
            v10.g(aVar.f23629d.a(i10));
        }
        K k7 = aVar.f23629d;
        if (i10 < 0) {
            k7.getClass();
        } else if (i10 < k7.e()) {
            int i11 = i10 - k7.f23156c;
            if (i11 >= 0 && i11 < k7.f23155b) {
                k7.b(i11);
            }
            k0 k0Var2 = aVar.j;
            do {
                value2 = k0Var2.getValue();
                ((Boolean) value2).getClass();
            } while (!k0Var2.l(value2, Boolean.FALSE));
            return ((C1370h) this.f23639c.getValue()).get(i10);
        }
        StringBuilder sbW = c.w(i10, "Index: ", ", Size: ");
        sbW.append(k7.e());
        throw new IndexOutOfBoundsException(sbW.toString());
    }
}
