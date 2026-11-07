package com.google.firebase.analytics.connector.internal;

import U6.C0532j;
import U6.y;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0846m0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p050e8.f;
import p070g8.a;
import p100j8.b;
import p100j8.h;
import p100j8.j;
import va.g;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(b bVar) {
        f fVar = (f) bVar.b(f.class);
        Context context = (Context) bVar.b(Context.class);
        G8.b bVar2 = (G8.b) bVar.b(G8.b.class);
        y.f(fVar);
        y.f(context);
        y.f(bVar2);
        y.f(context.getApplicationContext());
        if (p070g8.b.f16330c == null) {
            synchronized (p070g8.b.class) {
                try {
                    if (p070g8.b.f16330c == null) {
                        Bundle bundle = new Bundle(1);
                        fVar.a();
                        if ("[DEFAULT]".equals(fVar.f15844b)) {
                            ((j) bVar2).a();
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.g());
                        }
                        p070g8.b.f16330c = new p070g8.b(C0846m0.c(context, bundle).f14358b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return p070g8.b.f16330c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<p100j8.a> getComponents() {
        p071g9.a aVarB = p100j8.a.b(a.class);
        aVarB.a(h.b(f.class));
        aVarB.a(h.b(Context.class));
        aVarB.a(h.b(G8.b.class));
        aVarB.f16340f = C0532j.f8281v;
        aVarB.e();
        return Arrays.asList(aVarB.b(), g.l("fire-analytics", "23.0.0"));
    }
}
