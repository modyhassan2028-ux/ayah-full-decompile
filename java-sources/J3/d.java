package J3;

import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import T1.InterfaceC0491h;
import com.ayah.common.data.source.preference.model.PreferencesKhatmah;
import com.squareup.moshi.JsonAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0491h f4242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f4243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonAdapter f4244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X1.e f4245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0415h f4246e;

    public d(InterfaceC0491h interfaceC0491h, j jVar, JsonAdapter jsonAdapter) {
        p251z9.j.e(jVar, "notificationStore");
        p251z9.j.e(jsonAdapter, "khatmahJsonAdapter");
        this.f4242a = interfaceC0491h;
        this.f4243b = jVar;
        this.f4244c = jsonAdapter;
        this.f4245d = F3.a.f2346c;
        this.f4246e = AbstractC0419l.m(new C4.g(interfaceC0491h.b(), this, 2));
    }

    public final Object a(PreferencesKhatmah preferencesKhatmah, p150o9.c cVar) {
        Object objT = F9.n.t(this.f4242a, new A4.l(preferencesKhatmah, this, (p150o9.c) null, 3), cVar);
        return objT == p161p9.a.f21156r ? objT : p110k9.y.f19095a;
    }
}
