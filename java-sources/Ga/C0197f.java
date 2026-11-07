package Ga;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import Z.X;

/* JADX INFO: renamed from: Ga.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0197f extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f3016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X f3017t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f3018u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ X f3019v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0197f(p241y9.a aVar, X x9, InterfaceC0402u interfaceC0402u, X x10, int i10) {
        super(0);
        this.f3015r = i10;
        this.f3016s = aVar;
        this.f3017t = x9;
        this.f3018u = interfaceC0402u;
        this.f3019v = x10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f3015r) {
            case 0:
                B.b bVar = (B.b) this.f3017t.getValue();
                if (bVar != null) {
                    AbstractC0405x.x(this.f3018u, null, new C0195d(bVar, null, 2), 3);
                }
                X x9 = this.f3019v;
                if (((Boolean) x9.getValue()).booleanValue()) {
                    this.f3016s.invoke();
                }
                x9.setValue(Boolean.FALSE);
                break;
            default:
                B.b bVar2 = (B.b) this.f3017t.getValue();
                if (bVar2 != null) {
                    AbstractC0405x.x(this.f3018u, null, new C0195d(bVar2, null, 3), 3);
                }
                X x10 = this.f3019v;
                if (((Boolean) x10.getValue()).booleanValue()) {
                    this.f3016s.invoke();
                }
                x10.setValue(Boolean.FALSE);
                break;
        }
        return p110k9.y.f19095a;
    }
}
