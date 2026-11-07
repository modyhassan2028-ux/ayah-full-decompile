package p085i0;

import W.C0557f1;
import Z.S;
import Z.t0;
import p074h0.i;
import p093j0.o;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class b implements t0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m f16705r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f16706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f16707t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f16708u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object[] f16709v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i f16710w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0557f1 f16711x = new C0557f1(12, this);

    public b(m mVar, j jVar, String str, Object obj, Object[] objArr) {
        this.f16705r = mVar;
        this.f16706s = jVar;
        this.f16707t = str;
        this.f16708u = obj;
        this.f16709v = objArr;
    }

    public final void a() {
        String strT;
        j jVar = this.f16706s;
        if (this.f16710w != null) {
            throw new IllegalArgumentException(("entry(" + this.f16710w + ") is not null").toString());
        }
        if (jVar != null) {
            C0557f1 c0557f1 = this.f16711x;
            Object objInvoke = c0557f1.invoke();
            if (objInvoke == null || jVar.b(objInvoke)) {
                this.f16710w = jVar.e(this.f16707t, c0557f1);
                return;
            }
            if (objInvoke instanceof o) {
                o oVar = (o) objInvoke;
                if (oVar.a() == S.f10640t || oVar.a() == S.f10643w || oVar.a() == S.f10641u) {
                    strT = "MutableState containing " + oVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strT = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strT = g.t(objInvoke);
            }
            throw new IllegalArgumentException(strT);
        }
    }

    @Override // Z.t0
    public final void b() {
        a();
    }

    @Override // Z.t0
    public final void c() {
        i iVar = this.f16710w;
        if (iVar != null) {
            ((i) iVar).M();
        }
    }

    @Override // Z.t0
    public final void d() {
        i iVar = this.f16710w;
        if (iVar != null) {
            ((i) iVar).M();
        }
    }
}
