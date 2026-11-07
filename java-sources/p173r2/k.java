package p173r2;

import N9.b0;
import android.os.Bundle;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f21449a;

    public k(j jVar) {
        this.f21449a = new b0(jVar, jVar.f21442s.f21493s.f1641a);
    }

    public k(Bundle bundle) {
        j.e(bundle, "state");
        bundle.setClassLoader(k.class.getClassLoader());
        this.f21449a = new b0(bundle);
    }
}
