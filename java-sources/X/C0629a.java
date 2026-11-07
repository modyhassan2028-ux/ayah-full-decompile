package X;

import androidx.lifecycle.InterfaceC0771u;
import java.util.Map;
import p214w.C1401n;

/* JADX INFO: renamed from: X.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0629a implements Z.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9726d;

    public /* synthetic */ C0629a(Object obj, Object obj2, Object obj3, int i10) {
        this.f9723a = i10;
        this.f9724b = obj;
        this.f9725c = obj2;
        this.f9726d = obj3;
    }

    @Override // Z.E
    public final void a() {
        switch (this.f9723a) {
            case 0:
                ((p241y9.a) this.f9724b).invoke();
                ((InterfaceC0771u) this.f9725c).h().f((O2.a) this.f9726d);
                break;
            case 1:
                p085i0.g gVar = (p085i0.g) this.f9724b;
                u.E e10 = gVar.f16722b;
                Object obj = this.f9725c;
                Object objJ = e10.j(obj);
                p085i0.j jVar = (p085i0.j) this.f9726d;
                if (objJ == jVar) {
                    Map map = gVar.f16721a;
                    Map mapC = jVar.c();
                    if (!mapC.isEmpty()) {
                        map.put(obj, mapC);
                    } else {
                        map.remove(obj);
                    }
                }
                break;
            case 2:
                p181s2.q qVar = (p181s2.q) this.f9724b;
                p173r2.j jVar2 = (p173r2.j) this.f9725c;
                qVar.b().c(jVar2);
                ((p093j0.r) this.f9726d).remove(jVar2);
                break;
            default:
                p093j0.r rVar = (p093j0.r) this.f9724b;
                Object obj2 = this.f9725c;
                rVar.remove(obj2);
                ((C1401n) this.f9726d).f23520d.j(obj2);
                break;
        }
    }
}
