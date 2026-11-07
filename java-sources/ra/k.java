package ra;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21685r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f21686s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f21687t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f21688u;

    public /* synthetic */ k(p pVar, int i10, List list) {
        this.f21686s = pVar;
        this.f21687t = i10;
        this.f21688u = list;
    }

    private final Object b() {
        p pVar = this.f21686s;
        int i10 = this.f21687t;
        pVar.f21696B.getClass();
        try {
            pVar.f21708N.A(i10, EnumC1290b.CANCEL);
            synchronized (pVar) {
                pVar.f21710P.remove(Integer.valueOf(i10));
            }
        } catch (IOException unused) {
        }
        return p110k9.y.f19095a;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f21685r) {
            case 0:
                return b();
            default:
                p pVar = this.f21686s;
                int i10 = this.f21687t;
                pVar.f21696B.getClass();
                try {
                    pVar.f21708N.A(i10, EnumC1290b.CANCEL);
                    synchronized (pVar) {
                        pVar.f21710P.remove(Integer.valueOf(i10));
                    }
                } catch (IOException unused) {
                }
                return p110k9.y.f19095a;
        }
    }

    public /* synthetic */ k(p pVar, int i10, List list, boolean z10) {
        this.f21686s = pVar;
        this.f21687t = i10;
        this.f21688u = list;
    }
}
