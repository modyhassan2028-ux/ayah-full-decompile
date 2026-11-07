package p189t3;

import C4.g;
import J3.d;
import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.U;
import N9.h0;
import com.ayah.common.data.source.preference.model.PreferencesKhatmah;
import j$.time.format.DateTimeFormatter;
import p095j3.a;
import p110k9.y;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f22586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f22587b;

    public b(d dVar) {
        j.e(dVar, "khatmahStore");
        this.f22586a = dVar;
        this.f22587b = AbstractC0419l.v(new g(dVar.f4246e, this, 22), AbstractC0405x.b(AbstractC0405x.e()), new h0(), null);
    }

    public final Object a(a aVar, i iVar) {
        String str = aVar.f18752b.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String strName = aVar.f18751a.name();
        j.b(str);
        Object objA = this.f22586a.a(new PreferencesKhatmah(aVar.f18753c, aVar.f18754d, strName, str), iVar);
        return objA == p161p9.a.f21156r ? objA : y.f19095a;
    }
}
