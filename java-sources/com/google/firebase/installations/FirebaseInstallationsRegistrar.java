package com.google.firebase.installations;

import J1.c;
import J8.d;
import J8.e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p050e8.f;
import p091i8.a;
import p100j8.b;
import p100j8.h;
import p100j8.p;
import p109k8.i;
import va.g;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static e lambda$getComponents$0(b bVar) {
        return new d((f) bVar.b(f.class), bVar.f(H8.f.class), (ExecutorService) bVar.e(new p(a.class, ExecutorService.class)), new i((Executor) bVar.e(new p(p091i8.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p100j8.a> getComponents() {
        p071g9.a aVarB = p100j8.a.b(e.class);
        aVarB.f16337c = LIBRARY_NAME;
        aVarB.a(h.b(f.class));
        aVarB.a(new h(0, 1, H8.f.class));
        aVarB.a(new h(new p(a.class, ExecutorService.class), 1, 0));
        aVarB.a(new h(new p(p091i8.b.class, Executor.class), 1, 0));
        aVarB.f16340f = new c(4);
        p100j8.a aVarB2 = aVarB.b();
        H8.e eVar = new H8.e(0);
        p071g9.a aVarB3 = p100j8.a.b(H8.e.class);
        aVarB3.f16336b = 1;
        aVarB3.f16340f = new C6.b(19, eVar);
        return Arrays.asList(aVarB2, aVarB3.b(), g.l(LIBRARY_NAME, "19.0.0"));
    }
}
