package Z9;

import com.google.android.gms.internal.measurement.B1;

/* JADX INFO: loaded from: classes.dex */
public final class k implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f11053a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W9.g f11054b;

    static {
        W9.f[] fVarArr = new W9.f[0];
        G9.m mVar = new G9.m(8);
        p251z9.j.e("kotlinx.serialization.json.JsonElement", "serialName");
        if (H9.o.e1("kotlinx.serialization.json.JsonElement")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        W9.i iVar = W9.i.f9679c;
        W9.c cVar = W9.c.f9660c;
        if (cVar.equals(iVar)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        W9.a aVar = new W9.a("kotlinx.serialization.json.JsonElement");
        mVar.e(aVar);
        f11054b = new W9.g("kotlinx.serialization.json.JsonElement", cVar, aVar.f9655b.size(), p120l9.l.o0(fVarArr), aVar);
    }

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        i iVar = (i) obj;
        p251z9.j.e(iVar, "value");
        B1.f(nVar);
        if (iVar instanceof w) {
            nVar.p(x.f11068a, iVar);
        } else if (iVar instanceof s) {
            nVar.p(u.f11066a, iVar);
        } else {
            if (!(iVar instanceof d)) {
                throw new A6.a();
            }
            nVar.p(f.f11050a, iVar);
        }
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        return B1.g(bVar).H0();
    }

    @Override // U9.a
    public final W9.f d() {
        return f11054b;
    }
}
