package p223x;

import A.C0033n;
import java.util.concurrent.CancellationException;
import p110k9.a;
import p110k9.y;
import p241y9.c;
import p251z9.r;
import q9.i;

/* JADX INFO: renamed from: x.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1407a extends i implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1422k f23926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r f23927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f23928t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1411c f23929u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f23930v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f23931w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f23932x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f23933y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407a(C1411c c1411c, Object obj, i0 i0Var, long j, c cVar, p150o9.c cVar2) {
        super(1, cVar2);
        this.f23929u = c1411c;
        this.f23930v = obj;
        this.f23931w = i0Var;
        this.f23932x = j;
        this.f23933y = cVar;
    }

    @Override // q9.a
    public final p150o9.c create(p150o9.c cVar) {
        return new C1407a(this.f23929u, this.f23930v, this.f23931w, this.f23932x, this.f23933y, cVar);
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        return ((C1407a) create((p150o9.c) obj)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0088 A[Catch: CancellationException -> 0x008b, TryCatch #0 {CancellationException -> 0x008b, blocks: (B:21:0x0084, B:23:0x0088, B:27:0x008f, B:26:0x008d, B:16:0x006e), top: B:33:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:26:0x008d A[Catch: CancellationException -> 0x008b, TryCatch #0 {CancellationException -> 0x008b, blocks: (B:21:0x0084, B:23:0x0088, B:27:0x008f, B:26:0x008d, B:16:0x006e), top: B:33:0x006e }] */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        C1411c c1411c;
        C1422k c1422k;
        r rVar;
        EnumC1418g enumC1418g;
        i0 i0Var = this.f23931w;
        int i10 = this.f23928t;
        C1411c c1411c2 = this.f23929u;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = this.f23927s;
            c1422k = this.f23926r;
            try {
                a.e(obj);
                c1411c = c1411c2;
                if (rVar.f24882r) {
                    enumC1418g = EnumC1418g.f23975r;
                } else {
                    enumC1418g = EnumC1418g.f23976s;
                }
                C1411c.b(c1411c);
                return new C1419h(c1422k, enumC1418g);
            } catch (CancellationException e10) {
                e = e10;
                c1411c = c1411c2;
                C1411c.b(c1411c);
                throw e;
            }
        }
        a.e(obj);
        try {
            c1411c2.f23943c.f24029t = (AbstractC1427p) c1411c2.f23941a.f24111a.e(this.f23930v);
            c1411c2.f23945e.setValue(i0Var.f24017c);
            c1411c2.f23944d.setValue(Boolean.TRUE);
            C1422k c1422k2 = c1411c2.f23943c;
            C1422k c1422k3 = new C1422k(c1422k2.f24027r, c1422k2.f24028s.getValue(), AbstractC1413d.j(c1422k2.f24029t), c1422k2.f24030u, Long.MIN_VALUE, c1422k2.f24032w);
            r rVar2 = new r();
            long j = this.f23932x;
            C0033n c0033n = new C0033n(c1411c2, c1422k3, this.f23933y, rVar2, 6);
            c1411c = c1411c2;
            try {
                this.f23926r = c1422k3;
                this.f23927s = rVar2;
                this.f23928t = 1;
                Object objD = AbstractC1413d.d(c1422k3, i0Var, j, c0033n, this);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objD == aVar) {
                    return aVar;
                }
                c1422k = c1422k3;
                rVar = rVar2;
                if (rVar.f24882r) {
                    enumC1418g = EnumC1418g.f23975r;
                } else {
                    enumC1418g = EnumC1418g.f23976s;
                }
                C1411c.b(c1411c);
                return new C1419h(c1422k, enumC1418g);
            } catch (CancellationException e11) {
                e = e11;
            }
        } catch (CancellationException e12) {
            e = e12;
            c1411c = c1411c2;
            C1411c.b(c1411c);
            throw e;
        }
        C1411c.b(c1411c);
        throw e;
    }
}
