package Q8;

import K9.AbstractC0405x;
import android.content.Context;

/* JADX INFO: renamed from: Q8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0471s implements S8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f7048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p101j9.a f7049c;

    public /* synthetic */ C0471s(M m10, S8.c cVar, int i10) {
        this.f7047a = i10;
        this.f7048b = m10;
        this.f7049c = cVar;
    }

    @Override // p101j9.a
    public final Object get() {
        switch (this.f7047a) {
            case 0:
                Context context = (Context) this.f7048b.f6904b;
                p150o9.h hVar = (p150o9.h) this.f7049c.get();
                p251z9.j.e(context, "appContext");
                p251z9.j.e(hVar, "blockingDispatcher");
                return C0470q.b(T8.h.f7952a, new O8.c(new G9.m(6)), AbstractC0405x.b(hVar), new C0469p(context, 0));
            case 1:
                return new F((Context) this.f7048b.f6904b, (l0) this.f7049c.get());
            default:
                return new T8.d((C0455b) this.f7049c.get(), (p150o9.h) this.f7048b.f6904b);
        }
    }

    public C0471s(S8.c cVar, M m10) {
        this.f7047a = 2;
        this.f7049c = cVar;
        this.f7048b = m10;
    }
}
