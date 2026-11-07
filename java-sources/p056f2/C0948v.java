package p056f2;

import H1.a;
import M9.e;
import androidx.fragment.app.FragmentActivity;
import androidx.window.layout.A;
import p251z9.j;

/* JADX INFO: renamed from: f2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0948v implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16171b;

    public /* synthetic */ C0948v(int i10, Object obj) {
        this.f16170a = i10;
        this.f16171b = obj;
    }

    @Override // H1.a
    public final void accept(Object obj) {
        switch (this.f16170a) {
            case 0:
                ((FragmentActivity) this.f16171b).f12591L.l();
                break;
            case 1:
                ((FragmentActivity) this.f16171b).f12591L.l();
                break;
            default:
                e eVar = (e) this.f16171b;
                A a9 = (A) obj;
                j.d(a9, "info");
                eVar.k(a9);
                break;
        }
    }
}
