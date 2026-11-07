package B2;

import K9.AbstractC0405x;
import K9.C0389g;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends AbstractC0813f2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final MeasurementManager f595s;

    public e(MeasurementManager measurementManager) {
        this.f595s = measurementManager;
    }

    public static Object b0(e eVar, a aVar, p150o9.c cVar) {
        new C0389g(1, AbstractC0813f2.H(cVar)).s();
        MeasurementManager measurementManager = eVar.f595s;
        throw null;
    }

    public static Object c0(e eVar, p150o9.c cVar) {
        C0389g c0389g = new C0389g(1, AbstractC0813f2.H(cVar));
        c0389g.s();
        eVar.f595s.getMeasurementApiStatus(new c(0), new E1.b(c0389g));
        return c0389g.r();
    }

    public static Object e0(e eVar, f fVar, p150o9.c cVar) {
        Object objJ = AbstractC0405x.j(new d(eVar, null, 0), cVar);
        return objJ == p161p9.a.f21156r ? objJ : y.f19095a;
    }

    public static Object f0(e eVar, Uri uri, InputEvent inputEvent, p150o9.c cVar) {
        C0389g c0389g = new C0389g(1, AbstractC0813f2.H(cVar));
        c0389g.s();
        eVar.f595s.registerSource(uri, inputEvent, new c(0), new E1.b(c0389g));
        Object objR = c0389g.r();
        return objR == p161p9.a.f21156r ? objR : y.f19095a;
    }

    public static Object g0(e eVar, Uri uri, p150o9.c cVar) {
        C0389g c0389g = new C0389g(1, AbstractC0813f2.H(cVar));
        c0389g.s();
        eVar.f595s.registerTrigger(uri, new c(0), new E1.b(c0389g));
        Object objR = c0389g.r();
        return objR == p161p9.a.f21156r ? objR : y.f19095a;
    }

    public static Object i0(e eVar, g gVar, p150o9.c cVar) {
        new C0389g(1, AbstractC0813f2.H(cVar)).s();
        MeasurementManager measurementManager = eVar.f595s;
        throw null;
    }

    public static Object k0(e eVar, h hVar, p150o9.c cVar) {
        new C0389g(1, AbstractC0813f2.H(cVar)).s();
        MeasurementManager measurementManager = eVar.f595s;
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public Object F(p150o9.c cVar) {
        return c0(this, cVar);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public Object R(Uri uri, InputEvent inputEvent, p150o9.c cVar) {
        return f0(this, uri, inputEvent, cVar);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public Object S(Uri uri, p150o9.c cVar) {
        return g0(this, uri, cVar);
    }

    public Object a0(a aVar, p150o9.c cVar) {
        return b0(this, aVar, cVar);
    }

    public Object d0(f fVar, p150o9.c cVar) {
        return e0(this, fVar, cVar);
    }

    public Object h0(g gVar, p150o9.c cVar) {
        return i0(this, gVar, cVar);
    }

    public Object j0(h hVar, p150o9.c cVar) {
        return k0(this, hVar, cVar);
    }
}
