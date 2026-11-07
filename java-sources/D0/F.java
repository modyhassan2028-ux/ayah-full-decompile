package D0;

import K9.C0389g;

/* JADX INFO: loaded from: classes.dex */
public final class F implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f1053s;

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f1052r) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C c10 = (C) this.f1053s;
                if (c10 != null) {
                    c10.f1047c = zBooleanValue;
                }
                return p110k9.y.f19095a;
            case 1:
                C0389g c0389g = (C0389g) this.f1053s;
                p110k9.y yVar = p110k9.y.f19095a;
                c0389g.resumeWith(yVar);
                return yVar;
            default:
                long j = ((p171r0.c) obj).f21387a;
                ((p243z0.a) this.f1053s).a(23);
                return p110k9.y.f19095a;
        }
    }

    public /* synthetic */ F(int i10, Object obj) {
        this.f1052r = i10;
        this.f1053s = obj;
    }
}
