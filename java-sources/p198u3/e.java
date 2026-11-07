package p198u3;

import A.C0029l;
import A3.g;
import B9.a;
import K9.AbstractC0405x;
import K9.EnumC0403v;
import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import N9.T;
import N9.Y;
import N9.b0;
import N9.c0;
import N9.e0;
import P9.d;
import P9.t;
import com.ayah.common.data.source.database.AyahDatabase;
import p150o9.c;
import p150o9.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f22894b;

    public e(AyahDatabase ayahDatabase) {
        j.e(ayahDatabase, "ayahDatabase");
        d dVarB = AbstractC0405x.b(AbstractC0405x.e());
        g gVarL = ayahDatabase.l();
        this.f22893a = gVarL;
        b0 b0VarK = AbstractC0419l.k(a.k(gVarL.f495a, new String[]{"favorites"}, new A3.d(1)));
        Y yA = AbstractC0419l.a(1, b0VarK.f6164a, (M9.a) b0VarK.f6166c);
        h hVar = (h) b0VarK.f6167d;
        InterfaceC0415h interfaceC0415h = (InterfaceC0415h) b0VarK.f6165b;
        t tVar = AbstractC0419l.f6214b;
        e0 e0Var = c0.f6169a;
        e0 e0Var2 = c0.f6170b;
        AbstractC0405x.w(dVarB, hVar, e0Var2.equals(e0Var) ? EnumC0403v.f5401r : EnumC0403v.f5404u, new C0029l(e0Var2, interfaceC0415h, yA, tVar, (c) null));
        this.f22894b = new T(yA);
    }
}
