package W1;

import D0.C0086d;
import K9.InterfaceC0402u;
import O9.y;
import T1.B;
import T1.E;
import T1.F;
import T1.InterfaceC0486c;
import U6.C0532j;
import W.C0557f1;
import android.content.Context;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O8.c f9495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p241y9.c f9496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0402u f9497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile X1.d f9499f;

    public a(String str, O8.c cVar, p241y9.c cVar2, InterfaceC0402u interfaceC0402u) {
        p251z9.j.e(str, "name");
        this.f9494a = str;
        this.f9495b = cVar;
        this.f9496c = cVar2;
        this.f9497d = interfaceC0402u;
        this.f9498e = new Object();
    }

    public final X1.d a(Object obj, F9.f fVar) {
        X1.d dVar;
        Context context = (Context) obj;
        p251z9.j.e(context, "thisRef");
        p251z9.j.e(fVar, "property");
        X1.d dVar2 = this.f9499f;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.f9498e) {
            try {
                if (this.f9499f == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC0486c c0532j = this.f9495b;
                    p241y9.c cVar = this.f9496c;
                    p251z9.j.d(applicationContext, "applicationContext");
                    List list = (List) cVar.e(applicationContext);
                    InterfaceC0402u interfaceC0402u = this.f9497d;
                    C0086d c0086d = new C0086d(18, applicationContext, this);
                    p251z9.j.e(list, "migrations");
                    F f3 = new F(X1.h.f9852a, E.f7579r, new C0557f1(4, c0086d));
                    if (c0532j == null) {
                        c0532j = new C0532j(15);
                    }
                    this.f9499f = new X1.d(new X1.d(new B(f3, AbstractC0813f2.K(new y(list, (p150o9.c) null, 5)), c0532j, interfaceC0402u)));
                }
                dVar = this.f9499f;
                p251z9.j.b(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
