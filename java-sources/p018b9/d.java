package p018b9;

import android.content.Context;
import android.support.v4.media.session.p;
import androidx.lifecycle.K;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.io.Closeable;
import java.util.Arrays;
import p029c8.n;
import p035d3.u;
import p035d3.w;
import p101j9.a;
import p105k2.e;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13338b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f13337a = i10;
        this.f13338b = obj;
    }

    @Override // androidx.lifecycle.S
    public final P a(Class cls) {
        switch (this.f13337a) {
            case 0:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            case 1:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            default:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
    }

    @Override // androidx.lifecycle.S
    public final P b(Class cls, p105k2.d dVar) {
        P p10;
        P p11;
        e eVar;
        c cVar;
        switch (this.f13337a) {
            case 0:
                final g gVar = new g();
                K.b(dVar);
                w wVar = new w();
                ((e) AbstractC0813f2.C(wVar, e.class)).getClass();
                n nVar = n.f13568x;
                a aVar = (a) nVar.get(cls);
                c cVar2 = (c) dVar.f18958a.get(f.f13339c);
                ((e) AbstractC0813f2.C(wVar, e.class)).getClass();
                Object obj = nVar.get(cls);
                if (obj == null) {
                    if (cVar2 != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (aVar == null) {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    p10 = (P) aVar.get();
                } else {
                    if (aVar != null) {
                        throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (cVar2 == null) {
                        throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                    p10 = (P) cVar2.e(obj);
                }
                Closeable closeable = new Closeable() { // from class: b9.c
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        gVar.a();
                    }
                };
                p10.getClass();
                p123m2.d dVar2 = p10.f12640a;
                if (dVar2 != null) {
                    if (dVar2.f19526d) {
                        p123m2.d.a(closeable);
                    } else {
                        synchronized (dVar2.f19523a) {
                            dVar2.f19525c.add(closeable);
                        }
                    }
                }
                return p10;
            case 1:
                X4.c cVar3 = new X4.c();
                cVar3.f9953r = dVar;
                return new p030c9.d(new p035d3.n(((u) ((p030c9.c) p000a.a.G((Context) this.f13338b, p030c9.c.class))).f15660b), cVar3);
            default:
                p251z9.e eVarA = p251z9.w.a(cls);
                e[] eVarArr = (e[]) this.f13338b;
                e[] eVarArr2 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length);
                j.e(eVarArr2, "initializers");
                int length = eVarArr2.length;
                int i10 = 0;
                while (true) {
                    p11 = null;
                    if (i10 < length) {
                        eVar = eVarArr2[i10];
                        if (!eVar.f18959a.equals(eVarA)) {
                            i10++;
                        }
                    } else {
                        eVar = null;
                    }
                }
                if (eVar != null && (cVar = eVar.f18960b) != null) {
                    p11 = (P) cVar.e(dVar);
                }
                if (p11 != null) {
                    return p11;
                }
                throw new IllegalArgumentException(("No initializer set for given class " + eVarA.b()).toString());
        }
    }

    @Override // androidx.lifecycle.S
    public final /* synthetic */ P c(p251z9.e eVar, p105k2.d dVar) {
        int i10 = this.f13337a;
        return p.a(this, eVar, dVar);
    }

    public d(e[] eVarArr) {
        this.f13337a = 2;
        j.e(eVarArr, "initializers");
        this.f13338b = eVarArr;
    }
}
