package W;

/* JADX INFO: renamed from: W.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0561g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X.s f9137b;

    public C0561g1(p063g1.c cVar, EnumC0565h1 enumC0565h1, p241y9.c cVar2, boolean z10) {
        this.f9136a = z10;
        if (z10 && enumC0565h1 == EnumC0565h1.f9158r) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.f9137b = new X.s(enumC0565h1, new C0553e1(cVar, 0), new C0557f1(0, cVar), AbstractC0549d1.f9026b, cVar2);
    }

    public final Object a(q9.i iVar) {
        X.s sVar = this.f9137b;
        Object objC = androidx.compose.material3.internal.a.c(sVar, EnumC0565h1.f9159s, sVar.j.g(), iVar);
        return objC == p161p9.a.f21156r ? objC : p110k9.y.f19095a;
    }

    public final EnumC0565h1 b() {
        return (EnumC0565h1) this.f9137b.g.getValue();
    }

    public final Object c(q9.i iVar) {
        if (this.f9136a) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        X.s sVar = this.f9137b;
        Object objC = androidx.compose.material3.internal.a.c(sVar, EnumC0565h1.f9158r, sVar.j.g(), iVar);
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        if (objC != aVar) {
            objC = yVar;
        }
        return objC == aVar ? objC : yVar;
    }

    public final Object d(q9.i iVar) {
        X.s sVar = this.f9137b;
        Object objC = androidx.compose.material3.internal.a.c(sVar, EnumC0565h1.f9160t, sVar.j.g(), iVar);
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        if (objC != aVar) {
            objC = yVar;
        }
        return objC == aVar ? objC : yVar;
    }
}
