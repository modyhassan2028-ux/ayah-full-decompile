package p197u2;

import B3.f;
import L5.c;
import O2.b;
import android.os.Bundle;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.K;
import androidx.lifecycle.N;
import androidx.lifecycle.w;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Arrays;
import p110k9.a;
import p173r2.j;
import p173r2.o;
import p173r2.v;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f22826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f22827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f22828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EnumC0767p f22829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f22830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22831f;
    public final Bundle g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f22832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22833i;
    public final w j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EnumC0767p f22834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N f22835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p110k9.o f22836m;

    public d(j jVar) {
        this.f22826a = jVar;
        this.f22827b = jVar.f21442s;
        this.f22828c = jVar.f21443t;
        this.f22829d = jVar.f21444u;
        this.f22830e = jVar.f21445v;
        this.f22831f = jVar.f21446w;
        this.g = jVar.f21447x;
        this.f22832h = new c(new b(jVar, new f(3, jVar)), 2);
        p110k9.o oVarD = a.d(new Ba.b(21));
        this.j = new w(jVar);
        this.f22834k = EnumC0767p.f12662s;
        this.f22835l = (N) oVarD.getValue();
        this.f22836m = a.d(new Ba.b(22));
    }

    public final Bundle a() {
        Bundle bundle = this.f22828c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
        bundleP.putAll(bundle);
        return bundleP;
    }

    public final void b() {
        if (!this.f22833i) {
            c cVar = this.f22832h;
            cVar.H();
            this.f22833i = true;
            if (this.f22830e != null) {
                K.c(this.f22826a);
            }
            cVar.I(this.g);
        }
        int iOrdinal = this.f22829d.ordinal();
        int iOrdinal2 = this.f22834k.ordinal();
        w wVar = this.j;
        if (iOrdinal < iOrdinal2) {
            wVar.g(this.f22829d);
        } else {
            wVar.g(this.f22834k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(p251z9.w.a(j.class).c());
        sb.append("(" + this.f22831f + ')');
        sb.append(" destination=");
        sb.append(this.f22827b);
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        return string;
    }
}
