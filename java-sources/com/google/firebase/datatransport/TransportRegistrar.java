package com.google.firebase.datatransport;

import A8.c;
import B6.e;
import C6.a;
import E6.v;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p100j8.b;
import p100j8.h;
import p100j8.p;
import va.g;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(b bVar) {
        v.b((Context) bVar.b(Context.class));
        return v.a().c(a.f767f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$1(b bVar) {
        v.b((Context) bVar.b(Context.class));
        return v.a().c(a.f767f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$2(b bVar) {
        v.b((Context) bVar.b(Context.class));
        return v.a().c(a.f766e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p100j8.a> getComponents() {
        p071g9.a aVarB = p100j8.a.b(e.class);
        aVarB.f16337c = LIBRARY_NAME;
        aVarB.a(h.b(Context.class));
        aVarB.f16340f = new c(0);
        p100j8.a aVarB2 = aVarB.b();
        p071g9.a aVarA = p100j8.a.a(new p(A8.a.class, e.class));
        aVarA.a(h.b(Context.class));
        aVarA.f16340f = new c(1);
        p100j8.a aVarB3 = aVarA.b();
        p071g9.a aVarA2 = p100j8.a.a(new p(A8.b.class, e.class));
        aVarA2.a(h.b(Context.class));
        aVarA2.f16340f = new c(2);
        return Arrays.asList(aVarB2, aVarB3, aVarA2.b(), g.l(LIBRARY_NAME, "19.0.0"));
    }
}
