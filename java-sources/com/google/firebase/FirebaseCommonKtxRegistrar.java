package com.google.firebase;

import K9.AbstractC0399q;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import p050e8.g;
import p091i8.b;
import p091i8.c;
import p091i8.d;
import p100j8.a;
import p100j8.h;
import p100j8.p;
import p120l9.l;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        p071g9.a aVarA = a.a(new p(p091i8.a.class, AbstractC0399q.class));
        aVarA.a(new h(new p(p091i8.a.class, Executor.class), 1, 0));
        aVarA.f16340f = g.f15851s;
        a aVarB = aVarA.b();
        p071g9.a aVarA2 = a.a(new p(c.class, AbstractC0399q.class));
        aVarA2.a(new h(new p(c.class, Executor.class), 1, 0));
        aVarA2.f16340f = g.f15852t;
        a aVarB2 = aVarA2.b();
        p071g9.a aVarA3 = a.a(new p(b.class, AbstractC0399q.class));
        aVarA3.a(new h(new p(b.class, Executor.class), 1, 0));
        aVarA3.f16340f = g.f15853u;
        a aVarB3 = aVarA3.b();
        p071g9.a aVarA4 = a.a(new p(d.class, AbstractC0399q.class));
        aVarA4.a(new h(new p(d.class, Executor.class), 1, 0));
        aVarA4.f16340f = g.f15854v;
        return l.S(new a[]{aVarB, aVarB2, aVarB3, aVarA4.b()});
    }
}
