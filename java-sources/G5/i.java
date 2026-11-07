package G5;

import java.io.Serializable;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q9.i implements p241y9.i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ j f2891A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f2892r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2893s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2894t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2895u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ p124m3.d f2896v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ p088i3.e f2897w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ z3.j f2898x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ z3.j f2899y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ p110k9.j f2900z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, p150o9.c cVar) {
        super(6, cVar);
        this.f2891A = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:37:0x0113  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013a, code lost:
    
        if (r2 == r13) goto L40;
     */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p241y9.i
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        i iVar = new i(this.f2891A, (p150o9.c) serializable);
        iVar.f2896v = (p124m3.d) obj;
        iVar.f2897w = (p088i3.e) obj2;
        iVar.f2898x = (z3.j) obj3;
        iVar.f2899y = (z3.j) obj4;
        iVar.f2900z = (p110k9.j) obj5;
        return iVar.invokeSuspend(y.f19095a);
    }
}
