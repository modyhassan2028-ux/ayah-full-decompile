package E8;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1977a;

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        switch (this.f1977a) {
            case 0:
                throw new C8.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                C8.e eVar = (C8.e) obj2;
                eVar.a(F8.e.g, entry.getKey());
                eVar.a(F8.e.f2526h, entry.getValue());
                return;
            default:
                throw new C8.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
