package K0;

import p223x.C1420i;
import p223x.C1423l;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f4970s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(p241y9.e eVar, int i10) {
        super(1);
        this.f4969r = i10;
        switch (i10) {
            case 1:
                p223x.v0 v0Var = p223x.w0.f24113a;
                this.f4970s = eVar;
                super(1);
                break;
            default:
                this.f4970s = eVar;
                break;
        }
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f4969r;
        p110k9.y yVar = p110k9.y.f19095a;
        p241y9.e eVar = this.f4970s;
        switch (i10) {
            case 0:
                eVar.invoke((p180s0.o) obj, null);
                break;
            default:
                C1420i c1420i = (C1420i) obj;
                Object value = c1420i.f24011e.getValue();
                p223x.v0 v0Var = p223x.w0.f24113a;
                eVar.invoke(value, Float.valueOf(((C1423l) c1420i.f24012f).f24036a));
                break;
        }
        return yVar;
    }
}
