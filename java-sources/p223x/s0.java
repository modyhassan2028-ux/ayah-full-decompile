package p223x;

import Z.E;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f24098b;

    public /* synthetic */ s0(q0 q0Var, int i10) {
        this.f24097a = i10;
        this.f24098b = q0Var;
    }

    @Override // Z.E
    public final void a() {
        switch (this.f24097a) {
            case 0:
                q0 q0Var = this.f24098b;
                q0Var.i();
                q0Var.f24065a.n();
                break;
            default:
                q0 q0Var2 = this.f24098b;
                q0Var2.i();
                q0Var2.f24065a.n();
                break;
        }
    }
}
