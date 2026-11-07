package p056f2;

import B3.f;
import K0.RunnableC0354l;
import L5.c;
import M2.e;
import O2.b;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.InterfaceC0762k;
import androidx.lifecycle.K;
import androidx.lifecycle.N;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.w;
import java.util.LinkedHashMap;
import p105k2.d;

/* JADX INFO: loaded from: classes.dex */
public final class U implements InterfaceC0762k, e, V {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractComponentCallbacksC0947u f16029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.lifecycle.U f16030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RunnableC0354l f16031t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public S f16032u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public w f16033v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f16034w = null;

    public U(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, androidx.lifecycle.U u8, RunnableC0354l runnableC0354l) {
        this.f16029r = abstractComponentCallbacksC0947u;
        this.f16030s = u8;
        this.f16031t = runnableC0354l;
    }

    @Override // M2.e
    public final c b() {
        d();
        return (c) this.f16034w.f5533t;
    }

    public final void c(EnumC0766o enumC0766o) {
        this.f16033v.d(enumC0766o);
    }

    public final void d() {
        if (this.f16033v == null) {
            this.f16033v = new w(this);
            c cVar = new c(new b(this, new f(3, this)), 2);
            this.f16034w = cVar;
            cVar.H();
            this.f16031t.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0762k
    public final S e() {
        Application application;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16029r;
        S sE = abstractComponentCallbacksC0947u.e();
        if (!sE.equals(abstractComponentCallbacksC0947u.f16157j0)) {
            this.f16032u = sE;
            return sE;
        }
        if (this.f16032u == null) {
            Context applicationContext = abstractComponentCallbacksC0947u.M().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f16032u = new N(application, abstractComponentCallbacksC0947u, abstractComponentCallbacksC0947u.f16166w);
        }
        return this.f16032u;
    }

    @Override // androidx.lifecycle.InterfaceC0762k
    public final d f() {
        Application application;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16029r;
        Context applicationContext = abstractComponentCallbacksC0947u.M().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        d dVar = new d(0);
        LinkedHashMap linkedHashMap = dVar.f18958a;
        if (application != null) {
            linkedHashMap.put(Q.f12642e, application);
        }
        linkedHashMap.put(K.f12625a, abstractComponentCallbacksC0947u);
        linkedHashMap.put(K.f12626b, this);
        Bundle bundle = abstractComponentCallbacksC0947u.f16166w;
        if (bundle != null) {
            linkedHashMap.put(K.f12627c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.V
    public final androidx.lifecycle.U g() {
        d();
        return this.f16030s;
    }

    @Override // androidx.lifecycle.InterfaceC0771u
    public final w h() {
        d();
        return this.f16033v;
    }
}
