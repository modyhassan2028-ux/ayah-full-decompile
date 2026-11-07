package Ga;

import A.C0033n;
import K9.InterfaceC0402u;
import Z.X;

/* JADX INFO: renamed from: Ga.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0198g extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f3020A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f3022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f3023t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0194c f3024u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f3025v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f3026w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ X f3027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f3028y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ X f3029z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0198g(boolean z10, C0194c c0194c, p241y9.e eVar, p241y9.c cVar, X x9, InterfaceC0402u interfaceC0402u, X x10, p241y9.a aVar, p150o9.c cVar2) {
        super(2, cVar2);
        this.f3023t = z10;
        this.f3024u = c0194c;
        this.f3025v = eVar;
        this.f3026w = cVar;
        this.f3027x = x9;
        this.f3028y = interfaceC0402u;
        this.f3029z = x10;
        this.f3020A = aVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        C0198g c0198g = new C0198g(this.f3023t, this.f3024u, this.f3025v, this.f3026w, this.f3027x, this.f3028y, this.f3029z, this.f3020A, cVar);
        c0198g.f3022s = obj;
        return c0198g;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0198g) create((D0.z) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f3021r;
        p110k9.y yVar = p110k9.y.f19095a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
            return yVar;
        }
        p110k9.a.e(obj);
        D0.z zVar = (D0.z) this.f3022s;
        if (this.f3023t) {
            p241y9.c cVar = this.f3026w;
            X x9 = this.f3027x;
            InterfaceC0402u interfaceC0402u = this.f3028y;
            X x10 = this.f3029z;
            C0033n c0033n = new C0033n(cVar, x9, interfaceC0402u, x10, 4);
            p241y9.a aVar = this.f3020A;
            C0197f c0197f = new C0197f(aVar, x10, interfaceC0402u, x9, 0);
            C0197f c0197f2 = new C0197f(aVar, x10, interfaceC0402u, x9, 1);
            this.f3021r = 1;
            Object objD = A.I.d(zVar, c0033n, c0197f, c0197f2, this.f3025v, this);
            p161p9.a aVar2 = p161p9.a.f21156r;
            if (objD != aVar2) {
                objD = yVar;
            }
            if (objD == aVar2) {
                return aVar2;
            }
        }
        return yVar;
    }
}
