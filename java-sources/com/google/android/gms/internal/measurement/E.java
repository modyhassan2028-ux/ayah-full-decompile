package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Aa.a f14015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Aa.a f14016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.support.v4.media.session.r f14017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0879t f14018d;

    public E() {
        Aa.a aVar = new Aa.a(9);
        this.f14015a = aVar;
        this.f14016b = ((Aa.a) aVar.f555s).Q();
        this.f14017c = new android.support.v4.media.session.r(29);
        this.f14018d = new C0879t(3);
        final int i10 = 1;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f14189b;

            {
                this.f14189b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i10) {
                    case 0:
                        return new L1(this.f14189b.f14017c);
                    default:
                        return new L1(this.f14189b.f14018d);
                }
            }
        };
        C0902x2 c0902x2 = (C0902x2) aVar.f557u;
        ((HashMap) c0902x2.f14509r).put("internal.registerCallback", callable);
        final int i11 = 0;
        ((HashMap) c0902x2.f14509r).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f14189b;

            {
                this.f14189b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i11) {
                    case 0:
                        return new L1(this.f14189b.f14017c);
                    default:
                        return new L1(this.f14189b.f14018d);
                }
            }
        });
    }

    public final boolean a(C0790b c0790b) throws S {
        android.support.v4.media.session.r rVar = this.f14017c;
        try {
            rVar.f11364s = c0790b;
            rVar.f11365t = c0790b.clone();
            ((ArrayList) rVar.f11366u).clear();
            ((Aa.a) this.f14015a.f556t).S("runtime.counter", new C0815g(Double.valueOf(0.0d)));
            this.f14018d.d(this.f14016b.Q(), rVar);
            return (((C0790b) rVar.f11365t).equals((C0790b) rVar.f11364s) && ((ArrayList) rVar.f11366u).isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new S(th);
        }
    }

    public final void b(C0901x1 c0901x1) {
        AbstractC0820h abstractC0820h;
        try {
            Aa.a aVar = this.f14015a;
            this.f14016b = ((Aa.a) aVar.f555s).Q();
            if (aVar.M(this.f14016b, (C0906y1[]) c0901x1.p().toArray(new C0906y1[0])) instanceof C0810f) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C0896w1 c0896w1 : c0901x1.q().p()) {
                List listQ = c0896w1.q();
                String strP = c0896w1.p();
                Iterator it = listQ.iterator();
                while (it.hasNext()) {
                    InterfaceC0850n interfaceC0850nM = aVar.M(this.f14016b, (C0906y1) it.next());
                    if (!(interfaceC0850nM instanceof C0835k)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    Aa.a aVar2 = this.f14016b;
                    if (aVar2.R(strP)) {
                        InterfaceC0850n interfaceC0850nU = aVar2.U(strP);
                        if (!(interfaceC0850nU instanceof AbstractC0820h)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strP)));
                        }
                        abstractC0820h = (AbstractC0820h) interfaceC0850nU;
                    } else {
                        abstractC0820h = null;
                    }
                    if (abstractC0820h == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strP)));
                    }
                    abstractC0820h.a(this.f14016b, Collections.singletonList(interfaceC0850nM));
                }
            }
        } catch (Throwable th) {
            throw new S(th);
        }
    }
}
