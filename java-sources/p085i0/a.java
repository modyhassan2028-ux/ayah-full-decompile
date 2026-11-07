package p085i0;

import p074h0.i;
import p110k9.y;
import p251z9.j;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f16699r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f16700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f16701t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f16702u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f16703v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object[] f16704w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, m mVar, j jVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f16699r = bVar;
        this.f16700s = mVar;
        this.f16701t = jVar;
        this.f16702u = str;
        this.f16703v = obj;
        this.f16704w = objArr;
    }

    @Override // p241y9.a
    public final Object invoke() {
        boolean z10;
        b bVar = this.f16699r;
        j jVar = bVar.f16706s;
        j jVar2 = this.f16701t;
        boolean z11 = true;
        if (jVar != jVar2) {
            bVar.f16706s = jVar2;
            z10 = true;
        } else {
            z10 = false;
        }
        String str = bVar.f16707t;
        String str2 = this.f16702u;
        if (j.a(str, str2)) {
            z11 = z10;
        } else {
            bVar.f16707t = str2;
        }
        bVar.f16705r = this.f16700s;
        bVar.f16708u = this.f16703v;
        bVar.f16709v = this.f16704w;
        i iVar = bVar.f16710w;
        if (iVar != null && z11) {
            ((i) iVar).M();
            bVar.f16710w = null;
            bVar.a();
        }
        return y.f19095a;
    }
}
