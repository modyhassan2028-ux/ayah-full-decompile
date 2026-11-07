package p130n;

import I1.InterfaceC0242a0;
import p151p.i1;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19778c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19781f;

    public i(j jVar) {
        super(4);
        this.f19781f = jVar;
        this.f19779d = false;
        this.f19780e = 0;
    }

    @Override // I1.InterfaceC0242a0
    public final void a() {
        switch (this.f19778c) {
            case 0:
                int i10 = this.f19780e + 1;
                this.f19780e = i10;
                j jVar = (j) this.f19781f;
                if (i10 == jVar.f19782a.size()) {
                    InterfaceC0242a0 interfaceC0242a0 = jVar.f19785d;
                    if (interfaceC0242a0 != null) {
                        interfaceC0242a0.a();
                    }
                    this.f19780e = 0;
                    this.f19779d = false;
                    jVar.f19786e = false;
                }
                break;
            default:
                if (!this.f19779d) {
                    ((i1) this.f19781f).f20674a.setVisibility(this.f19780e);
                }
                break;
        }
    }

    @Override // va.g, I1.InterfaceC0242a0
    public void b() {
        switch (this.f19778c) {
            case 1:
                this.f19779d = true;
                break;
        }
    }

    @Override // va.g, I1.InterfaceC0242a0
    public final void c() {
        switch (this.f19778c) {
            case 0:
                if (!this.f19779d) {
                    this.f19779d = true;
                    InterfaceC0242a0 interfaceC0242a0 = ((j) this.f19781f).f19785d;
                    if (interfaceC0242a0 != null) {
                        interfaceC0242a0.c();
                    }
                    break;
                }
                break;
            default:
                ((i1) this.f19781f).f20674a.setVisibility(0);
                break;
        }
    }

    public i(i1 i1Var, int i10) {
        super(4);
        this.f19781f = i1Var;
        this.f19780e = i10;
        this.f19779d = false;
    }
}
