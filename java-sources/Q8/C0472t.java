package Q8;

import K9.AbstractC0405x;
import T1.InterfaceC0491h;
import android.content.Context;

/* JADX INFO: renamed from: Q8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0472t implements S8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7050a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p101j9.a f7051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S8.c f7052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p101j9.a f7053d;

    public C0472t(M m10, S8.c cVar, S8.c cVar2) {
        this.f7051b = m10;
        this.f7053d = cVar;
        this.f7052c = cVar2;
    }

    @Override // p101j9.a
    public final Object get() {
        switch (this.f7050a) {
            case 0:
                Context context = (Context) ((M) this.f7053d).f6904b;
                p150o9.h hVar = (p150o9.h) this.f7051b.get();
                L l10 = (L) this.f7052c.get();
                p251z9.j.e(context, "appContext");
                p251z9.j.e(hVar, "blockingDispatcher");
                p251z9.j.e(l10, "sessionDataSerializer");
                return C0470q.b(l10, new O8.c(new E5.a(7, l10)), AbstractC0405x.b(hVar), new C0469p(context, 1));
            default:
                return new T8.n((p150o9.h) this.f7051b.get(), (k0) this.f7053d.get(), (InterfaceC0491h) this.f7052c.get());
        }
    }

    public C0472t(M m10, M m11, S8.c cVar) {
        this.f7053d = m10;
        this.f7051b = m11;
        this.f7052c = cVar;
    }
}
