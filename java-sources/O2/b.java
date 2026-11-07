package O2;

import B3.f;
import M2.e;
import U6.C0532j;
import android.os.Bundle;
import androidx.lifecycle.EnumC0767p;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f6450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f6451b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f6455f;
    public boolean g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0532j f6452c = new C0532j(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f6453d = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6456h = true;

    public b(e eVar, f fVar) {
        this.f6450a = eVar;
        this.f6451b = fVar;
    }

    public final void a() {
        e eVar = this.f6450a;
        if (eVar.h().f12672c != EnumC0767p.f12662s) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f6454e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f6451b.invoke();
        eVar.h().a(new a(0, this));
        this.f6454e = true;
    }
}
