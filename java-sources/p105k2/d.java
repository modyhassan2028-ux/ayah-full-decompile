package p105k2;

import java.util.LinkedHashMap;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {
    public d(c cVar) {
        j.e(cVar, "initialExtras");
        LinkedHashMap linkedHashMap = cVar.f18958a;
        j.e(linkedHashMap, "initialExtras");
        this.f18958a.putAll(linkedHashMap);
    }

    @Override // p105k2.c
    public final Object a(b bVar) {
        return this.f18958a.get(bVar);
    }

    public /* synthetic */ d(int i10) {
        this(a.f18957b);
    }
}
