package A;

import K9.InterfaceC0402u;
import java.util.concurrent.CancellationException;
import p223x.AbstractC1413d;
import p223x.C1422k;
import p223x.C1430t;
import p223x.C1431u;

/* JADX INFO: renamed from: A.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0035o extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p251z9.s f347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1422k f348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f349t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f350u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0037p f351v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ X0 f352w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0035o(float f3, C0037p c0037p, X0 x9, p150o9.c cVar) {
        super(2, cVar);
        this.f350u = f3;
        this.f351v = c0037p;
        this.f352w = x9;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        return new C0035o(this.f350u, this.f351v, this.f352w, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0035o) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        float f3;
        p251z9.s sVar;
        C1422k c1422k;
        int i10 = this.f349t;
        if (i10 == 0) {
            p110k9.a.e(obj);
            f3 = this.f350u;
            if (Math.abs(f3) > 1.0f) {
                p251z9.s sVar2 = new p251z9.s();
                sVar2.f24883r = f3;
                p251z9.s sVar3 = new p251z9.s();
                C1422k c1422kB = AbstractC1413d.b(28, f3);
                try {
                    C0037p c0037p = this.f351v;
                    C1431u c1431u = c0037p.f368a;
                    C0033n c0033n = new C0033n(sVar3, this.f352w, sVar2, c0037p);
                    this.f347r = sVar2;
                    this.f348s = c1422kB;
                    this.f349t = 1;
                    Object objD = AbstractC1413d.d(c1422kB, new C1430t(c1431u, p223x.w0.f24113a, c1422kB.f24028s.getValue(), c1422kB.f24029t), Long.MIN_VALUE, c0033n, this);
                    Object obj2 = p161p9.a.f21156r;
                    if (objD != obj2) {
                        objD = p110k9.y.f19095a;
                    }
                    if (objD == obj2) {
                        return obj2;
                    }
                    sVar = sVar2;
                    f3 = sVar.f24883r;
                } catch (CancellationException unused) {
                    sVar = sVar2;
                    c1422k = c1422kB;
                    sVar.f24883r = ((Number) c1422k.f24027r.f24112b.e(c1422k.f24029t)).floatValue();
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1422k = this.f348s;
            sVar = this.f347r;
            try {
                p110k9.a.e(obj);
            } catch (CancellationException unused2) {
                sVar.f24883r = ((Number) c1422k.f24027r.f24112b.e(c1422k.f24029t)).floatValue();
            }
            f3 = sVar.f24883r;
        }
        return new Float(f3);
    }
}
