package F4;

import java.util.List;
import p110k9.y;
import p124m3.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements p241y9.g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ j f2359A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ d f2360B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d f2361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2363t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2364u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ List f2367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ p095j3.a f2368y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ List f2369z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, d dVar, p150o9.c cVar) {
        super(4, cVar);
        this.f2359A = jVar;
        this.f2360B = dVar;
    }

    @Override // p241y9.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        b bVar = new b(this.f2359A, this.f2360B, (p150o9.c) obj4);
        bVar.f2367x = (List) obj;
        bVar.f2368y = (p095j3.a) obj2;
        bVar.f2369z = (List) obj3;
        return bVar.invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
    
        if (r1 == r12) goto L49;
     */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F4.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
